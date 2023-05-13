package ru.rza.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EquipmentSaveDto {

    private String codeScore;       // код счета

    private Long numberObject;      // инвентарный номер

    private String name;            // наименование

    private LocalDate dataIn;       // дата прихода

    private UserDto user;           // ответственный

}
