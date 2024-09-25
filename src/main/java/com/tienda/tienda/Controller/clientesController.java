package com.tienda.tienda.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.tienda.Models.clientes;
import com.tienda.tienda.Service.clienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/clientes")
public class clientesController  {

    @Autowired
    private clienteService ClientesService;

    @GetMapping("/")
    public Iterable<clientes> getClientes() {
        return this.ClientesService.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveClientes(@RequestBody clientes cliente) {
        try {
            System.out.println(cliente.getNombre() + " " + cliente.getApellido());
            this.ClientesService.save(cliente);
            return ResponseEntity.ok("Cliente guardado");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al guardar el cliente" + e.getMessage());
        }

    }

}
