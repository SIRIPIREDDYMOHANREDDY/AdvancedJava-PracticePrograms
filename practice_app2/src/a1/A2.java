package a1;

import java.util.Scanner;

public class A2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("please enter a number");
	int num =sc.nextInt();
	System.out.println("factors are");
	for(int i=1;i<=num;i++) {
		if(num%i == 0) {
			
			System.err.println(i);
		}
	}
	sc.close();
}
}
