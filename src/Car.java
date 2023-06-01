public class Car {
    int year;
    String marka;
    String model;
    int cost;

    public Car(int year, String marka, String model, int cost) {
        this.year = year;
        this.marka = marka;
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

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
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
