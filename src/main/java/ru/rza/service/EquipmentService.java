package ru.rza.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.rza.dto.EquipmentDto;
import ru.rza.dto.EquipmentSaveDto;
import ru.rza.entity.Equipment;
import ru.rza.entity.User;
import ru.rza.mapper.EquipmentEntityToDtoMapper;
import ru.rza.mapper.EquipmentSaveMapper;
import ru.rza.repository.EquipmentRepository;
import ru.rza.repository.UserRepository;

import java.util.List;

@Service
public class EquipmentService {

    private final EquipmentRepository equipmentRepository;
    private final UserRepository userRepository;
    private final EquipmentEntityToDtoMapper mapperEq;
    private final EquipmentSaveMapper mapperSave;

    public EquipmentService(EquipmentRepository equipmentRepository,
                            UserRepository userRepository,
                            EquipmentEntityToDtoMapper mapper,
                            EquipmentSaveMapper mapperSave) {
        this.equipmentRepository = equipmentRepository;
        this.userRepository = userRepository;
        this.mapperEq = mapper;
        this.mapperSave = mapperSave;
    }

    @Transactional
    public void saveEquipment(EquipmentSaveDto equipmentSaveDto) {
        Equipment equipment = mapperSave.map(equipmentSaveDto);
        User user = userRepository.getById(equipmentSaveDto.getUser().getId());
        equipment.setUser(user);
        equipmentRepository.save(equipment);
    }

    @Transactional(readOnly = true)
    public List<EquipmentDto> findAll() {
        return equipmentRepository.findAll().stream()
                .map(mapperEq::map)
                .toList();
    }
}
