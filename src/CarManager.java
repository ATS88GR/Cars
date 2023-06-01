import java.util.ArrayList;

public class CarManager {
    public static Car MaxCost(ArrayList<Car> list){
        int maxCost =0;
        Car result = new Car();
        for (Car car: list) {
            if(car.getCost()>maxCost) result = car;
        }
        return result;
    }
}
