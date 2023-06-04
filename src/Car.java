import java.io.Serializable;

public class Car implements Serializable {
    int year;
    String brand;
    String model;
    int cost;

    public Car(int year, String brand, String model, int cost) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.cost = cost;
    }
    public Car(){};
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
