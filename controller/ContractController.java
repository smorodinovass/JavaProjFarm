package application.controller;


import application.model.dto.ContractDto;
import application.service.ContractService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contracts")
public class ContractController {

    private ContractService contractService;

    public ContractController(@Qualifier("contractServiceImpl") ContractService contractService) {
        this.contractService = contractService;
    }

    @PostMapping
    public void add(@RequestBody ContractDto contract) {
        contractService.add(contract);
    }

    @GetMapping("/{id}")
    public ContractDto getContractById(@PathVariable("id") Integer id) {
        return contractService.findById(id);
    }

    @GetMapping
    public List<ContractDto> getContracts() {
        return contractService.findAll();
    }

    @PutMapping
    public void update(@RequestBody ContractDto contract) {
        contractService.update(contract);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        contractService.deleteById(id);
    }
}
