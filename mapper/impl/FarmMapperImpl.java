package application.mapper.impl;

import application.mapper.FarmMapper;
import application.model.Farm;
import application.model.dto.FarmDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FarmMapperImpl implements FarmMapper {
    @Override
    public Farm fromDto(FarmDto farmDto) {
        return Farm.builder()
                .id(farmDto.getId())
                .animalType(farmDto.getAnimalType())
                .farmOwner(farmDto.getFarmOwner())
                .capital(farmDto.getCapital())
                .isBankrupt(farmDto.isBankrupt())
                .numberOfYoungAnimals(farmDto.getNumberOfYoungAnimals())
                .numberOfAdultAnimals(farmDto.getNumberOfAdultAnimals())
                .numberOfOldAnimals(farmDto.getNumberOfOldAnimals())
                .productionCycleList(farmDto.getProductionCycleList())
                .contract(farmDto.getContract())
                .build();
    }

    @Override
    public FarmDto toDto(Farm farm) {
        return FarmDto.builder()
                .id(farm.getId())
                .animalType(farm.getAnimalType())
                .farmOwner(farm.getFarmOwner())
                .capital(farm.getCapital())
                .isBankrupt(farm.isBankrupt())
                .numberOfYoungAnimals(farm.getNumberOfYoungAnimals())
                .numberOfAdultAnimals(farm.getNumberOfAdultAnimals())
                .numberOfOldAnimals(farm.getNumberOfOldAnimals())
                .productionCycleList(farm.getProductionCycleList())
                .contract(farm.getContract())
                .build();
    }

    @Override
    public List<Farm> fromDtoList(List<FarmDto> farmDtoList) {
        List<Farm> farmList = new ArrayList<>();
        for (FarmDto farmDto:
                farmDtoList) {
            farmList.add(fromDto(farmDto));
        }
        return farmList;
    }

    @Override
    public List<FarmDto> toDtoList(List<Farm> farmList) {
        List<FarmDto> farmDtoList = new ArrayList<>();
        for (Farm farm:
                farmList) {
            farmDtoList.add(toDto(farm));
        }
        return farmDtoList;
    }
}
