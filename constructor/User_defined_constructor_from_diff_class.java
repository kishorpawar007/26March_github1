package constructor;

public class User_defined_constructor_from_diff_class {
	
	int num3;
	int num4;

	
		User_defined_constructor_from_diff_class(){
		num3= 42;
		num4= 31;
		}
		
	public void m2() {	
		System.out.println(num3+num4);
		System.out.println(num3-num4);
		System.out.println(num3*num4);
		System.out.println(num3/num4);
	}
}
