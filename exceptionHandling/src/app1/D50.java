package app1;

import java.io.FileWriter;
import java.io.IOException;

public class D50 {
	public static void main(String[] args) {
		//new FileWriter("test");
		
		try {
			new FileWriter("test");
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
		System.out.println("done");
	}
}
