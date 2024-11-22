package app1;

public class N {
	 @Override
	protected void finalize() throws Throwable {
		 System.out.println("from finalize");
	}
	 public static void main(String[] args) throws Exception{
		N n1 = new N();
		n1 = null;
	    Thread.sleep(10000);
	    System.gc();    //  Runtime.getRuntime().gc()
	    System.out.println("done");
	}
}
