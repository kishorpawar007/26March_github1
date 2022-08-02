package constructor;

public class User_defined_constructor_with_parameter_from_diff_class {
	
	float num3;
	float num4;
	
	User_defined_constructor_with_parameter_from_diff_class(float c, float d){
		num3=c;
		num4=d;
	}
	
public void m3() {
	System.out.println(num3+num4);
	System.out.println(num3-num4);
	System.out.println(num3*num4);
	System.out.println(num3/num4);
}
	
public void m4() {
	System.out.println(num3+num4);
	System.out.println(num3-num4);
	System.out.println(num3*num4);
	System.out.println(num3/num4);
}
}
