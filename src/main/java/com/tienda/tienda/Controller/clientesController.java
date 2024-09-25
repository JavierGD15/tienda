package com.tienda.tienda.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.tienda.Models.clientes;
import com.tienda.tienda.Service.clienteService;
import com.tienda.tienda.common.CommonController;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/clientes")
public class clientesController extends CommonController<clientes, clienteService> {


    @GetMapping("/")
    public Iterable<clientes> getClientes() {
        return this.service.findAll();
    }
    
    
}
