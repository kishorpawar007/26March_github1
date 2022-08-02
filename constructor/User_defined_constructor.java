package constructor;

public class User_defined_constructor {

	int num1;        // declaration
	int num2;
	
	User_defined_constructor(){
		num1= 25;                // intialization
		num2= 12;
	}
	
	public void m1() {
		System.out.println(num1+num2);         // Usage
		System.out.println(num1*num2);
		System.out.println(num1-num2);
		System.out.println(num1/num2);
	}
	
	public static void main(String[] args) {
		User_defined_constructor o1=new User_defined_constructor();
		o1.m1();
		 
		System.out.println("------------------------");
		
		User_defined_constructor_from_diff_class o2=new User_defined_constructor_from_diff_class();
		o2.m2();
	}
}
