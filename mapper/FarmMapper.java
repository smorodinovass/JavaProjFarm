package application.mapper;

import application.model.Farm;
import application.model.dto.FarmDto;

import java.util.List;

public interface FarmMapper {

    Farm fromDto(FarmDto farmDto);

    FarmDto toDto(Farm farm);

    List<Farm> fromDtoList(List<FarmDto> farmDtoList);

    List<FarmDto> toDtoList(List<Farm> farmList);
}
