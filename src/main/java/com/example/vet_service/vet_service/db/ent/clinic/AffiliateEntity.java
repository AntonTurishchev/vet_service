package com.example.vet_service.vet_service.db.ent.clinic;

import com.example.vet_service.vet_service.db.ent.person.AdministratorEntity;
import com.example.vet_service.vet_service.db.ent.person.DirectorEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "public", name = "affiliate")
public class AffiliateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "filial_of")
    private ClinicEntity clinic;

    private String city;
    private String localName;
    private String address;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "director")
    private DirectorEntity director;

    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "administrator")
    private AdministratorEntity administrator;





}
