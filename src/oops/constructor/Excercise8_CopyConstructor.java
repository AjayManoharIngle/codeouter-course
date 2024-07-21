package oops.constructor;

class Food{
	
	public String foodName;
	public Integer foodQuantity;
	
	public Food(String foodName, Integer foodQuantity) {
		this.foodName = foodName;
		this.foodQuantity = foodQuantity;
	}
	
	public Food(Food food) {
		this.foodName = food.foodName.concat("Banana");
		this.foodQuantity = food.foodQuantity;
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", foodQuantity=" + foodQuantity + "]";
	}
}

public class Excercise8_CopyConstructor {

	public static void main(String[] args) {
		
		// Make food constructor 
		
		Food food = new Food("Orange",10);
		Food food1 = new Food(food);
		
		System.out.println("Initial Food : " + food);
		System.out.println("Copy Food : "  + food1);
	}
}
