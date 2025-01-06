package Package;

public class ConstructorAssignment {

	public ConstructorAssignment(int a,int b,int c) {
		
		System.out.println("Three parameterized constructor");
	}
	
	public ConstructorAssignment() {
		this(1,2,3);
		System.out.println("Default constructor");
	}
	
	public ConstructorAssignment(int a) {
		this();
		System.out.println("One parameterized constructor");
	}
	
	public ConstructorAssignment(int a,int b) {
		this(1);
		System.out.println("Two parameterized constructor");
	}
	public static void main(String[] args) {
		ConstructorAssignment obj = new ConstructorAssignment(1,2);
	}

}
