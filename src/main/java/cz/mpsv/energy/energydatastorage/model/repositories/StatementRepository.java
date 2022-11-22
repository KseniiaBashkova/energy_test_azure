package cz.mpsv.energy.energydatastorage.model.repositories;

import cz.mpsv.energy.energydatastorage.model.entities.AddressEntity;
import cz.mpsv.energy.energydatastorage.model.entities.StatementEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StatementRepository extends JpaRepository<StatementEntity,Long> {
}
