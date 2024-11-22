package app1;

public class K {
	public static void main(String[] args) {
		K k1 = new K();
		K k2 = k1;
		K k3 = k1;
		K k4 = k1;
		K k5 = k1;
		// live object
		
		k1 = null;
		//live object
		
		k2 = null;
		//live object
		
		k5 = null;
		//live object
		
		k4 = null;
		//live 

		k3 = null;
		//abandoned object
		System.out.println("done");
	}
	
}
