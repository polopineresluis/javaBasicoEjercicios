package domain;

import java.util.ArrayList;

public class Ejercicio6ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> numerosEnteros = new ArrayList<Integer>(10);


        for (int i = 0; i < 10; i++) {
            numerosEnteros.add(i+1);
        }

        for (int i = 0; i < numerosEnteros.size(); i++){
            if(numerosEnteros.get(i) % 2 == 0){
                continue;
            }
            System.out.println("Numeros Impares " + numerosEnteros.get(i));
        }
    }
}
