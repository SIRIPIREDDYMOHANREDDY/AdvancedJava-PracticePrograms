package practice_Multithreading;

public class TestMultiThreading {

	
	public static void main(String[] args) {
		System.out.println("hii threading");
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		
	}
}
