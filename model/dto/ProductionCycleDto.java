package application.model.dto;

import application.model.AdverseEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionCycleDto {

    private int id;
    private int yearNumber;

    private int adultAnimalFertilityRate;
    private int oldAnimalFertilityRate;

    private int youngAnimalSurvivalRate;

    private int oldAnimalMortalityRate;

    private int numberOfYoungAnimalsAtTheStartOfYear;
    private int numberOfAdultAnimalsAtTheStartOfYear;
    private int numberOfOldAnimalsAtTheStartOfYear;

    private int numberOfYoungAnimalsAtTheEndOfYear;
    private int numberOfAdultAnimalsAtTheEndOfYear;
    private int numberOfOldAnimalsAtTheEndOfYear;

    private int feedCostForOneAnimal;
    private int totalFeedCost;

    private int numberOfBornAnimals;
    private int numberOfSoldAnimals;

    private int totalYearIncome;
    private int totalYearExpenses;

    private int farmCapital;

    private List<AdverseEvent> adverseEventList = new ArrayList<>();
}
