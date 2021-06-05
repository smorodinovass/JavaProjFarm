package application.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContractDto {

    private int id;
    private int contractDurationInYears;

    private int numberOfYoungAnimalsSold;
    private int numberOfAdultAnimalsSold;
    private int numberOfOldAnimalsSold;

    private int youngAnimalSellingCost;
    private int adultAnimalSellingCost;
    private int oldAnimalSellingCost;

    private int costOfFeedNeedsToPurchased;

    private int unsoldAnimalForfeit;
}
