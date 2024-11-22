package anonymous;

public class Anonymous {
	public static void main(String[] args) {
	
	class1 c1 = new class1() {
		public void print() {
			System.out.println("updated print method is called");
		}
		
	};	
	c1.show();
	c1.print();
		
		
	}

}


class class1{
	public void show() {
		System.out.println("show method is called");
	}
	public void print() {
		System.out.println("print method is called");
	}
}
/*
 * class class2 extends class1{ public void print() {
 * System.out.println("updated print method is called"); } }
 */


