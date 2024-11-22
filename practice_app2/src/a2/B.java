package a2;

public class B {
public static void main(String[] args) {
	int decimal= 10;
	String binary ="";
	while(decimal>0) {
		binary +=decimal%2;
		decimal =decimal/2;
		
	}
	System.out.println(binary);
}
}
