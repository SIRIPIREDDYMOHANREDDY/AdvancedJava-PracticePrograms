package app3;

public class M27 {
public static void main(String[] args) {
	for(int i = 1;i<=10;i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
} 
}



//join method
//sleep method
//wait