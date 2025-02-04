package practice_Multithreading;

public class TestMultiThreading1 {
public static void main(String[] args) {
	Employee e1 = new Employee("T1");
	e1.start();
	Manager m1 = new Manager("T2");
	m1.start();
	System.out.println(Thread.activeCount());
}
}
class Employee extends Thread{
	public Employee(String tname) { //you can change name of thread
		super(tname);
	}
	@Override
	public void run() {
	System.out.println("Hello java "+Thread.currentThread().getName()+Thread.currentThread().getId());	
	}
}
class Manager extends Thread{
	public Manager(String tname) {
		super(tname);
	}
	@Override
	public void run() {
		System.out.println("Hello"+Thread.currentThread().getName());	
	}
}