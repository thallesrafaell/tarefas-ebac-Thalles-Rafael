package main.java.dev.thallesrafael.services;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import main.java.dev.thallesrafael.domain.Cliente;

public interface IClienteService {


     void salvar(Cliente cliente);

    Cliente bucarPorCpf(Long cpf);

}
