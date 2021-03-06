package com.example.vet_service.vet_service.dto.request.persons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequest {
    public String name;
    public String surname;
    public Integer age;
}
