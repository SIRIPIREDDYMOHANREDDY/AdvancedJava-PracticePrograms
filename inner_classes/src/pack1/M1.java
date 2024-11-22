package pack1;
class Job {
	private String title;
	private double salary;
	
	Job(String title, double salary) {
		this.title = title;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "title:" + title + "and salary :" + salary;
	}
}

class Employee {
	private String firstName;
	// several other attributes
	private Job[] jobs;
	private int index;
	
	Employee(String firstName, Job[] jobs){
		this.firstName = firstName;
		this.jobs = jobs;
	}
	
	// to iterate jobs array
	boolean hasNextJob() {
		return index < jobs.length;
	}
	Job nextJob() {
		return jobs[ index++ ];
	}
}

public class M1 {
	public static void main(String[] args) {
		Job j1 = new Job("software", 50000);
		Job j2 = new Job("hardware", 15000);
		Job j3 = new Job("sales", 40000);
		Job j4 = new Job("hr", 45000);
			
		Job[] jobs = {j1, j2, j3, j4};
		
		Employee emp = new Employee("Murali", jobs);
		
		System.out.println("read all jobs");
		while(emp.hasNextJob()) {
			System.out.println(emp.nextJob());
		}
		System.out.println("------------");
		
		System.out.println("read all jobs 2nd time");
		while(emp.hasNextJob()) {
			System.out.println(emp.nextJob());
		}
	}
}
