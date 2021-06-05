package application.service.impl;

import application.dao.FarmDAO;
import application.mapper.FarmMapper;
import application.model.dto.FarmDto;
import application.service.FarmService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmServiceImpl implements FarmService {

    private FarmDAO farmDAO;
    private FarmMapper farmMapper;

    public FarmServiceImpl(FarmDAO farmDAO, FarmMapper farmMapper) {
        this.farmDAO = farmDAO;
        this.farmMapper = farmMapper;
    }

    public void add(FarmDto farm) {
        farmDAO.add(farmMapper.fromDto(farm));
    }

    public FarmDto findById(Integer id) {
        return farmMapper.toDto(farmDAO.findById(id));
    }

    public List<FarmDto> findAll() {
        return farmMapper.toDtoList(farmDAO.findAll());
    }

    public void update(FarmDto farm) {
        farmDAO.update(farmMapper.fromDto(farm));
    }

    public void deleteById(Integer id) {
        farmDAO.deleteById(id);
    }
}
