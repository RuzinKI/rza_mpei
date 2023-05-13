package ru.rza.mapper;

import org.springframework.stereotype.Component;
import ru.rza.dto.EquipmentSaveDto;
import ru.rza.entity.Equipment;

@Component
public class EquipmentSaveMapper {

    public Equipment map(EquipmentSaveDto eqSaveDto) {
        return Equipment.builder()
                .codeScore(eqSaveDto.getCodeScore())
                .numberObject(eqSaveDto.getNumberObject())
                .name(eqSaveDto.getName())
                .dataIn(eqSaveDto.getDataIn())
                .build();
    }
}
