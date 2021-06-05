package application.mapper.impl;

import application.mapper.ProductionCycleMapper;
import application.model.ProductionCycle;
import application.model.dto.ProductionCycleDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductionCycleMapperImpl implements ProductionCycleMapper {
    @Override
    public ProductionCycle fromDto(ProductionCycleDto productionCycleDto) {
        return ProductionCycle.builder()
                .id(productionCycleDto.getId())
                .yearNumber(productionCycleDto.getYearNumber())
                .adultAnimalFertilityRate(productionCycleDto.getAdultAnimalFertilityRate())
                .oldAnimalFertilityRate(productionCycleDto.getOldAnimalFertilityRate())
                .youngAnimalSurvivalRate(productionCycleDto.getYoungAnimalSurvivalRate())
                .oldAnimalFertilityRate(productionCycleDto.getOldAnimalFertilityRate())
                .numberOfYoungAnimalsAtTheStartOfYear(productionCycleDto.getNumberOfYoungAnimalsAtTheStartOfYear())
                .numberOfAdultAnimalsAtTheStartOfYear(productionCycleDto.getNumberOfAdultAnimalsAtTheStartOfYear())
                .numberOfOldAnimalsAtTheStartOfYear(productionCycleDto.getNumberOfOldAnimalsAtTheStartOfYear())
                .numberOfYoungAnimalsAtTheEndOfYear(productionCycleDto.getNumberOfYoungAnimalsAtTheEndOfYear())
                .numberOfAdultAnimalsAtTheEndOfYear(productionCycleDto.getNumberOfAdultAnimalsAtTheEndOfYear())
                .numberOfOldAnimalsAtTheEndOfYear(productionCycleDto.getNumberOfOldAnimalsAtTheEndOfYear())
                .feedCostForOneAnimal(productionCycleDto.getFeedCostForOneAnimal())
                .totalFeedCost(productionCycleDto.getTotalFeedCost())
                .numberOfBornAnimals(productionCycleDto.getNumberOfBornAnimals())
                .numberOfSoldAnimals(productionCycleDto.getNumberOfSoldAnimals())
                .totalYearIncome(productionCycleDto.getTotalYearIncome())
                .totalYearExpenses(productionCycleDto.getTotalYearExpenses())
                .farmCapital(productionCycleDto.getFarmCapital())
                .adverseEventList(productionCycleDto.getAdverseEventList())
                .build();
    }

    @Override
    public ProductionCycleDto toDto(ProductionCycle productionCycle) {
        return ProductionCycleDto.builder()
                .id(productionCycle.getId())
                .yearNumber(productionCycle.getYearNumber())
                .adultAnimalFertilityRate(productionCycle.getAdultAnimalFertilityRate())
                .oldAnimalFertilityRate(productionCycle.getOldAnimalFertilityRate())
                .youngAnimalSurvivalRate(productionCycle.getYoungAnimalSurvivalRate())
                .oldAnimalFertilityRate(productionCycle.getOldAnimalFertilityRate())
                .numberOfYoungAnimalsAtTheStartOfYear(productionCycle.getNumberOfYoungAnimalsAtTheStartOfYear())
                .numberOfAdultAnimalsAtTheStartOfYear(productionCycle.getNumberOfAdultAnimalsAtTheStartOfYear())
                .numberOfOldAnimalsAtTheStartOfYear(productionCycle.getNumberOfOldAnimalsAtTheStartOfYear())
                .numberOfYoungAnimalsAtTheEndOfYear(productionCycle.getNumberOfYoungAnimalsAtTheEndOfYear())
                .numberOfAdultAnimalsAtTheEndOfYear(productionCycle.getNumberOfAdultAnimalsAtTheEndOfYear())
                .numberOfOldAnimalsAtTheEndOfYear(productionCycle.getNumberOfOldAnimalsAtTheEndOfYear())
                .feedCostForOneAnimal(productionCycle.getFeedCostForOneAnimal())
                .totalFeedCost(productionCycle.getTotalFeedCost())
                .numberOfBornAnimals(productionCycle.getNumberOfBornAnimals())
                .numberOfSoldAnimals(productionCycle.getNumberOfSoldAnimals())
                .totalYearIncome(productionCycle.getTotalYearIncome())
                .totalYearExpenses(productionCycle.getTotalYearExpenses())
                .farmCapital(productionCycle.getFarmCapital())
                .adverseEventList(productionCycle.getAdverseEventList())
                .build();
    }

    @Override
    public List<ProductionCycle> fromDtoList(List<ProductionCycleDto> productionCycleDtoList) {
        List<ProductionCycle> productionCycleList = new ArrayList<>();
        for (ProductionCycleDto productionCycleDto:
                productionCycleDtoList) {
            productionCycleList.add(fromDto(productionCycleDto));
        }
        return productionCycleList;
    }

    @Override
    public List<ProductionCycleDto> toDtoList(List<ProductionCycle> productionCycleList) {
        List<ProductionCycleDto> productionCycleDtoList = new ArrayList<>();
        for (ProductionCycle productionCycle:
                productionCycleList) {
            productionCycleDtoList.add(toDto(productionCycle));
        }
        return productionCycleDtoList;
    }
}
