package main.java.dev.thallesrafael.services;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import main.java.dev.thallesrafael.domain.Cliente;

public interface IClienteService {


     Boolean salvar(Cliente cliente);

    Cliente bucarPorCpf(Long cpf);

    void excluir(Long cpf);

    void alterar(Long cpf);
}
