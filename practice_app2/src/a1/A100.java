package a1;

interface B{
	public void C();
}
public class A100  {
public static void main(String[] args) {
	
B a =() ->System.out.println("c method is calling");
	a.C();
}	
}
