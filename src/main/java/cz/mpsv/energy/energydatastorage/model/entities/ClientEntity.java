package cz.mpsv.energy.energydatastorage.model.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@EqualsAndHashCode(callSuper=false)
@Table(name = "client")
public class ClientEntity extends AbstractEntity {

    @Column(name="client_id", nullable = false)
    private String clientId;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name="date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "address_id", nullable = false)
    private AddressEntity address;

    @OneToMany(mappedBy = "client", cascade=CascadeType.ALL)
    private List<EnergyDataEntity> energyData;
}
