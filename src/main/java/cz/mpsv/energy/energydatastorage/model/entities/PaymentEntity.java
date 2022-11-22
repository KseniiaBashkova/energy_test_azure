package cz.mpsv.energy.energydatastorage.model.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@EqualsAndHashCode(callSuper=false)
@Table(name = "payment")
public class PaymentEntity extends AbstractEntity {

    @Column(name="month", nullable = false)
    private BigDecimal month;

    @Column(name="year", nullable = false)
    private BigDecimal year;

    @Column(name="amount", nullable = false)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "commodity_data_id")
    private CommodityDataEntity commodityData;
}
