package app1;

public class D47 {
	public static void main(String[] args) {
		D47 obj = new D47();
		//obj.clone();
		try {
			obj.clone();
		}
		catch(CloneNotSupportedException ex){
			System.out.println(ex);
		}
		System.out.println("done");
	}
}
