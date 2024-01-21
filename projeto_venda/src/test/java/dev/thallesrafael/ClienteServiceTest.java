package test.java.dev.thallesrafael;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import org.junit.Assert;
import org.junit.Test;

import main.java.dev.thallesrafael.domain.Cliente;
import main.java.dev.thallesrafael.services.ClienteService;
import main.java.dev.thallesrafael.services.IClienteService;


public class ClienteServiceTest {

    private IClienteService clienteService;


    public ClienteServiceTest(){

        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Test
    public void pesquisarCliente(){

        Cliente cliente = new Cliente();
        cliente.setNome("Thalles Rafael");
        cliente.setCPF(12345678910L);
        cliente.setTel(12456789L);
        cliente.getEndereco("Sebastião Bonito");
        cliente.getNumero(475);
        cliente.getCidade("Santa Vitória MG");
        cliente.getEstado("Minas Gerais");

        clienteService.salvar(cliente);
        Cliente clienteConsultado = clienteService.bucarPorCpf(cliente.getCPF());

        Assert.assertNotNull(clienteConsultado);









    }
}
