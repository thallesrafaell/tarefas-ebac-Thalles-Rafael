import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Car>  carList = new ArrayList<>();
        Factory fabrica = new Factory();
        carList.add(fabrica.getCorola());
        carList.add(fabrica.getCompass());
        carList.add(fabrica.getDolphin());
        carList.add(fabrica.getGol());
        carList.add(fabrica.getKwid());
        carList.add(fabrica.getUno());


        for (Car carro : carList){
            System.out.println(carro.toString());
        }





    }
}