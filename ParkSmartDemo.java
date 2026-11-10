import java.util.*;
import java.nio.file.*;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

class Vehicle {
    private final String number, owner, type;
    Vehicle(String number, String owner, String type) {
        this.number = number.trim().toUpperCase();
        this.owner = owner.trim();
        this.type = type;
    }
    String getNumber() { return number; }
    String getOwner() { return owner; }
    String getType() { return type; }
    public String toString() { return number + " | " + owner + " | " + type; }
}

class ParkingSlot {
    private final String id;
    private boolean occupied;
    ParkingSlot(String id) { this.id = id; }
    String getId() { return id; }
    boolean isAvailable() { return !occupied; }
    void setOccupied(boolean value) { occupied = value; }
}

public class Main {
    static final double HOURLY_RATE = 30.0;
    static final List<Vehicle> vehicles = new ArrayList<>();
    static final Map<String, ParkingSlot> slots = new LinkedHashMap<>();
    static final Set<String> zones = new HashSet<>(Arrays.asList("A", "B"));
    static final List<String> history = new ArrayList<>();
    static final Path FILE = Paths.get("parksmart-history.txt");

    static ParkingSlot findFreeSlot() {
        for (ParkingSlot slot : slots.values()) if (slot.isAvailable()) return slot;
        return null;
    }
    static double calculateFee(long minutes) {
        long hours = Math.max(1, (minutes + 59) / 60);
        return hours * HOURLY_RATE;
    }
    static void saveHistory(String line) {
        history.add(line);
        try {
            Files.write(FILE, (line + System.lineSeparator()).getBytes(),
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("History could not be saved; session is shown on screen.");
        }
    }
    static void showReport() {
        long free = slots.values().stream().filter(ParkingSlot::isAvailable).count();
        long total = slots.size();
        System.out.println("Slots total: " + total + " | Free: " + free + " | Occupied: " + (total-free));
        System.out.println("Registered vehicles: " + vehicles.size());
        System.out.println("Zones: " + zones.stream().sorted().collect(Collectors.joining(", ")));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        slots.put("A-01", new ParkingSlot("A-01"));
        slots.put("A-02", new ParkingSlot("A-02"));
        slots.put("B-01", new ParkingSlot("B-01"));
        boolean running = true;
        while (running) {
            System.out.println("\n=== PARKSMART MENU ===");
            System.out.println("1. Register and park  2. Exit and pay  3. Report  0. Quit");
            System.out.print("Choose: ");
            int choice;
            try { choice = Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("Enter a menu number."); continue; }
            switch (choice) {
                case 1:
                    System.out.print("Vehicle number: "); String number = sc.nextLine().trim();
                    if (number.isEmpty()) { System.out.println("Vehicle number is required."); break; }
                    System.out.print("Customer name: "); String owner = sc.nextLine().trim();
                    System.out.print("Type (Car/Bike/Old car): "); String type = sc.nextLine().trim();
                    ParkingSlot slot = findFreeSlot();
                    if (slot == null) { System.out.println("Parking full. Please wait or try another facility."); break; }
                    Vehicle v = new Vehicle(number, owner, type.isEmpty() ? "Car" : type);
                    vehicles.add(v); slot.setOccupied(true);
                    System.out.println("Registered: " + v);
                    System.out.println("Allocated slot: " + slot.getId());
                    System.out.println("Entry recorded. Keep your ticket and slot ID.");
                    saveHistory("ENTRY," + v.getNumber() + "," + slot.getId());
                    break;
                case 2:
                    System.out.print("Slot ID to release (A-01/A-02/B-01): "); String id = sc.nextLine().trim().toUpperCase();
                    ParkingSlot used = slots.get(id);
                    if (used == null || used.isAvailable()) { System.out.println("No active vehicle found in that slot."); break; }
                    System.out.print("Parking minutes (demo): ");
                    try {
                        long mins = Long.parseLong(sc.nextLine().trim());
                        if (mins < 0) throw new NumberFormatException();
                        double fee = calculateFee(mins);
                        System.out.printf(Locale.US, "Duration: %d minutes | Fee: Rs. %.2f%n", mins, fee);
                        System.out.println("Payment recorded (demo). Thank you!");
                        used.setOccupied(false); saveHistory("EXIT," + id + ",fee=" + fee);
                        System.out.println("Slot " + id + " is AVAILABLE again.");
                    } catch (NumberFormatException e) { System.out.println("Minutes must be a non-negative whole number."); }
                    break;
                case 3: showReport(); break;
                case 0: running = false; System.out.println("ParkSmart closed. Goodbye!"); break;
                default: System.out.println("Invalid choice. Select 1, 2, 3 or 0.");
            }
        }
        sc.close();
    }
}