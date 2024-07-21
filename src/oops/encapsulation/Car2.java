package oops.encapsulation;

public class Car2 {

	// Private attributes
    private String model;
    private int year;

    // Constructor
    public Car2(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
