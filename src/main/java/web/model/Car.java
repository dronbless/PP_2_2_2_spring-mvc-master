package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int id;
    private String model;
    private int price;

    public Car(){
    }

    public Car(int id, String model, int price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public static List<Car> getListCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 3000000));
        cars.add(new Car(2, "Mercedes", 4000000));
        cars.add(new Car(3, "Jaguar", 3500000));
        cars.add(new Car(4, "Toyota", 1700000));
        cars.add(new Car(5, "Porsche", 6000000));
        return cars;
    }
}
