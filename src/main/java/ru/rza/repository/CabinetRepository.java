package ru.rza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rza.entity.Cabinets;
import ru.rza.entity.Equipment;

@Repository
public interface CabinetRepository extends JpaRepository<Cabinets, Integer> {

}
