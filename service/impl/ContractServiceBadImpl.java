package application.service.impl;

import application.dao.ContractDAO;
import application.mapper.ContractMapper;
import application.model.dto.ContractDto;
import application.service.ContractService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class ContractServiceBadImpl implements ContractService {

    private ContractDAO contractDAO;
    private ContractMapper contractMapper;

    public ContractServiceBadImpl(ContractDAO contractDAO, ContractMapper contractMapper) {
        this.contractDAO = contractDAO;
        this.contractMapper = contractMapper;
    }

    public void add(ContractDto contract) {
        contractDAO.add(contractMapper.fromDto(contract));
    }

    public ContractDto findById(Integer id) {
        return contractMapper.toDto(contractDAO.findById(id));
    }

    public List<ContractDto> findAll() {
        return contractMapper.toDtoList(contractDAO.findAll());
    }

    public void update(ContractDto contract) {
        contractDAO.update(contractMapper.fromDto(contract));
    }

    public void deleteById(Integer id) {
        contractDAO.deleteById(id);
    }
}
