package test_app1;

public class H {
	final int i;
	
	H() { 
		i = 10;
	}
	
	H(int a){
	//	this();
		i = 20;
	}
	
	public static void main(String[] args) {
		H obj1 = new H();
		System.out.println(obj1.i);
		H obj2 = new H(40);
		System.out.println(obj2.i);
	}
}

// we can initialize 'i' in two constructors
// when ever we using this() calling statement in any one constructor then we get error
// 'i' is a final Non-static Constant. so it is constant for one object