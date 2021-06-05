package application.model;

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
public class Farm {

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
