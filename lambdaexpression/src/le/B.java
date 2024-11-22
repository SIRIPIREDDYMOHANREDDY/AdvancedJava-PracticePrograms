package le;

public class B {
	public static void main(String[] args) {

	bike1 b1 = () ->100;System.out.println(b1.drive());
	}
     
    class Ether implements bike1 {

		@Override
		public int drive() {
			System.out.println();
			return 0;

		}


	}

	@FunctionalInterface
	interface bike1 {
		public int drive();
	}

}
