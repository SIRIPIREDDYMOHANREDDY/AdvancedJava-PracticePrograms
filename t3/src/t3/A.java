package t3;

public interface A {
	int i =10;
	
	
	void test1();        //abstract method
	
	
	static void test2() {   //static
		System.out.println("iam from test2");
	}
	
//	void test3() {    //without default keyword
//  System.out.println("i am from test3");
//	}
	 default void test4() {     //with keyword
		System.out.println("i am from test2");
	}

}
