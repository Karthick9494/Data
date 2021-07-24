package Org.polymorphism;

public class Sample1 {
	
	//data types of argument
	
	private void Empname(String name) {
		
		System.out.println("my name is"+name);
	}
	
	private void Empname(int id) {
		System.out.println("my id is "+ id);
		

	}
	// count of argument
	private void Empname(int id , String name, float sal) {
		System.out.println(id +" "+ name+ ""+ sal) ;

	}
	
	private void Empname(String manager, String project) {
		System.out.println("my manager name "+ manager);
		System.out.println("my project name "+ project);
		
		

	}
	
	

	public static void main(String[] args) {
		Sample1 c = new Sample1();
		c.Empname(56);
		c.Empname("karthick");
		c.Empname(67, "karthick", 4567);
		c.Empname("karthick", "Rtm");
		
		
		
		
		
		
		
	}
	

}
