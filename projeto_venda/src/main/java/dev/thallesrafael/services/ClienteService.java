package main.java.dev.thallesrafael.services;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import main.java.dev.thallesrafael.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO dao){
        this.clienteDAO = dao;
    }
    @Override
    public Boolean salvar(Cliente cliente) {

        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente bucarPorCpf(Long cpf) {
        return clienteDAO.bucarPorCpf(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Long cpf) {
        clienteDAO.alterar(cpf);
    }
}
