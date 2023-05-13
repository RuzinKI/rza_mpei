package ru.rza.mapper;

import org.springframework.stereotype.Component;
import ru.rza.dto.UserDto;
import ru.rza.entity.User;

@Component
public class UserEntityToDtoMapper {

    public UserDto map(User user) {
        return UserDto.builder()
                .id(user.getId())
                .fio(parseName(user))
                .build();
    }

    public static String parseName(User user) {
        return user.getSurname() + " "
                + user.getName().charAt(0) + "."
                + user.getPatronymic().charAt(0) + ".";
    }
}
