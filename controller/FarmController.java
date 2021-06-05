package application.controller;

import application.model.dto.FarmDto;
import application.service.FarmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farms")
public class FarmController {

    private FarmService farmService;

    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }

    @PostMapping
    public void add(@RequestBody FarmDto farm) {
        farmService.add(farm);
    }

    @GetMapping("/{id}")
    public FarmDto getFarmById(@PathVariable("id") Integer id) {
        return farmService.findById(id);
    }

    @GetMapping
    public List<FarmDto> getFarms() {
        return farmService.findAll();
    }

    @PutMapping
    public void update(@RequestBody FarmDto farm) {
        farmService.update(farm);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        farmService.deleteById(id);
    }
}
