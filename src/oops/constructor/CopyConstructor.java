package oops.constructor;

class Doctor{
	
	public String doctorName;
	public String hospitalName;
	
	public Doctor(String doctorName, String hospitalName) {
		this.doctorName = doctorName;
		this.hospitalName = hospitalName;
	}

	public Doctor(Doctor doctor,String doctorName) {
		// doctor from same hospital but change doctor name
		this.doctorName = doctorName;
		this.hospitalName = doctor.hospitalName;
	}
}


public class CopyConstructor {

	public static void main(String[] args) {
		
		// we need to create an exact copy of an existing object of the same class. 
		// There is also a condition that if we make any changes in the copy, 
		// it should not reflect in the original one and vice versa.
		
		// this way it is reflect to other original constructor
		Doctor doctor1 = new Doctor("Ajay","Galaxy Hospital");
		Doctor doctor2 = doctor1;
		doctor2.doctorName = "Vijay";
		
		System.out.println("Doctor 1 :" + doctor1.doctorName + " : " + doctor1.hospitalName);
		System.out.println("Doctor 2 :" + doctor2.doctorName + " : " + doctor2.hospitalName);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Doctor doctor3 = new Doctor("Sanjay","Galaxy Hospital");
		Doctor doctor4 = new Doctor(doctor3,"Anand");
		Doctor doctor5 = new Doctor(doctor4,"Sahil");
		
		System.out.println("Doctor 3 :" + doctor3.doctorName + " : " + doctor3.hospitalName);
		System.out.println("Doctor 4 :" + doctor4.doctorName + " : " + doctor4.hospitalName);
		System.out.println("Doctor 5 :" + doctor5.doctorName + " : " + doctor5.hospitalName);

	}
}
