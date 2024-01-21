/**
 * 
 */
package main.java.dev.thallesrafael.services;


import main.java.dev.thallesrafael.dao.IProdutoDAO;
import main.java.dev.thallesrafael.domain.Produto;
import main.java.dev.thallesrafael.services.generics.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
