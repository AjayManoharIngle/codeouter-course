package oops.interfaces;

interface Cacheable {}

class Product implements Cacheable {
	
	private int id;
    private String name;
    private double price;
    
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class MarkerInterfaceEx {

	public static void main(String[] args) {
		
		// It is mark or tag to class that it is that behavior or his metadata of class.
		// No fields and methods - mark interface
		// ex. Serializable  , Cloneable
		
		// A product is cachable cause it is used for sell and to generate some profit out of it.
		
		Product product = new Product(1, "Laptop", 999.99);
		//product = null;
        
        if (product instanceof Cacheable && product != null) {
            System.out.println("Product is cacheable");
            System.out.println(product);
            // Logic for caching the product...
        } else {
            System.out.println("Product is not cacheable or product is empty");
        }
	}

}
