package main.java.dev.thallesrafael.services;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import main.java.dev.thallesrafael.domain.Cliente;
import main.java.dev.thallesrafael.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {


     Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente bucarPorCpf(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cpf) throws TipoChaveNaoEncontradaException;
}
