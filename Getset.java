package student;

class Student {
	private int rollno;
	private String name;

	public void setrollno(int r) {
		rollno = r;
	}

	public int getrollno() {
		return rollno;
	}

	public void setname(String n) {
		name = n;
	}

	public String getname() {
		return name;
	}
}

public class Getset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setrollno(101);

		s.setname("yaswanth");
		System.out.println("Roll Number:" + s.getrollno());
		System.out.println("Name:" + s.getname());

	}

}
