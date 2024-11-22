package bitwiseoparators;

public class B {
public static void main(String[] args) {
	System.out.println(Integer.toBinaryString(125));
	System.out.println(Integer.toBinaryString(456));
	System.out.println(125 | 456);//bitwise or
	System.out.println(125 & 456);//bitwise and
	System.out.println(125 ^ 456);//bitwise xor
	System.out.println(Integer.parseInt("001001000",2));
} 

}
/*
     125 ==>001111101
     456 ==>111001000
     ----------------
     |     ==>   1111111101 ==>509
     
     
     
     
     125 ==>001111101
     456 ==>111001000
     ----------------
     &  ==>  001001000 ==> 72
     
     
     
     
     125 ==>001111101 
     456 ==>111001000
     ----------------
     ^  ==>  110110101 ==> 37
     






















*/
