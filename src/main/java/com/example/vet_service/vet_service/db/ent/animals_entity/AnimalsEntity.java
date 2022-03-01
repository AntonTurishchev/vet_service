package com.example.vet_service.vet_service.db.ent.animals_entity;

import com.example.vet_service.vet_service.db.ent.person.OwnerEntity;
import com.example.vet_service.vet_service.dto.PetSpecies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "public", name = "animals")
public class AnimalsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "species")
    private PetSpecies species;

    private String breed;
    private String name;
    private Integer age;

    @ManyToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "Owner", nullable = true)
    // TODO: 01.03.2022 посмотреть nullable=true
    private OwnerEntity owner;
}

// TODO: 01.03.2022 сделать медицинскую карту животного