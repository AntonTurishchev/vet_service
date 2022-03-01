package com.example.vet_service.vet_service.dto.request.animals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalRequest {
    private String breed;
    private String name;
    private Integer age;
}
