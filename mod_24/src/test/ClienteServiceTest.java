package test;

import dev.thallesrafael.dao.ClienteDao;
import dev.thallesrafael.dao.ClienteDaoMock;
import dev.thallesrafael.dao.IClienteDao;
import dev.thallesrafael.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){

        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);

        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroSalvar(){

        IClienteDao clienteDao = new ClienteDao();
        ClienteService service = new ClienteService(clienteDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
        
    }
}
