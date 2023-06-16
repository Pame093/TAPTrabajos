package com.laxosoft.serviceasistencia.service;

import com.laxosoft.serviceasistencia.dto.DepartamentDTO;
import com.laxosoft.serviceasistencia.dto.EmployeeDTO;
import com.laxosoft.serviceasistencia.dto.ResponseDTO;
import com.laxosoft.serviceasistencia.entity.Asistencia;
import com.laxosoft.serviceasistencia.repository.AsistenciaRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class AsistenciaService {
    private  final AsistenciaRepository asistenciaRepository;
    private final RestTemplate restTemplate;

    public Asistencia saveAsistencia(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    public ResponseDTO getAsistenciaById(Integer id){
        ResponseDTO responseDTO = new ResponseDTO();
        Asistencia asistencia = new Asistencia();
        asistencia = asistenciaRepository.findById(id).get();


        ResponseEntity<DepartamentDTO> responseEntity = restTemplate.getForEntity("http://localhost:8083/api/departaments/"+asistencia.getDepartamentoId(),
                DepartamentDTO.class);
        DepartamentDTO departamentDTO = responseEntity.getBody();
        ResponseEntity<EmployeeDTO> responseEntity1 = restTemplate.getForEntity("http://localhost:8082/employes/"+asistencia.getEmployeId(),
                EmployeeDTO.class);

        EmployeeDTO employeeDTO = responseEntity1.getBody();

        responseDTO.setAsistencia(asistencia);
        responseDTO.setDepartamentDTO(departamentDTO);
        responseDTO.setEmployeeDTO(employeeDTO);

        return responseDTO;

        }
}
