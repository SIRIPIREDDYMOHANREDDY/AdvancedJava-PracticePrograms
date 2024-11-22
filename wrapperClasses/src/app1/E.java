package app1;

public class E {
	public static void main(String[] args) {
		String s1 = "10";
		
		int i = Integer.parseInt(s1);
		int j = i + 20;
//		int k = s1 + 20;
		String s2 = s1 + 20;  // here concatenation is done
		System.out.println(i);
		System.out.println(j);
		System.out.println(s1);
		System.out.println(s2);
	}
}
