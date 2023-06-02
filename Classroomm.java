package oops;

public class Classroomm 
{
	int classroom_no;
	Student s;
	
	Classroomm(int classroom_no,Student s)
	{
		this.classroom_no=classroom_no;
		this.s=s;
	}
	public void classroommDetails() 
	{
		System.out.println(s.sname);
		System.out.println(s.rollno);
		System.out.println(classroom_no);
	}
}
