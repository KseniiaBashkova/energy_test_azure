package cz.mpsv.energy.energydatastorage.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Table(name = "address")
public class AddressEntity extends AbstractEntity {

    @Column(name="street", nullable = false)
    private String street;

    @Column(name="cp_ce")
    private String cpOrCe;

    @Column(name="co")
    private String co;

    @Column(name="city_part")
    private String cityPart;

    @Column(name="city", nullable = false)
    private String city;

    @Column(name="zip_code", nullable = false)
    private BigDecimal zipCode;

    @OneToMany(mappedBy = "address")
    private List<ClientEntity> clients;

    @OneToMany(mappedBy = "address")
    private List<PointOfDeliveryEntity> pointsOfDelivery;

}
