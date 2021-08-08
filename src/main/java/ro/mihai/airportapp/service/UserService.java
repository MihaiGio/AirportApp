package ro.mihai.airportapp.service;

import ro.mihai.airportapp.model.UserDto;

import java.util.Optional;

public interface UserService {

    Optional<UserDto> findById(Long id);

    Optional<UserDto> findByEmail(String email);
}
