package bitwiseoparators;

public class A {
public static void main(String[] args) {
	System.out.println(Integer.toBinaryString(48));
	System.out.println(Integer.parseInt("110000",2));
	System.out.println("============>");
	System.out.println(Integer.toBinaryString(63));
	System.out.println(Integer.parseInt("111111",2));
	System.out.println("==============>");
	System.out.println(Integer.toBinaryString(203));
	System.out.println(Integer.parseInt("11001011",2));
	System.out.println("===============>");
	System.out.println(Integer.toBinaryString(128));
	System.out.println(Integer.parseInt("10000000",2));
}
}
/*
Decimal to Binary

48/2 =24       + 0
24/2 =12       + 0
12/2 =6        + 0
6/2 =3         + 0
3/2 =1         + 1
1/2 =0         + 1
===================>
BINARY TO DECIMAL
------------
110000
(2 power 0)*0=1*0=0
(2 power 1)*0=2*0=0
(2 power 2)*0=4*0=0
(2 power 3)*0=8*0=0
(2 power 4)*1=16*1=16
(2 power 5)*1=32*1=32
----------------------
                    48
                    
                    
                    
                    
                    
                    
 ========>
 
63/2 =31    + 1
31/2 =15    + 1
15/2 =7    + 1
7/2 =3    + 1
3/2 =1    + 1
1/2 =0    + 1
            111111
======>

(2 power 0)*1=1*1=1 
(2 power 1)*1=2*1=2 
(2 power 2)*1=4*1=4 
(2 power 3)*1=8*1=8 
(2 power 4)*1=16*1=16 
(2 power 5)*1=32*1=32 
----------------------
                     63
====================>




















*/
