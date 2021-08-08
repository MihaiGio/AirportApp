package ro.mihai.airportapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.mihai.airportapp.model.AirlineDto;
import ro.mihai.airportapp.repository.AirlineRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AirlineServiceImpl implements AirlineService{

    @Autowired
    private AirlineRepository airlineRepository;

    @Override
    public List<AirlineDto> findAll() {
        return airlineRepository.findAll().stream()
                .map(m -> new AirlineDto(m.getName(), m.getCallsign(), m.getCountry(), m.getActive()))
                .collect(Collectors.toList());
    }
}
