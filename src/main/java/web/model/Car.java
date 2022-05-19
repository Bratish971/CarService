package web.model;

public class Car {

    private String make;

    private String model;

    private int yearOfMake;

    public Car(String make, String model, int yearOfMake) {
        this.make = make;
        this.model = model;
        this.yearOfMake = yearOfMake;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }
}
