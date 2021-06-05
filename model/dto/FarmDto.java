package application.model.dto;

import application.model.AnimalType;
import application.model.Contract;
import application.model.ProductionCycle;
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
public class FarmDto {

    private int id;
    private AnimalType animalType;
    private String farmOwner;

    private int capital;
    private boolean isBankrupt = false;

    private int numberOfYoungAnimals;
    private int numberOfAdultAnimals;
    private int numberOfOldAnimals;

    private List<ProductionCycle> productionCycleList = new ArrayList<>();
    private Contract contract;

}
