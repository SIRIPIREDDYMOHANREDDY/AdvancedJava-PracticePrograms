package practice_Multithreading;

public class Tm3 {
	public static void main(String[] args) {
		Runnable r1 = ()-> 
				System.out.println("hii>>>>>>"+Thread.currentThread().getName()+Thread.currentThread().getId());
				

		
		Runnable r2 = ()-> 
				System.out.println("hello"+Thread.currentThread().getName()+Thread.currentThread().getId());
				
		Thread t1 = new Thread(r1,"Mohan");
		Thread t2 = new Thread(r2,"Redy");
		t1.start();
		t2.start();
		
		
}
}
