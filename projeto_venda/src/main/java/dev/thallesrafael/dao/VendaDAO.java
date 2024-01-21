
package main.java.dev.thallesrafael.dao;


import main.java.dev.thallesrafael.dao.generics.GenericDAO;
import main.java.dev.thallesrafael.domain.Venda;
import main.java.dev.thallesrafael.exceptions.TipoChaveNaoEncontradaException;


public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

	@Override
	public Class<Venda> getTipoClasse() {
		return Venda.class;
	}

	@Override
	public void atualizarDados(Venda entity, Venda entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setStatus(entity.getStatus());
	}

	@Override
	public void excluir(String valor) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
		venda.setStatus(Venda.Status.CONCLUIDA);
		super.alterar(venda);
	}
	
	

}
