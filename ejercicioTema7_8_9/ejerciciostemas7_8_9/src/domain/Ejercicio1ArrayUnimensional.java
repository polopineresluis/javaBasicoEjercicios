package domain;

public class Ejercicio1ArrayUnimensional {
    public static void main(String[] args) {
        //String[] nombres =  {"Luis Fernando","Karla","OpenBootCamp"};
        String[] nombres = new String[3];
        nombres[0] = "Luis Fernando";
        nombres[1] = "Karla";
        nombres[2] = "OpenBootCamp";

        for (String item: nombres){
            System.out.println("Nombres Existentes:  " + item);
        }
    }
}
