package domain;

import java.util.Vector;

public class Ejercicio3Vector {
    public static void main(String[] args) {
        Vector<String> nombres = new Vector<String>();

        nombres.add("Luis Fernando");
        nombres.add("Camila");
        nombres.add("Marcela");
        nombres.add("Karla");
        nombres.add("Francesca");

        int elemento1 = 1;
        int elemento2 = 2;


        for (String item: nombres){
            System.out.println("Datos en el Vector Son: " + item);
        }
        System.out.println("Eliminando.....");

        for (int i = 0; i <= nombres.size(); i++){
            if(i == elemento1 || i == elemento2){
                nombres.remove(1);
                continue;
            }
            if (i == 2){
                nombres.remove(1);
                break;
            }
        }

        for (String item: nombres){
            System.out.println("Datos en el Vector Son: " + item);
        }

    }
}
