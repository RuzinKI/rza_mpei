package ru.rza.service;

import org.springframework.stereotype.Service;
import ru.rza.dto.UserDto;
import ru.rza.entity.User;
import ru.rza.mapper.UserEntityToDtoMapper;
import ru.rza.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserEntityToDtoMapper mapper;

    public UserService(UserRepository userRepository, UserEntityToDtoMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    public List<UserDto> getAllUser() {
        return userRepository.findAll().stream()
                .map(mapper::map)
                .toList();
    }

}
