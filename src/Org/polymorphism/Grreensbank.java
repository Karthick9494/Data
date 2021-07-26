package Org.polymorphism;

public class Grreensbank extends Icicibank {
	
	@Override
	public void deposit() {
		System.out.println("2%");
	}
	@Override
	public void savings() {
		System.out.println("9");
	}
	private void fixed() {
		System.out.println("1");

		System.out.println("last");

		System.out.println("karthi");
		System.out.println("good");


	}
	
	public static void main(String[] args) {
		
		Grreensbank ref = new Grreensbank();
		ref.deposit();
		ref.fixed();
		ref.savings();
		
	
	}

	}
	
	

