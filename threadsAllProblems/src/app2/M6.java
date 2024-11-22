package app2;
public class M6 {
static class Test{
	static int field;
	static synchronized  void test1() {
		for(int i =1;i<=1000;i++) {
			System.out.println("test1:" +Thread.currentThread().getName()+ ":" +field + ":" + i);
			field++;
		}
	}
	static synchronized  void test2() {
		for(int i =1;i<=1000;i++) {
			System.out.println("test2:" +Thread.currentThread().getName()+ ":" +field + ":" + i);
			field++;
}
}	
}
static class A extends Thread{
	public void run() {
		Test.test1();
	}
}
static class B extends Thread{
	public void run() {
		Test.test2();
	}
}
public static void main(String[] args) {
	A a1 = new A();
	a1.start();
	B b1 = new B();
	b1.start();
			
}
}
//WHENEVER THREAD IS ENTERNING INTO STATIC synchronized
//EVERY CLASS LOG FOR ONLY ONE CLASS
