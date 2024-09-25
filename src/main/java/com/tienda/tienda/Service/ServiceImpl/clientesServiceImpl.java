package com.tienda.tienda.Service.ServiceImpl;

import org.springframework.stereotype.Service;

import com.tienda.tienda.Models.clientes;
import com.tienda.tienda.Repository.clientesRepository;
import com.tienda.tienda.Service.clienteService;
import com.tienda.tienda.common.CommonSvcImpl;

@Service
public class clientesServiceImpl extends CommonSvcImpl<clientes, clientesRepository> implements clienteService {

    @Override
    public Iterable<clientes> findAll() {
        return repository.findAll();
    }
    
}
