package main.java.dev.thallesrafael.services;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import main.java.dev.thallesrafael.domain.Cliente;
import main.java.dev.thallesrafael.exceptions.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO dao){
        this.clienteDAO = dao;
    }
    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {

        return clienteDAO.cadastrar(cliente);
    }

    @Override
    public Cliente bucarPorCpf(Long cpf)  {
        return clienteDAO.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cpf) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(cpf);
    }
}
