public class Cliente {

    private int codigo;
    private String nome;
    private  String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndreco() {
        return endereco;
    }

    public void setEndreco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco){

        setEndreco(endereco);
    }

    public  void imprimirEndereco() {
        System.out.println(this.endereco);
    }

    public String retornarNomeCliente(){
        return  "Thalles Rafael";
    }

    public  int  idCliente () {
        return  1;
    }
}
