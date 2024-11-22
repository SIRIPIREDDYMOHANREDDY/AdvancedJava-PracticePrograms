package practice_Multithreading;

public class Tm4 {
	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = ()-> {
			for(int i =0;i<10;i++) {
				//System.out.println("hii>>>>>>"+Thread.currentThread().getName()+Thread.currentThread().getId()+i);
			}	
		};
		
		Runnable r2 = ()-> {
			for(int i =0;i<10;i++) {
				//System.out.println("hello"+Thread.currentThread().getName()+Thread.currentThread().getId()+i);
			}
		};
		Thread t1 = new Thread(r1,"Mohan");
		Thread t2 = new Thread(r2,"Redy");
		System.out.println(t1.getState());
		
		t1.start();
		//t1.join();
		//t1.sleep(1000);
		System.out.println(t1.getState());
		t1.sleep(10000);
		t2.start();
		
		
		
		System.out.println(t1.getState());
}
}
