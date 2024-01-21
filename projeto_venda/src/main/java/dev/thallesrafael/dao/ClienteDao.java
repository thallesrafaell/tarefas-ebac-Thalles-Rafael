package main.java.dev.thallesrafael.dao;

import main.java.dev.thallesrafael.dao.generics.GenericDAO;
import main.java.dev.thallesrafael.domain.Cliente;
import main.java.dev.thallesrafael.domain.Persistente;

public class ClienteDao extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDao(){
        super();
    }

    public Class<Cliente> getTipoClasse(){
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
