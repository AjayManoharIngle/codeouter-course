package methods;

public class CallMethodsFromOtherClass {

	public static void main(String[] args) {
		
		// Call Without static Services methods
		Services service = new Services();
		service.increment1(10);
		service.decrement1(20);
	
		// Call With static Services methods
		Services.decrement(40);
		Services.increment(50);
	}
}
