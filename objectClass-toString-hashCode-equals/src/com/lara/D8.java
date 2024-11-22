package com.lara;
class G {
	int i;
	int j;
	G(int i, int j) {
		this.i = i;
		this.j = j;
	}	
	@Override
	public int hashCode() {      // hashCode method give ultimate performance than equals method because there no comparisons 
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		return hash;
	}
}
public class D8 {
	public static void main(String[] args) {
		G g1 = new G(90, 120);
		G g2 = new G(120, 90);
		G g3 = new G(120, 91);
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		System.out.println(g3.hashCode());
	}

}