package com.tienda.tienda.Service;

import com.tienda.tienda.Models.clientes;
import com.tienda.tienda.common.CommonSvc;

public interface clienteService extends CommonSvc<clientes> {

    public Iterable<clientes> findAll();
}
