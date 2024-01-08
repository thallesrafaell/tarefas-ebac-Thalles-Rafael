package br.com.thalles.dao;

import br.com.thalles.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientMapDAO implements IClienteDAO{
    private Map<Long, Cliente> map;

    public ClientMapDAO(){
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadstrar(Cliente cliente) {
        if(this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return  true;
    }

    @Override
    public void excluir(Long cpf) {

        Cliente clienteCadastrado = this.map.get(cpf);

        if(clienteCadastrado != null){
            this.map.remove(clienteCadastrado.getCpf(),clienteCadastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
      return  this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> bucarTodos() {
        return this.map.values();
    }


}
