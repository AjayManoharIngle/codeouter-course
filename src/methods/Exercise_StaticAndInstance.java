package methods;

public class Exercise_StaticAndInstance {

	public static void main(String[] args) {
		// To get length of 4 strings
		
		String name1 = "Ajay";
		String name2 = "Vijay";
		String name3 = "Sanjay";
		String name4 = "Jay";
		
		// Instance Method
		System.out.println("Instance Method : ");
		Exercise_StaticAndInstance e = new Exercise_StaticAndInstance();
		e.get_Length_by_instance(name1);
		e.get_Length_by_instance(name2);
		e.get_Length_by_instance(name3);
		e.get_Length_by_instance(name4);
	
		
		System.out.println(" ");
		
		// Static Method
		System.out.println("Static Method : ");
		get_Length_by_static(name1);
		get_Length_by_static(name2);
		get_Length_by_static(name3);
		get_Length_by_static(name4);
		
	}

	void get_Length_by_instance(String name) {
		System.out.println(name + " length is : " + (name.length()));
	}
	
	static void get_Length_by_static(String name) {
		System.out.println(name + " length is : " + (name.length()));
	}

}
