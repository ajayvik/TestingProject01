package automation;

public class Assigment 
{
int rollno;
int age;
public void method1()
{
	System.out.println("please enter the roll no");
}
public void method2()
{
	System.out.println("please enter the age");
}
public static void main(String[] args)
{
	Assigment obj=new Assigment();
	obj.method1();
	obj.method2();
	obj.rollno=123;
	System.out.println("Role numner showing="+obj.rollno);
	obj.age=14;
	System.out.println("age ="+obj.age);
	
}
}
