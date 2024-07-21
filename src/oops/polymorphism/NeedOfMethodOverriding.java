package oops.polymorphism;

class Marriage{
	
	public void engagementDate() {
		System.out.println("Enagagement date is on 23 March 2024");
	}
	
	public void marriageDate() {
		System.out.println("Marriage date is on 15 April 2024");
	}
}

class ChangeMarriageDate extends Marriage{

	@Override
	public void marriageDate() {
		System.out.println("Marriage date is on 20 April 2024");
	}
	
}

public class NeedOfMethodOverriding {

	public static void main(String[] args) {
		
		// same name method, same no of parameter and return type also same.
		
		// If you want to change marriage date then no need to change date manually in code and do not
		// disturb existing class for new feature or code modification
		
		ChangeMarriageDate cm = new ChangeMarriageDate();
		cm.engagementDate();
		cm.marriageDate();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Marriage m = new ChangeMarriageDate();
		m.engagementDate();
		m.marriageDate();
		
	}
}
