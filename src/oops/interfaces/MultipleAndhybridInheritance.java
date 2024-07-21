package oops.interfaces;

interface Vechicle1 { 
	public void drivingV1();
}

interface Vechicle2{
	public void drivingV2();

}

class Auto implements Vechicle1,Vechicle2{

	@Override
	public void drivingV1() {
		System.out.println("Auto is taking property from driving 1");
	}

	@Override
	public void drivingV2() {
		System.out.println("Auto is taking property from driving 2");
	}
}

class OlaAuto extends Auto{

	@Override
	public void drivingV1() {
		System.out.println("OlaAuto is taking property from auto ");
	}

}

public class MultipleAndhybridInheritance {

	public static void main(String[] args) {
		
		Auto auto = new Auto();
		auto.drivingV1();
		auto.drivingV2();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		OlaAuto olaAuto = new OlaAuto();
		olaAuto.drivingV1();
		olaAuto.drivingV2();
	}
}
