package ru.rza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rza.entity.ExcelFile;

@Repository
public interface FileRepository extends JpaRepository<ExcelFile, Integer> {
}
