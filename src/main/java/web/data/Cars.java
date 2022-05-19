package web.data;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Ford","Mustang",1970));
        cars.add(new Car("Lamborgini","Gallardo",2000));
        cars.add(new Car("Dodge","Challenger",1975));
        cars.add(new Car("Chevrolet","Impala",1967));
        cars.add(new Car("Lada","Kalina",2010));
    }
}
