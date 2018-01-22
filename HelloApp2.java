public class HelloApp2 {
	public static void main (String[] args) {
		Greeter myGreeterObect;
		
		myGreeterObect = new Greeter();
		
		myGreeterObect.setMessage("How are you doing ");
		myGreeterObect.sayHello("Chris");
		
		myGreeterObect.setMessage("You look great ");
		myGreeterObect.sayHello("Chris");
	
	}


}