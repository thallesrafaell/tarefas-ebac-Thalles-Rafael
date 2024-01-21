package main.java.dev.thallesrafael.dao;

import main.java.dev.thallesrafael.domain.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);

    Cliente bucarPorCpf(Long cpf);
}
