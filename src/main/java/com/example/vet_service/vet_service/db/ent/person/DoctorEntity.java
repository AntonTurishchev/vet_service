package com.example.vet_service.vet_service.db.ent.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "public", name = "doctors")
public class DoctorEntity {

    @Id
    private Integer license;

    private String name;
    private String surname;

}
