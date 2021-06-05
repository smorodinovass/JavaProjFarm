package application.service;

import application.model.dto.ContractDto;

import java.util.List;

public interface ContractService {

    void add(ContractDto contract);

    ContractDto findById(Integer id);

    List<ContractDto> findAll();

    void update(ContractDto contract);

    void deleteById(Integer id);
}
