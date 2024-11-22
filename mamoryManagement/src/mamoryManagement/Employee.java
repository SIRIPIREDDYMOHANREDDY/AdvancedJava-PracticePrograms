package mamoryManagement;

public class Employee {
	int orgId = 45554;
	String orgName = "mohan Learning";
	String ceo = "Mohan";
	int noOfDepts = 2;
	static double netWorth = 500.00;

	public static void main(String[] args) throws InterruptedException {
		int eid = 101;
		String empName = "jhon";
		double salary = 5000.00;

		Employee e1 = new Employee();
		e1.getOrgID();
		System.out.println(Employee.getNetwworth());
		Employee e2 = new Employee();
		e2.deleteEmployee(101);

		Thread.sleep(50000);
	}

	public int getOrgID() {
		return orgId;
	}

	public static double getNetwworth() {
		return netWorth;
	}

	public void deleteEmployee(int empID) {

	}
}
