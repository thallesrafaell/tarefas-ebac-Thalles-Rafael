/**
 * 
 */
package test.java.dev.thallesrafael;


import main.java.dev.thallesrafael.dao.IProdutoDAO;
import main.java.dev.thallesrafael.domain.Produto;
import main.java.dev.thallesrafael.exceptions.TipoChaveNaoEncontradaException;
import main.java.dev.thallesrafael.services.IProdutoService;
import main.java.dev.thallesrafael.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.dev.thallesrafael.dao.ProdutoDaoMock;

import java.math.BigDecimal;


public class ProdutoServiceTest {

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}
	
	@Test
	public void pesquisar() {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Thalles Rafael");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Thalles Rafael", produto.getNome());
	}
}
