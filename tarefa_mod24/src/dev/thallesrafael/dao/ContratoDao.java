package dev.thallesrafael.dao;

public class ContratoDao implements IContratoDao {
    @Override
    public void salvar(){
        throw new UnsupportedOperationException("Não funciona sem Configurar o banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não funciona sem configurar o banco");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não funciona sem configurar o banco");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não funciona sem configurar o banco");
    }
}
