package de.szut.lf8_starter.EmployeeWebServiceAccessPoint.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GetQualificationDto {
    private Long id;
    private String skill;
}
