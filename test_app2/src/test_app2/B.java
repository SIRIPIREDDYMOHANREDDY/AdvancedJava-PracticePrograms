package test_app2;

public class B {
	int i, j, k, l;
	
	public B(int i, int j, int k, int l) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}
	
	@Override
	public String toString() {
		return "B [ i =" + i + ", j = " + j + ", k = " + k + ", l = " + l + "]";
	}
}
