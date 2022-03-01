package com.example.vet_service.vet_service.dto.response.persons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorLicenseResponse {
    private Integer id;
    private DoctorResponse doctor;
    private Date dateOfStart;
    private Date dateOfEnd;

}
