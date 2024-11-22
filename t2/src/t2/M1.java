package t2;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

class A{
	int i;
}
public class M1 {
	public static void main(String[] args) throws Exception {
		/*
		 * System.out.println("main begin"); WeakReference<A> wr = new
		 * WeakReference<A>(new A()); //System.gc();
		 * 
		 * Thread.sleep(5000); A a1 = wr.get(); System.out.println(a1.i);
		 * System.out.println("end");
		 */
		
		
		
		
		System.out.println("main begin");
		SoftReference<A> wr = new SoftReference<A>(new A());
		System.gc();
		Thread.sleep(5000);
		A a1 = wr.get();
		System.out.println(a1.i);
		System.out.println("end");
	}

}
