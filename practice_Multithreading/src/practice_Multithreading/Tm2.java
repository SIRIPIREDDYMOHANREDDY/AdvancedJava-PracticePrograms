package practice_Multithreading;

public class Tm2 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hii>>>>>>"+Thread.currentThread().getName()+Thread.currentThread().getId());
				
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello"+Thread.currentThread().getName()+Thread.currentThread().getId());
				
			}
		};
		Thread t1 = new Thread(r1,"Mohan");
		Thread t2 = new Thread(r2,"Redy");
		t1.start();
		t2.start();
		
		
		
		
		
		
//		Emp1 e1 = new Emp1();
//		Thread t1 = new Thread(e1,"T1");
//		t1.start();
//		Manag1 m1 = new Manag1();
//		Thread t2 = new Thread(m1,"T2");
//		t2.start();
//		System.out.println(Thread.activeCount());
	}
	}
//	class Emp1 implements Runnable{
//		
//		
//		@Override
//		public void run() {
//		System.out.println("Hello java "+Thread.currentThread().getName()+Thread.currentThread().getId());	
//		}
//	}
//	class Manag1 implements Runnable{
//		
//		@Override
//		public void run() {
//			System.out.println("Hello"+Thread.currentThread().getName());	
//		}
//	}

