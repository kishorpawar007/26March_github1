package variables;

public class Variable_types {
	 int i=25;
	 static int q=102;

	public static void main(String[] args) {
		int n=100;
		Variable_types o3=new Variable_types();
		System.out.println(o3.i);
		Variable_types o1=new Variable_types();
		o1.m2();
		m1();
		System.out.println(Static_global_variable_from_diff_class.l);
		Non_static_global_variable_from_diff_class o4=new Non_static_global_variable_from_diff_class();
		System.out.println(o4.m);
		System.out.println(n);
		System.out.println(q);
		o1.m3();
		
	}
	
	public static void m1() {
		int o=54;
		
		System.out.println(o);
		System.out.println(q);
	}
	
	public void m2() {
		int p=81;
		System.out.println(p);
		System.out.println(q);
		
	}
	
	public void m3() {
		int r=14;
		System.out.println(r);
		Variable_types r1=new Variable_types();
		System.out.println(r1.i);
	}
}
