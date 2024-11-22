package anonymousObject;

public class Student {
	String name ="Mohan";

	public void greet() {
		System.out.println("Hi "+name);
	}
	public void attend() {
		System.out.println("Student attended");
	}

	//reference variable
	//reference object
	public static void main(String[] args) {
		int i ;
		i =10;
		//Student s1; 
		//s1 = new Student();
		//Student s1 = new Student();
		//s1.greet();


		new Student().greet();
		Student s1 = new Student();
		s1.greet();
		s1.attend();

	}

}


// without reference  is called anonymous object
