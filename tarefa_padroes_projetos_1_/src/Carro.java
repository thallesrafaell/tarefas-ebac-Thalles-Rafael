public abstract class Carro {

    private  int cavalos;
    private String combustivel;
    private  String cor;

    private String modelo;


    public Carro (int cavalos, String combustivel,String cor, String modelo ) {
        this.cavalos = cavalos;
        this.combustivel = combustivel;
        this.cor = cor;
        this.modelo = modelo;

    }

    public void montagemDoMotor(){
        System.out.println("O motor foi montado e possui " + cavalos + " de força!");
    }

    public void pintura() {
        System.out.println("O " + modelo + "foi limpo e pintado de " + cor + "!");
    }

    public void checkList(){
        System.out.println("Todos sistemas checados e prontos para uso!");
    }

    public void abastecer(){
        System.out.println("O " + modelo  + " foi abastecido com " + combustivel + " e está pronto para checklist!.");
    }

}
