package domain;

public class Pruebas {

    public static void main(String[] args) {


        //1. Tipos de Datos Numericos

        //Enteros
        byte variableByte = 5;
        short variableShor = 20;
        int vvariableInt = 27;
        long variableLong = 2003033020;
        //Envoltorio

        //Decimales
        float variableFloat = 65.4F;
        double variableDouble = 29.8;

        //boolean
        boolean vacaciones = true;


        //texto
        char variableChar = 'M';
        String variableString = "OpenBootcamp";

        System.out.println(" Informacion***********");
        imprimir(variableByte,variableShor,vvariableInt,variableLong,variableFloat,
                variableDouble,vacaciones,variableChar,variableString);

        System.out.println();




    }

    public static void imprimir(byte variableByte, short variableShor, int variableInt, long variableLong,
                            float variableFloat, double variableDouble, boolean vacaciones, char variableChar,
                            String variableString) {
        System.out.println("variableByte = " + variableByte);
        System.out.println("variableShor = " + variableShor);
        System.out.println("variableInt = " + variableInt);

        System.out.println("variableLong = " + variableLong);
        System.out.println("variableFloat = " + variableFloat);
        System.out.println("variableDouble = " + variableDouble);
        System.out.println("vacaciones = " + vacaciones);
        System.out.println("variableChar = " + variableChar);
        System.out.println("variableString = " + variableString);

    }


}
