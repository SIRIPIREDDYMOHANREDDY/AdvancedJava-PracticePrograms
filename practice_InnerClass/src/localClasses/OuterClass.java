package localClasses;


//local classes
public class OuterClass {
private int  id=100;
public static void main(String[] args) {
	int salary = 5000;//local variable
	  class A{  //local class
		public void print() {
			System.out.println("Salary is" + salary);
		}
	}
	  A obj = new A();
	  obj.print();

	 class B{
		 
	 }
}

public void show() {
	System.out.println("Show method is called");
}
public OuterClass() {
	class B{	
	}
}
	
	{
		class B{
			
		}
	}
	static {
		class B{
			
		}
}

}
