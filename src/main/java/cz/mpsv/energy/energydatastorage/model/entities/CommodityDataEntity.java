package cz.mpsv.energy.energydatastorage.model.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
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
@Table(name = "commodity_data")
public class CommodityDataEntity extends AbstractEntity {

    @Column(name="effective_date", nullable = false)
    private LocalDate effectiveDate;

    @Column(name="fixation_from")
    private LocalDate fixationFrom;

    @Column(name="fixation_to")
    private LocalDate fixationTo;

    @Column(name="debt")
    private BigDecimal debt;

    @Column(name="advances_for_6_months")
    private BigDecimal advancesFor6Months;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="point_of_delivery_id", nullable = false)
    private PointOfDeliveryEntity pointOfDelivery;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "statement_id", nullable = false)
    private StatementEntity statement;

    @OneToMany(mappedBy = "commodityData", cascade=CascadeType.ALL)
    private List<PaymentEntity> payments = new ArrayList<>();

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "simulation_id")
    private SimulationEntity simulation;

    @ManyToOne
    @JoinColumn(name="energy_data_id")
    private EnergyDataEntity energyData;
}
