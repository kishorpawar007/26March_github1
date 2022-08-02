package constructor;

public class User_defined_constructor_with_parameter {
	float num1;
	float num2;
	
	User_defined_constructor_with_parameter(float a, float b){
		num1=a;
		num2=b;		
	}
	
	public void m1() {
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1/num2);
		System.out.println(num1*num2);
	}
	
	public void m2() {
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1/num2);
		System.out.println(num1*num2);
	}

	public static void main(String[] args) {
		User_defined_constructor_with_parameter o1=new User_defined_constructor_with_parameter(100f,200f);
		o1.m1();
		
		System.out.println("-------------------------------------------");
		
		User_defined_constructor_with_parameter o2=new User_defined_constructor_with_parameter(40f,20f);
		o2.m2();
		
		System.out.println("--------------------------------------------");
		
	    User_defined_constructor_with_parameter_from_diff_class o3=new User_defined_constructor_with_parameter_from_diff_class(50f,70f);
	    o3.m3();
	    
	    System.out.println("--------------------------------------------");
	    
	    User_defined_constructor_with_parameter_from_diff_class o4=new User_defined_constructor_with_parameter_from_diff_class(25f,55f);
	    o4.m4();
	    
	    System.out.println("--------------------------------------------");
	    
	    User_defined_constructor_with_parameter_from_diff_class o5=new User_defined_constructor_with_parameter_from_diff_class(18f,26f);
	    o5.m4();
	}
}
