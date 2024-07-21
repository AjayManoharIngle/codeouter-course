package oops.constructor;

public class Excercise3_Para_Construnctor {
	
	int a;
	int b;
	
	Excercise3_Para_Construnctor(int no1, int no2){
		a = no1;
		b = no2;
		add(a,b);
	}

	private void add(int a2, int b2) {
		int res = a2+b2;
		System.out.println("Addition : " + res);
	}

	public static void main(String[] args) {
		
		// Addition of two numbers :
		
		Excercise3_Para_Construnctor e = new Excercise3_Para_Construnctor(10,20);
		Excercise3_Para_Construnctor f = new Excercise3_Para_Construnctor(20,100);
	}
}
