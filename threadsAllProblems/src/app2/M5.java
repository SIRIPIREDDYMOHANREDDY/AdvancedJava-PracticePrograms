package app2;


public class M5 {
	static class Test{
		int field;
		static int p1;
		 synchronized void test1() {
			for(int i = 1;i<=1000;i++) {
	System.out.println("test 1"+Thread.currentThread().getName() + ":"+p1 +":" + field+":" +i);
	field++;
	p1++;
			}
		 }
		 synchronized void test2() {
		for(int i = 1;i<=1000;i++) {
			System.out.println("test 2"+Thread.currentThread().getName() + ":"+p1 +":" + field+":" +i);
			field++;
			p1++;
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
			static class B extends Thread{
				Test t1;
				B(Test t1){
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
				B b1 = new B(t2);
				b1.start();
			}
}

