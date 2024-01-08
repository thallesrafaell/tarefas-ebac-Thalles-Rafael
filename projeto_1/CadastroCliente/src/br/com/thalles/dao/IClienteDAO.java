package br.com.thalles.dao;

import br.com.thalles.domain.Cliente;

import javax.swing.plaf.PanelUI;
import java.util.Collection;
import java.util.Collections;

public interface IClienteDAO {

    public Boolean cadstrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public  Cliente consultar(Long cpf);

    public  Collection<Cliente> bucarTodos();


}
