package Package;

public class Student {
	
int rollnum;
int age;

public void display1()

{  System.out.println("Welcome to all of you");
	}
public void display2()

{  System.out.println("Automation is very easy");
	}

public static void main(String[] args)
{
Student obj=new Student();
obj.display1();
obj.display2();
obj.rollnum=1;
obj.age=20;
System.out.println("Roll Number = "+ obj.rollnum);
System.out.println("Age = "+ obj.age);
	}

}
