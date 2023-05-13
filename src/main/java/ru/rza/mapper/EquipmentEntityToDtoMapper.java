package ru.rza.mapper;

import org.springframework.stereotype.Component;
import ru.rza.dto.EquipmentDto;
import ru.rza.entity.Equipment;
import ru.rza.entity.User;

@Component
public class EquipmentEntityToDtoMapper {

    public EquipmentDto map(Equipment equipment) {
        return EquipmentDto.builder()
                .codeScore(equipment.getCodeScore())
                .numberObject(equipment.getNumberObject())
                .name(equipment.getName())
                .costBalance(equipment.getCostBalance())
                .dataIn(equipment.getDataIn())
                .dataOut(equipment.getDataOut())
                .user(parseName(equipment.getUser()))
                .file(equipment.getFiles())
                .tags(equipment.getTags())
                .build();
    }


    private String parseName(User user) {
        return user.getSurname() + " "
                + user.getName().charAt(0) + "."
                + user.getPatronymic().charAt(0) + ".";
    }
}
