package com.example.vet_service.vet_service.db.ent.clinic;

import com.example.vet_service.vet_service.db.ent.person.DoctorEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "public", name = "assignments")
public class AssignmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "doctor")
    private DoctorEntity doctor;

    @ManyToOne
    @JoinColumn (name = "clinic")
    private AffiliateEntity affiliate;
}
