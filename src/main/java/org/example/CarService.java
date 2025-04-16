package org.example; // Make sure this matches your package

import java.util.HashSet;
import java.util.Set;

public class CarService {

    Set<Car> carSet = new HashSet<>();
    int carCount = 0;

    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException();
        }
        carSet.add(car);
        carCount++;
    }

    public boolean removeCar(Car car) {
        if (carSet.contains(car)) {
            carSet.remove(car);
            carCount--;
            return true;
        }
        else {
            return false;
        }
    }

    public int getCarCount() {
        return carCount;
    }

    public Set<Car> getCarsByMake(String make) {
        Set<Car> cars = new HashSet<>();

        if (make == null || make.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (Car car : carSet) {
            if (car.brand.equalsIgnoreCase(make)) {
                cars.add(car);
            }
        }
        return cars;
    }

}