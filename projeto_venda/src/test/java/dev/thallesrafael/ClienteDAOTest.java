package test.java.dev.thallesrafael;

import main.java.dev.thallesrafael.dao.ClienteDao;
import main.java.dev.thallesrafael.dao.IClienteDAO;
import main.java.dev.thallesrafael.domain.Cliente;
import main.java.dev.thallesrafael.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.dev.thallesrafael.dao.ClienteDAOMock;

public class ClienteDAOTest {

    private IClienteDAO clienteDAO;
    private Cliente cliente;
    public ClienteDAOTest(){
        clienteDAO = new ClienteDAOMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setNome("Thalles Rafael");
        cliente.setCPF(12345678910L);
        cliente.setTel(12456789L);
        cliente.getEndereco("Sebastião Bonito");
        cliente.getNumero(475);
        cliente.getCidade("Santa Vitória MG");
        cliente.getEstado("Minas Gerais");

        clienteDAO.cadastrar(cliente);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCPF());
    }

    public void excluirCliente(){
        clienteDAO.excluir(cliente.getCPF());
    }

    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(cliente);
    }


}
