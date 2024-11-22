package app1;

import java.util.Scanner;

public class D70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age <= 0) {
			throw new AgeNegativeException("age should be greater then zero");
		}
		//continue.....
		System.out.println("continue......");
		try {
			
		}
		catch(AgeNegativeException ex) {
			
		}
//		try {
//			
//		}
//		catch(String ex) {
//			
//		}
		if(true){
			new String("some msg");
		}
	}
	void test1() throws AgeNegativeException{
		
	}
//	void test2() throws String{
//		
//	}
}
