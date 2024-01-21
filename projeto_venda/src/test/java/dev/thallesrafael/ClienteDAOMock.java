package test.java.dev.thallesrafael;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import main.java.dev.thallesrafael.domain.Cliente;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente bucarPorCpf(Long cpf) {
        Cliente cliente =  new Cliente();
        cliente.setCPF(cpf);
        return cliente;
    }
}
