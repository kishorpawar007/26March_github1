package variables;

public class Variable_types_practice {

	int c=30;      //non-static global variable
	
	
	
	public static void main(String[] args) 
	{	
		Variable_types_practice s4=new Variable_types_practice();   
			System.out.println(s4.c); 
			
	}
		
		
		public static void m3()
		{		
			Variable_types_practice s5=new Variable_types_practice();
			System.out.println(s5.c);
			
		}
		
		public void m4()
		{
			System.out.println(c);
			  
		}
}
		
		
