package application.service;

import application.model.dto.ProductionCycleDto;

import java.util.List;

public interface ProductionCycleService {

    void add(ProductionCycleDto productionCycle);

    ProductionCycleDto findById(Integer id);

    List<ProductionCycleDto> findAll();

    void update(ProductionCycleDto productionCycle);

    void deleteById(Integer id);
}
