package com.example.vet_service.vet_service.dto.response.persons;

import com.example.vet_service.vet_service.dto.response.ResponseInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorResponse extends PersonResponse implements ResponseInterface {
    private int id;

}
