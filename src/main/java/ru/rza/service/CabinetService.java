package ru.rza.service;

import org.springframework.stereotype.Service;
import ru.rza.entity.Cabinets;
import ru.rza.repository.CabinetRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CabinetService {

    private final CabinetRepository cabinetRepository;

    public CabinetService(CabinetRepository cabinetRepository) {
        this.cabinetRepository = cabinetRepository;
    }

    public List<Cabinets> getAll() {
        List<Cabinets> all = cabinetRepository.findAll();
        if (!all.isEmpty()) {
            return all;
        }
        return new ArrayList<Cabinets>();
    }
}
