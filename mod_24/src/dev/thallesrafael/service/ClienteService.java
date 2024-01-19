package dev.thallesrafael.service;

import dev.thallesrafael.dao.ClienteDao;
import dev.thallesrafael.dao.IClienteDao;

public class ClienteService {
    private IClienteDao clienteDao;
    public ClienteService(IClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
}
