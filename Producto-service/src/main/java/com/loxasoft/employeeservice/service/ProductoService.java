package com.loxasoft.employeeservice.service;

import com.loxasoft.employeeservice.dto.ClienteDTO;
import com.loxasoft.employeeservice.dto.ResponseDTO;
import com.loxasoft.employeeservice.entity.Producto;
import com.loxasoft.employeeservice.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class ProductoService {

    private  final ProductoRepository productoRepository;
    private final RestTemplate restTemplate;

    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public ResponseDTO getProductoById(Integer codigo_producto){
        ResponseDTO responseDTO = new ResponseDTO();
        Producto producto= new Producto();
        producto = productoRepository.findById(codigo_producto).get();

        ResponseEntity<ClienteDTO> responseEntity = restTemplate.getForEntity("http://localhost:8081/api/clientes/"+producto.getClienteId(),
                ClienteDTO.class);

        ClienteDTO clienteDTO = responseEntity.getBody();

        responseDTO.setEmployee(producto);
        responseDTO.setClienteDTO(clienteDTO);

        return responseDTO;

    }
}
