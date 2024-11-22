package practice_InnerClass;
//non static inner classes
public class Q1 {
	private  int id = 101;
	public static void main(String[] args) {
System.out.println("in main method: TestClass1");
   Q1 q = new Q1();//outer class object
   TestQ4 tq =new Q1().new TestQ4(); //inner class object
    tq.show();
	}
	public class TestQ4 {
		
		public TestQ4() { //constructor
			
		}
		public void show() {
			System.out.println(id);

		}
		public void add() {
			//TestQ4 tq = new TestQ4();
			
		}
		public class TestQ5{
			public void sub() {
				System.out.println();
				TestQ4 tq = new TestQ4();
				tq.show();
			}
		}
	}
}


