package arrays;

class Student{
	String name;
	int id;
	double marks;
}

public class UserDefineArray {

	public static void main(String[] args) {
		
		Student[] stu = new Student[3];
		
		stu[0] = new Student();
		stu[0].id = 101;
		stu[0].name = "Ajay";
		
		stu[1] = new Student();
		stu[1].id = 102;
		stu[1].name = "Vijay";
		
		stu[2] = new Student();
		stu[2].id = 103;
		stu[2].name = "Rohan";
		
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].id + " : " + stu[i].name);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		// Direct assigned.
		Student[] stu1 = {new Student(),new Student()};
		stu1[0].id = 1001;
		stu1[0].name = "Ram";
		
		stu1[1].id = 1002;
		stu1[1].name = "Lakhan";
		
		for(int i=0;i<stu1.length;i++) {
			System.out.println(stu1[i].id + " : " + stu1[i].name);
		}
	}
}
