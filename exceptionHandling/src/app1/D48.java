package app1;

public class D48 {
	public static void main(String[] args) {
		//Thread.sleep(10000);
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
		System.out.println("done");
	}
}
