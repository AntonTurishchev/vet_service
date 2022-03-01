package com.example.vet_service.vet_service.db.ent.person;

import com.example.vet_service.vet_service.db.ent.animals_entity.AnimalsEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "public", name = "clients")
public class OwnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private Integer age;

    @JsonIgnore
    @OneToMany(mappedBy = "owner_id", fetch = FetchType.EAGER)
    private List<AnimalsEntity> pets;




}
