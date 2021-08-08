package ro.mihai.airportapp.service;

import ro.mihai.airportapp.model.AirportDto;

import java.util.List;
import java.util.Optional;

public interface AirportService {

    List<AirportDto> findAll();

    Optional<AirportDto> findById(Long airportId);
}
