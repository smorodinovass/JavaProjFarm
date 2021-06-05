package application.service.impl;

import application.dao.ProductionCycleDAO;
import application.mapper.ProductionCycleMapper;
import application.model.dto.ProductionCycleDto;
import application.service.ProductionCycleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionCycleServiceImpl implements ProductionCycleService {

    private ProductionCycleDAO productionCycleDAO;
    private ProductionCycleMapper productionCycleMapper;

    public ProductionCycleServiceImpl(ProductionCycleDAO productionCycleDAO, ProductionCycleMapper productionCycleMapper) {
        this.productionCycleDAO = productionCycleDAO;
        this.productionCycleMapper = productionCycleMapper;
    }

    public void add(ProductionCycleDto productionCycle) {
        productionCycleDAO.add(productionCycleMapper.fromDto(productionCycle));
    }

    public ProductionCycleDto findById(Integer id) {
        return productionCycleMapper.toDto(productionCycleDAO.findById(id));
    }

    public List<ProductionCycleDto> findAll() {
        return productionCycleMapper.toDtoList(productionCycleDAO.findAll());
    }

    public void update(ProductionCycleDto productionCycle) {
        productionCycleDAO.update(productionCycleMapper.fromDto(productionCycle));
    }

    public void deleteById(Integer id) {
        productionCycleDAO.deleteById(id);
    }
}
