package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarServise.CarService;


@Controller
@RequestMapping("/")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    String showCars(@RequestParam(value = "count", defaultValue = "0") int count, Model model) {
        model.addAttribute("auto", carService.getCars(count));
        return "/cars";


    }
}
