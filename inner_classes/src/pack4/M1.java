package pack4;

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
	private Job[] jobs;
	Employee(String firstName, Job[] jobs){
		this.firstName = firstName;
		this.jobs = jobs;
	}
	Iterator getIterator() {
		return new Iterator(jobs);
	}
}
class Iterator {
	private static int index;
	private Job[] jobs;
	Iterator(Job[] jobs){
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
		Iterator it1 = emp.getIterator();
		while(it1.hasNextJob()) {
			System.out.println(it1.nextJob());
		}
		System.out.println("------------");
		
		System.out.println("read all jobs 2nd time");
		Iterator it2 = emp.getIterator();
		while(it2.hasNextJob()) {
			System.out.println(it2.nextJob());
		}
		System.out.println("------------");
		
		System.out.println("read all jobs 3rd time");
		Iterator it3 = emp.getIterator();
		while(it3.hasNextJob()) {
			System.out.println(it3.nextJob());
		}
	}
}

