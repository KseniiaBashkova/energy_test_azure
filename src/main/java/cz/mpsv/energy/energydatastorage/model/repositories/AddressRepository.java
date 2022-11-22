package cz.mpsv.energy.energydatastorage.model.repositories;

import cz.mpsv.energy.energydatastorage.model.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
}
