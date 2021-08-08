package ro.mihai.airportapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ro.mihai.airportapp.model.AirportDto;
import ro.mihai.airportapp.service.AirportService;

@Controller
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping("/airports")
    public String retrieveAllAirports(final Model model) {
        model.addAttribute("airports", airportService.findAll());
        return "airports";
    }

    @PostMapping("/airports")
    public String displayAirport(final Model model, final AirportDto airportDto) {
        model.addAttribute("airportDto", airportService.findById(airportDto.getId()).orElse(new AirportDto()));
        return "airport";
    }
}
