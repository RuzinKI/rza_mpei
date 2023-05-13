package ru.rza.mapper;

import org.springframework.stereotype.Component;
import ru.rza.dto.EquipmentDto;
import ru.rza.dto.FileDto;
import ru.rza.dto.TagDto;
import ru.rza.entity.Equipment;
import ru.rza.entity.FileName;
import ru.rza.entity.Tag;
import ru.rza.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
public class EquipmentEntityToDtoMapper {

    public EquipmentDto map(Equipment equipment) {
        return EquipmentDto.builder()
                .codeScore(equipment.getCodeScore())
                .numberObject(equipment.getNumberObject())
                .name(equipment.getName())
                .costBalance(equipment.getCostBalance())
                .dataIn(equipment.getDataIn())
                .dataOut(equipment.getDataOut())
                .user(UserEntityToDtoMapper.parseName(equipment.getUser()))
                .file(mapFile(equipment.getFiles()))
                .tags(mapTag(equipment.getTags()))
                .build();
    }

    private List<FileDto> mapFile(List<FileName> fileNames) {
        if (fileNames.isEmpty()) {
            return new ArrayList<>();
        }
        return fileNames.stream().map(fileName -> FileDto.builder()
                .id(fileName.getId())
                .name(fileName.getName())
                .build())
                .toList();
    }

    private List<TagDto> mapTag(Set<Tag> tags) {
        if (tags.isEmpty()) {
            return new ArrayList<>();
        }
        return tags.stream().map(tag -> TagDto.builder()
                .name(tag.getName())
                .build())
                .toList();
    }

}
