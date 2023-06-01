import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> Garage = new ArrayList<>();
        Garage.add(new Car(2022,"Mercedes", "w140", 20000));
        Garage.add(new Car(2019,"VW", "Polo", 10000));
        Garage.add(new Car(2016,"VW", "Golf", 12000));
        Garage.add(new Car(2012,"VW", "Passat", 8000));
        Garage.add(new Car(1998,"Audi", "100", 500));
        Garage.add(new Car(2010,"Audi", "A4", 8000));
        Garage.add(new Car(2020,"Audi", "A5", 30000));
        Garage.add(new Car(2005,"Volvo", "S90", 8000));
        Garage.add(new Car(2014,"Volvo", "S80", 18000));
        Garage.add(new Car(2020,"Volvo", "S60", 20000));
        Garage.add(new Car(2006,"Suzuki", "Baleno", 3000));
        Garage.add(new Car(2019,"Suzuki", "Swift", 14000));

        System.out.println(CarManager.MaxCost((ArrayList<Car>) Garage).getCost());
    }
}