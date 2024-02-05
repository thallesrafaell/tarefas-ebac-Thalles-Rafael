package test.java.dev.thallesrafael;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.java.dev.thallesrafael.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}
