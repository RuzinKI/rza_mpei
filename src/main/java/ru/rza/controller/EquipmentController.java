package ru.rza.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rza.dto.EquipmentDto;
import ru.rza.service.EquipmentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EquipmentController {

    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("/equip")
    public ResponseEntity<List<EquipmentDto>> getAllUser() {
        List<EquipmentDto> allEquipments = equipmentService.findAll();
        if (allEquipments.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(allEquipments);
    }
}
