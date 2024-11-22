package app1;

public class L {
	public static void main(String[] args) {
	L obj1 = new L(); // live object
	obj1 = new L();   //first object became abandoned and 2nd object become a live object
	System.out.println("done");
	}
}
