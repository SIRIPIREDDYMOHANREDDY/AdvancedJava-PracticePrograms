package bitwiseoparators;

public class D {
public static void main(String[] args) {
	System.out.println(456 >> 1);
	System.out.println(456 >> 2);
	System.out.println(456 >> 3);
	System.out.println(456 << 1);
	System.out.println(456 << 2);
	System.out.println(456 << 3);
	
}
}
/* half of the decimal
456      ===>111001000   right most one will remove
456 >> 1 ===> 11100100 ===> 228




456      ===>111001000   right most two will remove
456 >> 2 ===>  1110010 ===>114



456      ===>111001000   right most three will remove
456 >> 3 ===>   111001 ===>57




456      ===> 111001000  we will get double  
456 << 1 ===>1110010000  ===>912




456     ===>  111001000   
456 << 2===>11100100000  ===>1824



456      ===>  111001000   
456 << 3 ===>11100100000 ===>  3648























*/