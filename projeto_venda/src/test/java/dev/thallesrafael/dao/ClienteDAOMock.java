package test.java.dev.thallesrafael.dao;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import main.java.dev.thallesrafael.domain.Cliente;
import main.java.dev.thallesrafael.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteDAOMock implements IClienteDAO {


    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCPF(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
