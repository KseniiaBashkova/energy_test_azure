package cz.mpsv.energy.energydatastorage.service.services;


import cz.mpsv.energy.energydatastorage.mapper.EnergyDataMapper;
import cz.mpsv.energy.energydatastorage.model.EnergyDataDTO;
import cz.mpsv.energy.energydatastorage.model.InlineResponse200DTO;
import cz.mpsv.energy.energydatastorage.model.InlineResponse201DTO;
import cz.mpsv.energy.energydatastorage.model.entities.EnergyDataEntity;
import cz.mpsv.energy.energydatastorage.model.repositories.EnergyDataRepository;
import cz.mpsv.energy.energydatastorage.service.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EnergyDataService {

    private final EnergyDataMapper energyDataMapper;
    private final EnergyDataRepository energyDataRepository;

    public InlineResponse201DTO saveEnergyData(EnergyDataDTO energyData) {

        EnergyDataEntity entity = energyDataRepository.save(energyDataMapper.toEntity(energyData));
        return new InlineResponse201DTO(String.valueOf(entity.getId()));
    }

    // ik mpsv je nase id
    public InlineResponse200DTO pairEnergyData(String energyDataId, String ikMpsvId) {

        EnergyDataEntity energyData = energyDataRepository.findById(Long.valueOf(ikMpsvId))
                .orElseThrow(() -> new NotFoundException("Energy data with id: " + ikMpsvId + " does not exists"));

        return null;
    }
}
