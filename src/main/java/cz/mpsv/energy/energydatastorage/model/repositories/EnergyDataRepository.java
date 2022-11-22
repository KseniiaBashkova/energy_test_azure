package cz.mpsv.energy.energydatastorage.model.repositories;

import cz.mpsv.energy.energydatastorage.model.entities.EnergyDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EnergyDataRepository extends JpaRepository<EnergyDataEntity,Long> {

    @Override
    Optional<EnergyDataEntity> findById(Long aLong);
}
