package com.example.vet_service.vet_service.db.ent.clinic;

import com.example.vet_service.vet_service.db.ent.animals_entity.AnimalsEntity;
import com.example.vet_service.vet_service.db.ent.person.DoctorEntity;
import com.example.vet_service.vet_service.db.ent.person.OwnerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "public", name = "assignments")
public class AssignmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Time timeStart;
    private Time timeEnd;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "doctor")
    private DoctorEntity doctor;


    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "client")
    private OwnerEntity client;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "pet")
    private AnimalsEntity pet;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "affiliate")
    private AffiliateEntity affiliate;


}
