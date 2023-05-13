package ru.rza.service;

import org.springframework.stereotype.Service;
import ru.rza.dto.EquipmentDto;
import ru.rza.mapper.EquipmentEntityToDtoMapper;
import ru.rza.repository.EquipmentRepository;

import java.util.List;

@Service
public class EquipmentService {

    private final EquipmentRepository equipmentRepository;
    private final EquipmentEntityToDtoMapper mapperEq;

    public EquipmentService(EquipmentRepository equipmentRepository, EquipmentEntityToDtoMapper mapper) {
        this.equipmentRepository = equipmentRepository;
        this.mapperEq = mapper;
    }

    public void saveEquipment(EquipmentDto equipmentDto) {

    }

    public List<EquipmentDto> findAllEquipments() {
        return equipmentRepository.findAll().stream()
                .map(mapperEq::map)
                .toList();
    }
}
