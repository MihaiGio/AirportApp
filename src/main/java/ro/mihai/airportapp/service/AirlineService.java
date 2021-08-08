package ro.mihai.airportapp.service;

import ro.mihai.airportapp.model.AirlineDto;

import java.util.List;

public interface AirlineService {

    List<AirlineDto> findAll();
}
