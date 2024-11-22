package app4;

public class Util {
static void sleep(long millis) {
	try {
		Thread.sleep(millis);
	}
	catch(InterruptedException ex) {
		ex.printStackTrace();
	}
}




}
