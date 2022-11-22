package cz.mpsv.energy.energydatastorage.model.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@EqualsAndHashCode(callSuper=false)
@Table(name = "point_of_delivery")
public class PointOfDeliveryEntity extends AbstractEntity {

    @Column(name = "ean_or_eic", nullable = false)
    private BigDecimal eanOrEic;

    @Column(name = "flat_number")
    private String flatNumber;

    @Column(name = "is_main", nullable = false)
    private Boolean isMain;

    @Column(name = "tariff")
    private String tariff;

    @Column(name = "heating")
    private String heating;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", nullable = false)
    private AddressEntity address;

    @Enumerated(EnumType.STRING)
    @Column(name="commodity", nullable = false)
    private CommodityTypeEntity commodity;

    @OneToMany(mappedBy = "pointOfDelivery", cascade = CascadeType.ALL)
    private List<CommodityDataEntity> commodityDataList;

}
