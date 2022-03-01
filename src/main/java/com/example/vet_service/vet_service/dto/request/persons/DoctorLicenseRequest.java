package com.example.vet_service.vet_service.dto.request.persons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorLicenseRequest {
    private Integer id;
    private DoctorRequest doctor;
    private Date dateOfStart;
    private Date dateOfEnd;

}
