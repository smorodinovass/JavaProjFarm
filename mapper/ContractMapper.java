package application.mapper;

import application.model.Contract;
import application.model.dto.ContractDto;

import java.util.List;

public interface ContractMapper {
    Contract fromDto(ContractDto contractDto);

    ContractDto toDto(Contract contract);

    List<Contract> fromDtoList(List<ContractDto> contractDtoList);

    List<ContractDto> toDtoList(List<Contract> contractList);
}
