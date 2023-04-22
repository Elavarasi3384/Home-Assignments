package week1.day1.Assignment4;

public class Bike {

	public void applyBreak() {
		System.out.println("Bike break Applied");

	}
	public void soundHorn() {
		System.out.println("Bike sound horn");
	}
	public static void main(String[] args) {
		Car function=new Car();
		Bike function1=new Bike();
		function1.soundHorn();
		function1.applyBreak();
		function.applyBreak();
		function.soundHorn();
		
	}

}
