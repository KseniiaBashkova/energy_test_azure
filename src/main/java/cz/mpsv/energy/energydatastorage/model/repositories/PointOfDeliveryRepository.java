package cz.mpsv.energy.energydatastorage.model.repositories;

import cz.mpsv.energy.energydatastorage.model.entities.PointOfDeliveryEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PointOfDeliveryRepository extends JpaRepository<PointOfDeliveryEntity,Long> {
}
