package com.example.vet_service.vet_service.db.ent.person;

import com.example.vet_service.vet_service.db.ent.clinic.AffiliateEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "public", name = "administrators")
public class AdministratorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn (name = "affiliate")
    private AffiliateEntity affiliate;

    private String name;
    private String surname;
    private Integer phone;

    @OneToOne
    @JoinColumn (name = "chief")
    private DirectorEntity boss;

}
