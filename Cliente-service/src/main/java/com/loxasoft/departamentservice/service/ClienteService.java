package com.loxasoft.departamentservice.service;

import com.loxasoft.departamentservice.entity.Cliente;
import com.loxasoft.departamentservice.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente createCliente (Cliente cliente){

        return clienteRepository.save(cliente);
    }

    public Cliente getClienteById(Integer id_cliente) {

        return clienteRepository.findById(id_cliente).get();
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }




}
