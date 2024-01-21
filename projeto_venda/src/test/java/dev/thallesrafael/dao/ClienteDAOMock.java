package test.java.dev.thallesrafael.dao;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import main.java.dev.thallesrafael.domain.Cliente;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public Boolean salvar(Cliente cliente) {

        return true;
    }

    @Override
    public Cliente bucarPorCpf(Long cpf) {
        Cliente cliente =  new Cliente();
        cliente.setCPF(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Long cpf) {

    }
}
