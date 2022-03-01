package com.example.vet_service.vet_service.dto.response.animals;

import com.example.vet_service.vet_service.dto.response.ResponseInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetPassportResponse implements ResponseInterface {
    private Integer id;

}
