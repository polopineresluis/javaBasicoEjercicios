package domain;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio5ArrayListCopiaLinkedList {
    public static void main(String[] args) {
        ArrayList<String>  paises = new ArrayList<String>();
        paises.add("Colombia");
        paises.add("España");
        paises.add("Argentina");
        paises.add("Brasil");

        LinkedList<ArrayList> copiaArrayList = new LinkedList<ArrayList>((ArrayList)paises);

        System.out.println("Mostrando los datos de ArrayList");
        for (String pais : paises){
            System.out.println("Nombres: " + pais);
        }

        System.out.println("Mostrando los datos LinkedList Copia de ArrayList");

        for (ArrayList<String> copiaDatos : copiaArrayList){
            System.out.println("Nombres: " + copiaDatos);
        }

    }
}
