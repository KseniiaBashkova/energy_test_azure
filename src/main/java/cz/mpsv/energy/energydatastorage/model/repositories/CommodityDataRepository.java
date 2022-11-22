package cz.mpsv.energy.energydatastorage.model.repositories;

import cz.mpsv.energy.energydatastorage.model.entities.CommodityDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommodityDataRepository extends JpaRepository<CommodityDataEntity,Long> {
}
