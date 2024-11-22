package lambdaexpression;

public class ClassA {
	public static void main(String[] args) {
		Car c1 = new Car() {
			@Override
			public void drive(int s,String model) {
				System.out.println("Drive bmw");
				System.out.println(model);
			}
		};
		c1.drive(50,"bmw");
//lambda expression with anonymous function 
		Car c2 = (speed,model)->{
        System.out.println("Drive tata");
        System.out.println("Drive safe");
        System.out.println("Drive fast");
        System.out.println("Drive with follow thr rules");
        if(speed>100)
        	System.out.println("speed driving");
        else 
        	System.out.println("slow driving");
        
		};
		c2.drive(500,"tata");

	}

}

class Audi implements Car {

	@Override
	public void drive(int s,String model) {
		System.out.println("Driving audi");

	}

}

@FunctionalInterface
interface Car {
	public void drive(int speed,String model);// abstract method
}
