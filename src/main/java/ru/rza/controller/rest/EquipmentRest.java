package ru.rza.controller.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rza.dto.EquipmentDto;
import ru.rza.service.EquipmentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EquipmentRest {

    private final EquipmentService equipmentService;

    public EquipmentRest(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("/allEquip")
    public ResponseEntity<List<EquipmentDto>> getAllUser() {
        List<EquipmentDto> allEquipments = equipmentService.findAll();
        if (allEquipments.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(allEquipments);
    }
}
