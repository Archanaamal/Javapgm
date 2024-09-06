package oopspgms;
class School
{
	public void details()
	{
		System.out.println("School : XYZ");
		System.out.println("Place : Kochi");
	}
}
class Teacher extends School
{
	public void teacher()
	{
		System.out.println("Teacher : Anu");
		System.out.println("Subject : Maths");
	}
}
class Student extends Teacher
{
	public void student()
	{
		System.out.println("Student : Arun");
		System.out.println("Class : 10");
	}
}


public class InheritanceMutilevel {

	public static void main(String[] args) {
		Student std=new Student();
		std.details();
		std.teacher();
		std.student();

	}

}
