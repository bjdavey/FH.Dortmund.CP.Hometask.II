public class Car {

    public Car(int id, String make, String model, int yearOfManufacture, String color, double price,
            String registrationNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    int id;
    String make;
    String model;
    int yearOfManufacture;
    String color;
    double price;
    String registrationNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

}