package test_app2;

public class A {
	int i, j, k;
	
	public A(int i, int j, int k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	@Override
	public String toString() {
		return "A [ i = " + i + ", j = " + j + ", k = " + k + "]";
	}
}
