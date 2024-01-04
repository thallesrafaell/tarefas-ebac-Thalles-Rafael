public class Pessoa {

    public  String nome;

    public String sexo;

    public  Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.nome);
    }


    public String getNome() {
       return nome;
    }

    public String getSexo() {
        return sexo;
    }
}
