package main.java.dev.thallesrafael.services;

import main.java.dev.thallesrafael.domain.Cliente;
import main.java.dev.thallesrafael.exceptions.DAOException;
import main.java.dev.thallesrafael.services.generics.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
