package main.java.dev.thallesrafael.domain;

public class Cliente {

    private String nome;
    private Long CPF;
    private Long tel;
    private String endereco;
    private Integer numero;
    private String cidade;
    private String estado;

    public void setCPF(long cpf) {
        this.CPF = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getEndereco(String endereco) {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero(int numero) {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade(String cidade) {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado(String estado) {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
