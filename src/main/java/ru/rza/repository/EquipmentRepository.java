package ru.rza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rza.entity.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
}
