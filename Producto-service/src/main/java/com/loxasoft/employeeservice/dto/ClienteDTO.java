package com.loxasoft.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
    private Integer id_cliente;
    private String cedula;
    private String nombre;
    private String correo;
    private String telefono;

}
