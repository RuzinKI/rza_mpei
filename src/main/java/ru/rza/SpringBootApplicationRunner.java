package ru.rza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.rza.service.FileService;

@SpringBootApplication

public class SpringBootApplicationRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootApplicationRunner.class, args);
        System.out.println();
        FileService fileService = run.getBean("fileService", FileService.class);



        System.out.println();
    }
}
