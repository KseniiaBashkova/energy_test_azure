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
@Table(name = "statement")
public class StatementEntity extends AbstractEntity {

    @Column(name="date", nullable = false)
    private LocalDate date;

    @Column(name="consumption_amount", nullable = false)
    private BigDecimal consumptionAmount;

    @Column(name="advances", nullable = false)
    private BigDecimal advances;

    @Column(name="total", nullable = false)
    private BigDecimal total;

    @Column(name="balance", nullable = false)
    private BigDecimal balance;

    @OneToOne(mappedBy = "statement")
    private CommodityDataEntity commodityData;
}
