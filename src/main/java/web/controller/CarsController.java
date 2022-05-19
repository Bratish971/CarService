package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Objects;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {

    @GetMapping
    public String printCars(@RequestParam(value = "count", required = false) Integer number, ModelMap model) {
        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCars(Objects.requireNonNullElse(number, 5)));
        return "cars";
    }
}
