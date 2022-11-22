package cz.mpsv.energy.energydatastorage.rest.api;


import cz.mpsv.energy.energydatastorage.api.PushEnergyDataApiDelegate;
import cz.mpsv.energy.energydatastorage.model.EnergyDataDTO;
import cz.mpsv.energy.energydatastorage.model.InlineResponse201DTO;
import cz.mpsv.energy.energydatastorage.service.services.EnergyDataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PushEnergyDataApiDelegateImpl implements PushEnergyDataApiDelegate {

    private final EnergyDataService energyDataService;

    @Override
    public ResponseEntity<InlineResponse201DTO> pushEnergyDataPost(EnergyDataDTO energyData) {
        return ResponseEntity.ok(energyDataService.saveEnergyData(energyData));
    }
}
