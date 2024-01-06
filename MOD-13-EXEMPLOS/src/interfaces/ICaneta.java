package interfaces;

public interface ICaneta {

    public  void escrever(String texto);

    public String getCor();

    default  void escreverComumATodas() {
        System.out.println("Ecrita igual a todas");
    }

}
