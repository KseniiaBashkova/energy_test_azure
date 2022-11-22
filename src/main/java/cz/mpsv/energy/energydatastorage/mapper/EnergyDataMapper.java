package cz.mpsv.energy.energydatastorage.mapper;

import cz.mpsv.energy.energydatastorage.model.CommodityDataDTO;
import cz.mpsv.energy.energydatastorage.model.EnergyDataDTO;
import cz.mpsv.energy.energydatastorage.model.SimulationDTO;
import cz.mpsv.energy.energydatastorage.model.entities.CommodityDataEntity;
import cz.mpsv.energy.energydatastorage.model.entities.EnergyDataEntity;
import cz.mpsv.energy.energydatastorage.model.entities.SimulationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnergyDataMapper {

    EnergyDataEntity toEntity(EnergyDataDTO energyData);

    CommodityDataEntity toEntity(CommodityDataDTO commodityDataDTO);

    SimulationEntity toEntity(SimulationDTO simulationDTO);

}
