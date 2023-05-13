package ru.rza.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ResourceUtils;
import ru.rza.entity.ExcelFile;
import ru.rza.repository.FileRepository;

import java.io.*;
import java.nio.file.Files;

@Service
public class FileService {

    private final FileRepository fileRepository;

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

//    @Transactional
//    public void saveFile(ExcelFile excelFile) {
//        fileRepository.save(excelFile);
//        fileRepository.flush();
//    }

//    @Transactional
//    public ExcelFile getFile(Integer id) {
//        ExcelFile file = fileRepository.getById(id);
//        file.getData();
//        saveExcelToFile(file);
//        return file;
//    }


//    @Transactional
//    public void saveExcelToDatabase()  {
//        try {
//            File file = ResourceUtils.getFile("classpath:fileOne.xlsx");
//            byte[] content = Files.readAllBytes(file.toPath());
//
//            ExcelFile entity = ExcelFile.builder().data(content).build();
//            fileRepository.save(entity);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    public void saveExcelToFile(ExcelFile entity)  {
//
//        try {
//
//            File file = new File("example.xlsx");
//            FileOutputStream outputStream = new FileOutputStream(file);
//
//            byte[] content = entity.getData();
//            outputStream.write(content);
//            outputStream.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

}
