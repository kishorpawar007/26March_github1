package constructor;

public class Constructor_overloading {

	int num1;
	int num2;
	String fname;
	String mname;
	String lname;
	
	Constructor_overloading(){
		 num1=10;
		 num2=20;
	}
	
	Constructor_overloading(int a, int b){
		num1=a;
		num2=b;
	}
 
	Constructor_overloading(String c, String d, String e){
		fname=c;
		mname=d;
		lname=e;
	}
	public void m1() {
		System.out.println(num1-num2);
	}
	
	public void m2() {
		System.out.println(num1+num2);
	}
	
	public void m3() {
		System.out.println(fname+"_" +mname+"_"+lname);
	}
	
public static void main(String[] args) {
	Constructor_overloading o1=new Constructor_overloading();
	o1.m1();
	
	System.out.println("------------------------------------------");
	
	Constructor_overloading o2=new Constructor_overloading(5,4);
	o2.m2();
	
	System.out.println("------------------------------------------");
	
	Constructor_overloading o3=new Constructor_overloading("Kishor","Uttam","Pawar");
	o3.m3();
	
	
	
	
}
}

