package variables;

public class Use_of_static_and_non_static_main_mtd {

	public static void main(String[] args) {
		Use_of_static_and_non_static_variable o1=new Use_of_static_and_non_static_variable();
		o1.empname="Kishor_Pawar";
		o1.empid= 590120;
		o1.empceoname="Ratanji_Tata";
				
		Use_of_static_and_non_static_variable o2=new Use_of_static_and_non_static_variable();	
	    o2.empname="Shivam_Dalvi";
	    o2.empid= 590238;
	    o2.empceoname="Marc_Llistosella";
	    
	    Use_of_static_and_non_static_variable o3=new Use_of_static_and_non_static_variable();
	    o3.empname="Yogesh_Shinde";
	    o3.empid=590180;
	    o3.empceoname="Guenter_Butschek";
	    
	    o1.m1();
	    o2.m1();
	    o3.m1();
	}
	
}
