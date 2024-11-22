package app2;

public class M4 {
static class Test{
	int field;
	 synchronized void test1() {
		for(int i = 1;i<=1000;i++) {
System.out.println(Thread.currentThread().getName() + ":"+this +":" + field+":" +i);
field++;
		}
	}
}
static class A extends Thread{
	Test t1;
	A(Test t1){
		this.t1 = t1;
	}
	public void run() {
		t1.test1();
	}
}
public static void main(String[] args) {
	Test t1 = new Test();
	Test t2 = new Test();
	A a1 = new A(t1);
	a1.start();
	A a2 = new A(t1);
	a2.start();
}
}
//objects sharing to multiple objects usage increasing and productivity
//at the same data corruption   in accurate
//different data and different objects
//Synchronized 
