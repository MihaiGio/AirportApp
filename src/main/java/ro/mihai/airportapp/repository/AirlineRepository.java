package ro.mihai.airportapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.mihai.airportapp.domain.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {

}
