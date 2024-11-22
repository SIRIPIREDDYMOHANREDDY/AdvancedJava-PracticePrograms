package app1;

public class G implements Cloneable{
	int i;
	public static void main(String[] args) throws Exception{
		G g1 = new G();
		g1.i = 10;
		System.out.println(g1.i);
		System.out.println(g1);
		System.out.println("---------");
		G g2 = (G) g1.clone();
		System.out.println(g2.i);
		System.out.println(g2);
	}
}
