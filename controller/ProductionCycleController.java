package application.controller;

import application.model.dto.ProductionCycleDto;
import application.service.ProductionCycleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/production")
public class ProductionCycleController {

    private ProductionCycleService productionCycleService;

    public ProductionCycleController(ProductionCycleService productionCycleService) {
        this.productionCycleService = productionCycleService;
    }

    @PostMapping
    public void add(@RequestBody ProductionCycleDto productionCycle) {
        productionCycleService.add(productionCycle);
    }

    @GetMapping("/{id}")
    public ProductionCycleDto getProductionCycleById(@PathVariable("id") Integer id) {
        return productionCycleService.findById(id);
    }

    @GetMapping
    public List<ProductionCycleDto> getProductionCycles() {
        return productionCycleService.findAll();
    }

    @PutMapping
    public void update(@RequestBody ProductionCycleDto productionCycle) {
        productionCycleService.update(productionCycle);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        productionCycleService.deleteById(id);
    }
}
