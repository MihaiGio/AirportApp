package ro.mihai.airportapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.mihai.airportapp.model.AirportDto;
import ro.mihai.airportapp.repository.AirportRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AirportServiceImpl implements AirportService {

    @Autowired
    private AirportRepository airportRepository;

    @Override
    public List<AirportDto> findAll() {
        return airportRepository.findAll().stream()
                .map(m -> new AirportDto(m.getId(), m.getName(), m.getCity(), m.getCountry(), m.getLatitude(), m.getLongitude()))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<AirportDto> findById(final Long airportId) {
        return airportRepository.findAirportById(airportId)
                .map(m -> new AirportDto(m.getId(), m.getName(), m.getCity(), m.getCountry(), m.getLatitude(), m.getLongitude()));
    }
}
