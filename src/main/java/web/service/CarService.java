package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

public class CarService {

    public static List<Car> cars = Car.getListCars();

    public static List<Car> getCars(Integer count){
        Stream<Car> carStream = cars.stream()
                .limit(count == null ? Integer.valueOf(cars.size()) : count);
        return carStream.toList();
    }
}
