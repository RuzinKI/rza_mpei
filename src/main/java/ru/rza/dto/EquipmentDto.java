package ru.rza.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EquipmentDto {

    private String codeScore;       // код счета

    private Long numberObject;      // инвентарный номер

    private String name;            // наименование

    private Float costBalance;      // балансовая стоимость

    private LocalDate dataIn;       // дата прихода

    private LocalDate dataOut;      // дата списания

    private String user;            // ответственный

    private List<FileDto> file;    // названия файлов и ссылка

    private List<TagDto> tags;     // теги
}
