package application.mapper.impl;

import application.mapper.ContractMapper;
import application.model.Contract;
import application.model.dto.ContractDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ContractMapperImpl implements ContractMapper {

    @Override
    public Contract fromDto(ContractDto contractDto) {
        return Contract.builder()
                .id(contractDto.getId())
                .contractDurationInYears(contractDto.getContractDurationInYears())
                .numberOfYoungAnimalsSold(contractDto.getNumberOfYoungAnimalsSold())
                .numberOfAdultAnimalsSold(contractDto.getNumberOfAdultAnimalsSold())
                .numberOfOldAnimalsSold(contractDto.getNumberOfOldAnimalsSold())
                .youngAnimalSellingCost(contractDto.getYoungAnimalSellingCost())
                .adultAnimalSellingCost(contractDto.getAdultAnimalSellingCost())
                .oldAnimalSellingCost(contractDto.getOldAnimalSellingCost())
                .costOfFeedNeedsToPurchased(contractDto.getCostOfFeedNeedsToPurchased())
                .unsoldAnimalForfeit(contractDto.getUnsoldAnimalForfeit())
                .build();
    }

    @Override
    public ContractDto toDto(Contract contract) {
        return ContractDto.builder()
                .id(contract.getId())
                .contractDurationInYears(contract.getContractDurationInYears())
                .numberOfYoungAnimalsSold(contract.getNumberOfYoungAnimalsSold())
                .numberOfAdultAnimalsSold(contract.getNumberOfAdultAnimalsSold())
                .numberOfOldAnimalsSold(contract.getNumberOfOldAnimalsSold())
                .youngAnimalSellingCost(contract.getYoungAnimalSellingCost())
                .adultAnimalSellingCost(contract.getAdultAnimalSellingCost())
                .oldAnimalSellingCost(contract.getOldAnimalSellingCost())
                .costOfFeedNeedsToPurchased(contract.getCostOfFeedNeedsToPurchased())
                .unsoldAnimalForfeit(contract.getUnsoldAnimalForfeit())
                .build();
    }

    @Override
    public List<Contract> fromDtoList(List<ContractDto> contractDtoList) {
        List<Contract> contractList = new ArrayList<>();
        for (ContractDto contractDto:
                contractDtoList) {
            contractList.add(fromDto(contractDto));
        }
        return contractList;
    }

    @Override
    public List<ContractDto> toDtoList(List<Contract> contractList) {
        List<ContractDto> contractDtoList = new ArrayList<>();
        for (Contract contract:
                contractList) {
            contractDtoList.add(toDto(contract));
        }
        return contractDtoList;
    }
}
