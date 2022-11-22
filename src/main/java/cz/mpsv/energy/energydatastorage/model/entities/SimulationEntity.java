package cz.mpsv.energy.energydatastorage.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@EqualsAndHashCode(callSuper=false)
@Table(name = "simulation")
public class SimulationEntity extends AbstractEntity {

    @Column(name="date")
    private LocalDate date;

    @Column(name="consumption")
    private BigDecimal consumption;

    @Column(name="total")
    private BigDecimal total;

    @Column(name="balance")
    private BigDecimal balance;

    @OneToOne(mappedBy = "simulation")
    private CommodityDataEntity commodityData;
}
