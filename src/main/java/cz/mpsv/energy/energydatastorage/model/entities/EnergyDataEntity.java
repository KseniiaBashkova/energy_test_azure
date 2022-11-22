package cz.mpsv.energy.energydatastorage.model.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@EqualsAndHashCode(callSuper=false)
@Table(name = "energy_data")
public class EnergyDataEntity extends AbstractEntity {

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "supplier_id", nullable = false)
    private String supplierId;

    @Column(name = "gdpr_agreement_provided", nullable = false)
    private LocalDate gdprAgreementProvided;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "client_id", nullable = false)
    private ClientEntity client;

    @OneToMany(mappedBy = "energyData", cascade=CascadeType.ALL)
    private List<CommodityDataEntity> commodities = new ArrayList<>();
}
