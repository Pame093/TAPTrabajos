package com.loxasoft.employeeservice.dto;

import com.loxasoft.employeeservice.entity.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

    private Producto employee;
    private ClienteDTO clienteDTO;



}
