package cz.mpsv.energy.energydatastorage.model.repositories;

import cz.mpsv.energy.energydatastorage.model.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<ClientEntity,Long> {
}
