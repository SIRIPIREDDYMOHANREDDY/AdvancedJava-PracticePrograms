package app1;

public class D28 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("abc");
		}
		catch(NumberFormatException ex) {			
			//System.out.println(ex);
			System.out.println(ex.getMessage());// get only message
			ex.printStackTrace();
		}
	}

}
