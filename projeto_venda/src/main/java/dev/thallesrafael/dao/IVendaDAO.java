/**
 * 
 */
package main.java.dev.thallesrafael.dao;


import main.java.dev.thallesrafael.dao.generics.IGenericDAO;
import main.java.dev.thallesrafael.domain.Venda;
import main.java.dev.thallesrafael.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {



	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
