package a2;

public class B1 {
    public static void main(String[] args) {
    	
    	   
    	        int number = 986487; 
    	        int digitSum = 0;         

    	        while (number != 0) {
    	            digitSum += number % 10;  
    	            number /= 10;            
    	        }

    	        System.out.println("The sum of the digits is: " + digitSum);

    }
}
