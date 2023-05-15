package ru.rza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.rza.dto.EquipmentDto;
import ru.rza.dto.EquipmentSaveDto;
import ru.rza.dto.UserDto;
import ru.rza.service.EquipmentService;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication

public class SpringBootApplicationRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootApplicationRunner.class, args);
        System.out.println();
        EquipmentService service = run.getBean("equipmentService", EquipmentService.class);

//        EquipmentSaveDto eq = EquipmentSaveDto.builder()
//                .codeScore("101.1")
//                .name("Transformator")
//                .dataIn(LocalDate.of(2022, 3, 21))
//                .numberObject(1212121212L)
//                .user(UserDto.builder()
//                        .fio("Иванов А.А.")
//                        .id(1)
//                        .build())
//                .build();
//
//        service.saveEquipment(eq);

        System.out.println();
    }
}


