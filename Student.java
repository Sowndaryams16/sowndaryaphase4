package sowndarya;


public class Student {

	
	int id;
	String name;
	String branch;
	long mobile;
	
	void attendSession()  //behavior of student		
	{
		System.out.println(name+"attends session regularly");
	}
	void sitInExam()  //behavior of stud
	{
		
	}
	void participateInTest() //behavior of student
	{
		
	}
	
	public static void main(String[] args)
	{
	Student reena=new Student();
	reena.id=112;
	reena.name="reena";
	reena.branch="CSE";
	reena.mobile=7676352127L;
	reena.attendSession();
	System.out.println(reena.id);
	System.out.println(reena.name);
	System.out.println(reena.branch);
	System.out.println(reena.mobile);

	}
}
