package com.loxasoft.departamentservice.controllers;

import com.loxasoft.departamentservice.entity.Cliente;
import com.loxasoft.departamentservice.service.ClienteService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;

    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){

        return clienteService.createCliente(cliente);
    }

    @GetMapping("/{id_cliente}")
    public Cliente getClienteById(@PathVariable Integer id_cliente){
        return clienteService.getClienteById(id_cliente);
    }

    @GetMapping
    public List<Cliente> findAll(){

        return clienteService.findAll();
    }

    /*@PutMapping("/cliente/{id_cliente}")
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Integer id_cliente) {
        Cliente ClienteActual = clienteService.findbyid(id_cliente);
        ClienteActual.setId_cliente(cliente.getId_cliente());
        ClienteActual.setCedula(cliente.getCedula());
        ClienteActual.setCorreo(cliente.getCorreo());
        ClienteActual.setNombre(cliente.getNombre());
        ClienteActual.setTelefono(cliente.getTelefono());


        return clienteService.createCliente(ClienteActual);

    }*/
    /*@DeleteMapping("/cliente/{id}")

    public void delete(@PathVariable Integer id_cliente) {
        clienteService.deleteCliente(id_cliente);
    }*/



}
