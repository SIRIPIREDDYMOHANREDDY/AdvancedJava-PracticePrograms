package app1;

public class M { 
	@Override
	protected void finalize() {
		System.out.println("from finalize");
	}
	
	public static void main(String[] args) throws Exception{
		M m1 = new M();
		m1 = null;
		System.gc();
		Thread.sleep(10000); // here we supply milliseconds
		System.out.println("done");
	}
}
