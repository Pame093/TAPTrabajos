package com.loxasoft.employeeservice.service;

import com.loxasoft.employeeservice.dto.DepartamentDTO;
import com.loxasoft.employeeservice.dto.ResponseDTO;
import com.loxasoft.employeeservice.entity.Employee;
import com.loxasoft.employeeservice.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class EmployeeService {

    private  final EmployeeRepository employeeRepository;
    private final RestTemplate restTemplate;

    public Employee saveEmploye(Employee employee) {
        return employeeRepository.save(employee);
    }

    public ResponseDTO getEmployeById(Integer id){
        ResponseDTO responseDTO = new ResponseDTO();
        Employee employee = new Employee();
        employee = employeeRepository.findById(id).get();

        ResponseEntity<DepartamentDTO> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/departaments/"+employee.getDepartamentId(),
                DepartamentDTO.class);

        DepartamentDTO departamentDTO = responseEntity.getBody();

        responseDTO.setEmployee(employee);
        responseDTO.setDepartamentDTO(departamentDTO);

        return responseDTO;

    }
}
