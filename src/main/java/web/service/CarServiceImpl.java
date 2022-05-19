package web.service;

import org.springframework.stereotype.Service;
import web.data.Cars;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCars(int number) {

        return number > 5 ? Cars.cars.subList(0,5) : Cars.cars.subList(0,number);
    }
}
