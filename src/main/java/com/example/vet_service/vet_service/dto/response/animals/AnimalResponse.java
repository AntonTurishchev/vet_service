package com.example.vet_service.vet_service.dto.response.animals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalResponse {
    public String breed;
    public String name;
    public Integer age;
}
