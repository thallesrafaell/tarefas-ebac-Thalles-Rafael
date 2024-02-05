package main.java.dev.thallesrafael.services.generics;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import main.java.dev.thallesrafael.domain.Cliente;
import main.java.dev.thallesrafael.exceptions.DAOException;
import main.java.dev.thallesrafael.exceptions.MaisDeUmRegistroException;
import main.java.dev.thallesrafael.exceptions.TableException;
import main.java.dev.thallesrafael.services.IClienteService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    //private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        //this.clienteDAO = clienteDAO;
    }

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}