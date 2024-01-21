package main.java.dev.thallesrafael.dao;

import main.java.dev.thallesrafael.domain.Cliente;

public class ClienteDao implements IClienteDAO {
    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente bucarPorCpf(Long cpf) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Long cpf) {

    }
}
