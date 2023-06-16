package com.laxosoft.serviceasistencia.dto;

import com.laxosoft.serviceasistencia.entity.Asistencia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

    private Asistencia asistencia;
    private EmployeeDTO employeeDTO;
    private DepartamentDTO departamentDTO;
}
