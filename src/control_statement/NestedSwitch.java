package control_statement;

public class NestedSwitch {

	public static void main(String[] args) {
		
		//Nested Switch : Switch inside Switch statement.
		
		// Print Category and subcategory based on 1 and 2 number.
		int category = 2;
        int subCategory = 1;

        switch (category) {
            case 1:
                System.out.println("Category: Electronics");

                switch (subCategory) {
                    case 1:
                        System.out.println("Subcategory: Mobile Phones");
                        break;
                    case 2:
                        System.out.println("Subcategory: Laptops");
                        break;
                    default:
                        System.out.println("Invalid Subcategory");
                }
                break;

            case 2:
                System.out.println("Category: Clothing");

                switch (subCategory) {
                    case 1:
                        System.out.println("Subcategory: Men's Apparel");
                        break;
                    case 2:
                        System.out.println("Subcategory: Women's Apparel");
                        break;
                    default:
                        System.out.println("Invalid Subcategory");
                }
                break;

            default:
                System.out.println("Invalid Category");
        }
	}
}
