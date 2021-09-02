package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

import java.util.Optional;


@Controller
public class CarContrroller {

    @Autowired
    private CarsService carsServic;

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        model.addAttribute("cars", carsServic.getCars(count.orElse(0)));
        return "cars";
    }

}

