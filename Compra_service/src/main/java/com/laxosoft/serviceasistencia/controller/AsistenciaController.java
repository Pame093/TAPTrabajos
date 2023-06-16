package com.laxosoft.serviceasistencia.controller;

import com.laxosoft.serviceasistencia.dto.ResponseDTO;
import com.laxosoft.serviceasistencia.entity.Asistencia;
import com.laxosoft.serviceasistencia.service.AsistenciaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/asistencias")
@AllArgsConstructor
public class AsistenciaController {
    private final AsistenciaService asistenciaService;

    @PostMapping
    public Asistencia saveEmployee(@RequestBody Asistencia asistencia){
        return asistenciaService.saveAsistencia(asistencia);
    }

    @GetMapping("/{id}")
    public ResponseDTO getAsistenciaById(@PathVariable Integer id){
        return asistenciaService.getAsistenciaById(id);
    }
}
