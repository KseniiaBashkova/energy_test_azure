package cz.mpsv.energy.energydatastorage.rest.api;


import cz.mpsv.energy.energydatastorage.model.InlineResponse200DTO;
import cz.mpsv.energy.energydatastorage.service.services.EnergyDataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PairEnergyDataApiDelegateImpl implements cz.mpsv.energy.energydatastorage.api.PairEnergyDataApiDelegate {

    private final EnergyDataService energyDataService;
    @Override
    public ResponseEntity<InlineResponse200DTO> pairEnergyDataPost(String energyDataId, String ikMpsvId) {
        return ResponseEntity.ok(energyDataService.pairEnergyData(energyDataId, ikMpsvId));
    }
}
