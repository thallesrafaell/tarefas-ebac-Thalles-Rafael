package test.java.dev.thallesrafael;

import main.java.dev.thallesrafael.dao.IClienteDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.dev.thallesrafael.domain.Cliente;
import main.java.dev.thallesrafael.services.ClienteService;
import main.java.dev.thallesrafael.services.IClienteService;
import test.java.dev.thallesrafael.dao.ClienteDAOMock;


public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }
        @Before
        public void init(){
            cliente = new Cliente();
            cliente.setNome("Thalles");
            cliente.setCPF(12345678910L);
            cliente.setTel(12456789L);
            cliente.getEndereco("Sebastião Bonito");
            cliente.getNumero(475);
            cliente.getCidade("Santa Vitória MG");
            cliente.getEstado("Minas Gerais");

            clienteService.salvar(cliente);
        }

        @Test
        public void pesquisarCliente () {
            Cliente clienteConsultado = clienteService.bucarPorCpf(cliente.getCPF());
            Assert.assertNotNull(clienteConsultado);
        }

        @Test
        public void salvarCliente(){
         Boolean retorno = clienteService.salvar(cliente);
            Assert.assertTrue(retorno);
        }

        @Test
    public void excluirCliente(){
            clienteService.excluir(cliente.getCPF());
        }

    public void alterarCliente(){

        cliente.setNome("Thalles Rafael");
        clienteService.alterar(cliente.getCPF());
        Assert.assertEquals("Thalles Rafael", cliente.getNome());
    }

}
