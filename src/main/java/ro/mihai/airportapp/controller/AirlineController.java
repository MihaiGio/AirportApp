package ro.mihai.airportapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.mihai.airportapp.service.AirlineService;

@Controller
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    @GetMapping("/airlines")
    public String retrieveAllAirlines(final Model model) {
        model.addAttribute("airlines", airlineService.findAll());
        return "airlines";
    }
}
