package variables;

public class Use_of_static_and_non_static_variable {
	
	String empname;
	int empid;
    static String empceoname;       // here static variable used, thus this variable will take latest input and apply in all other object too.
	
	public void m1() {
	System.out.println("Employee name: "+empname+", Employee ID: "+empid+", Employee's CEO Name: "+empceoname);
	}

}
