package ru.rza.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rza.entity.FileName;
import ru.rza.entity.Tag;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EquipmentEditDto {

    private String name;            // наименование

    private Long numberObject;      // инвентарный номер

    private Set<Tag> tags;          // теги

    private Float costBalance;      // балансовая стоимость

    private String codeScore;       // код счета

    private LocalDate dataIn;       // дата прихода

    private LocalDate dataOut;      // дата списания

    private String section;         // подразделение

    private String cabinet;         // кабинет

    private String user;            // ответственный

    private List<FileDto> file;     // названия файлов и ссылка


    private Float costEstimated;   // оценочная стоимость
    private Integer countActual;   // кол-во фактическое
    private Integer countBalance;  // кол-во баланс
    private String status;         // статус объекта
    private String function;       // целевая функция
}
