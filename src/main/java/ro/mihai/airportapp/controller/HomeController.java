package ro.mihai.airportapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.mihai.airportapp.model.AirportDto;
import ro.mihai.airportapp.service.AirportService;

@Controller
public class HomeController {

    @Autowired
    private AirportService airportService;

    @GetMapping({"/", "/home", "/index"})
    public String showHome(final Model model){
        model.addAttribute("airports", airportService.findAll());
        model.addAttribute("airportDto", new AirportDto());
        return "home";
    }
}
