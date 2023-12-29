
/**
 * @author thalles.Rafael
 * @version 1.0.0
 * @since 01/29/2023
 */
public class Ventilador {

    private String modelo;

    private String marca;


    private int velocidades;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public void imprimeVentilador(String modelo, String marca, int velocidades) {
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setVelocidades(velocidades);

        System.out.println("--------------------");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Marca: " +this.getMarca());
        System.out.println("Velocidade: " +this.getVelocidades());
        System.out.println("--------------------");
    }
}
