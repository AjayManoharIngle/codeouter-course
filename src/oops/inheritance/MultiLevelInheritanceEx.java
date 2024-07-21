package oops.inheritance;

class HondaShine extends Honda{

	public HondaShine(int noOfTyre, String vehicleName, int noOfSeat) {
		super(noOfTyre, vehicleName, noOfSeat);
	}

	@Override
	public String toString() {
		return "HondaShine [type=" + type + ", noOfTyre=" + noOfTyre + ", vehicleName=" + vehicleName + ", noOfSeat="
				+ noOfSeat + "]";
	}
}

class HondaHornet extends Honda{

	public HondaHornet(int noOfTyre, String vehicleName, int noOfSeat) {
		super(noOfTyre, vehicleName, noOfSeat);
	}

	@Override
	public String toString() {
		return "HondaHornet [type=" + type + ", noOfTyre=" + noOfTyre + ", vehicleName=" + vehicleName + ", noOfSeat="
				+ noOfSeat + "]";
	}
}

public class MultiLevelInheritanceEx {

	public static void main(String[] args) {
		
		// [Vehicle <-- Bike,Car <-- Honda <-- HondaShine, HondaHornet]
		// can two childs to be in level wise - YES
		
		HondaShine hondaShine = new HondaShine(2,"Shine",2);
		System.out.println("type : " + hondaShine.type);
		System.out.println(hondaShine);
		
		HondaHornet hondaHornet  = new HondaHornet(2,"Hornet",2);
		System.out.println(hondaHornet);
	}

}
