public class Greeter {
	static String message = "Hello ";;
	
	public void setMessage (String str) {
		message = str;
	}
	
	public void sayHello(String myStr){ 
		System.out.println(message + myStr);
	} 
}

