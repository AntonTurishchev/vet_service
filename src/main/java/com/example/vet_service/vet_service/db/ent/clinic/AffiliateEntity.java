package com.example.vet_service.vet_service.db.ent.clinic;

import com.example.vet_service.vet_service.db.ent.person.DirectorEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "public", name = "affiliates")
public class AffiliateEntity extends ClinicEntity{

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "clinic")
    private ClinicEntity clinic;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String city;
    private String localName;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "director")
    private DirectorEntity director;

    // TODO: 01.03.2022 fetch 
    // TODO: 01.03.2022 OneToOne
    // TODO: 01.03.2022 @Column @JoinColumn

}
