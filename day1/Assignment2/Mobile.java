package week1.day1.Assignment2;

public class Mobile {
private void makeCall() {
		String mobileModel = "Nokia8120";
		System.out.println("makeCall");
		System.out.println(mobileModel);
	}
	
private void sendMsg() {
		
float mobileweight = 101f;
System.out.println("sendMsg");
System.out.println(mobileweight);
	}
	
	public static void main(String[] args) {
	Mobile obj = new Mobile();
	obj.makeCall();
	obj.sendMsg();
	System.out.println("This is my Mobile");
	}

}
