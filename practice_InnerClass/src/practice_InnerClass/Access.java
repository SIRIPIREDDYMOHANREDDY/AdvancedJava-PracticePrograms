package practice_InnerClass;

public class Access {
	private int id = 101;

	public static void main(String[] args) {
		System.out.println("in main method: TestClass1");
		Access ac = new Access();
		TestA1 a1 = new Access().new TestA1();
		a1.show();
		System.out.println(a1.getEmployeeID());
	}

	//public class TestA1  extends Student{
		public class TestA1  implements Employee{
		private int id = 102;
		public void show() {
			int id =103;
			System.out.println(id);
			System.out.println(this.id);
			System.out.println(Access.this.id);
			//System.out.println(getMarks());
			
			giveExam();
		}

		/*
		 * @Override public int getMarks() { return 666; }
		 */
		public void giveExam() {
			System.out.println("exam given");
		}
		@Override
		public int getEmployeeID() {
			// TODO Auto-generated method stub
			return id;
		}
		@Override
		public void calculateSalary() {
			System.out.println("Salary is 1 lakh");
			
		}
	}
}
