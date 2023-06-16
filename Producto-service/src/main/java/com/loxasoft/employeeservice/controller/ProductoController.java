package com.loxasoft.employeeservice.controller;

import com.loxasoft.employeeservice.dto.ResponseDTO;
import com.loxasoft.employeeservice.service.ProductoService;
import lombok.AllArgsConstructor;
import com.loxasoft.employeeservice.entity.Producto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
@AllArgsConstructor
public class ProductoController {

    private final ProductoService productoService;
    @PostMapping
    public Producto saveProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @GetMapping("/{codigo_producto}")
    public ResponseDTO getProductoById(@PathVariable Integer codigo_producto){
        return productoService.getProductoById(codigo_producto);
    }
}
