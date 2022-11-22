package cz.mpsv.energy.energydatastorage.model.repositories;

import cz.mpsv.energy.energydatastorage.model.entities.SimulationEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SimulationRepository extends JpaRepository<SimulationEntity,Long> {
}
