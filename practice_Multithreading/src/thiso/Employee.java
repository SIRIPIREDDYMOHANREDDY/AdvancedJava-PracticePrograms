package thiso;

public class Employee {
int age =25;
public static void main(String[] args) {
	Employee e = new Employee();
	e.getAge();
	e.setAge(80);
	System.out.println(e.getAge());
	
}
public int getAge() {
	return age;
	
}
public void setAge(int age) {
	this.age=age;
	
}
}
