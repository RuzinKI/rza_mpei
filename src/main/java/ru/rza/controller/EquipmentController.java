package ru.rza.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.rza.service.CabinetService;
import ru.rza.service.EquipmentService;

@Controller
public class EquipmentController {

    private final EquipmentService equipmentService;
    private final CabinetService cabinetService;

    public EquipmentController(EquipmentService equipmentService, CabinetService cabinetService) {
        this.equipmentService = equipmentService;
        this.cabinetService = cabinetService;
    }

    @GetMapping("/equips")
    public String aboutUser(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("currentUser", user);
        model.addAttribute("cabinets", cabinetService.getAll());
        return "equipment";
    }
}
