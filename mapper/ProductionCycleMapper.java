package application.mapper;

import application.model.ProductionCycle;
import application.model.dto.ProductionCycleDto;

import java.util.List;

public interface ProductionCycleMapper {

    ProductionCycle fromDto(ProductionCycleDto productionCycleDto);

    ProductionCycleDto toDto(ProductionCycle productionCycle);

    List<ProductionCycle> fromDtoList(List<ProductionCycleDto> productionCycleDtoList);

    List<ProductionCycleDto> toDtoList(List<ProductionCycle> productionCycleList);
}
