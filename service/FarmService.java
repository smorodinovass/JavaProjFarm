package application.service;

import application.model.dto.FarmDto;

import java.util.List;

public interface FarmService {

    void add(FarmDto farm);

    FarmDto findById(Integer id);

    List<FarmDto> findAll();

    void update(FarmDto farm);

    void deleteById(Integer id);
}
