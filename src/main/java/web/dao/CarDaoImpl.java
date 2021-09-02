package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static List<Car> cars = new ArrayList<>();

        static {
            cars.add(new Car("BMW", "Black", 25000));
            cars.add(new Car("Hyundai", "Silver", 15000));
            cars.add(new Car("UAZ", "Green", 10000));
            cars.add(new Car("Volvo", "Blue", 23000));
            cars.add(new Car("Lada", "Red", 12000));
        }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return cars;
        }

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
