package practice_Multithreading;

public class Tm5 {
	public static void main(String[] args) throws InterruptedException {
		BrickDiary bd = new BrickDiary();
		
		Runnable r1 = ()-> {
			for(int i =0;i<10000;i+=50) {
				//unloading the 50 bricks
				bd.incrementBrickCount();
				
			}
		};
		Runnable r2 = ()-> {
			for(int i =0;i<15000;i+=50) {
				//unloading the 50 bricks
				bd.incrementBrickCount();
			}
		};
		Runnable r3 = ()-> {
			for(int i =0;i<5000;i+=50) {
				//unloading the 50 bricks
				bd.incrementBrickCount();
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println(bd.brickCount);
		System.out.println(bd.brickCount2);
	}
}
class BrickDiary{
	int brickCount =0;
	int brickCount2 =0;
//	public synchronized void incrementBrickCount() {
	public void incrementBrickCount() {
		
		synchronized (this) {
			brickCount += 50;
		}
		brickCount2 += 50;
	}
}
		
