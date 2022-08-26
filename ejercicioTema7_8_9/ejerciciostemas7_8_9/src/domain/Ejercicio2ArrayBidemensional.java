package domain;

public class Ejercicio2ArrayBidemensional {
    public static void main(String[] args) {
        int [][] numerosEnteros = new int[3][4];
        //int [][] numerosEnteros = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        numerosEnteros[0][0] = 1;
        numerosEnteros[0][1] = 2;
        numerosEnteros[0][2] = 3;
        numerosEnteros[0][3] = 4;

        //fila 1
        numerosEnteros[1][0] = 5;
        numerosEnteros[1][1] = 6;
        numerosEnteros[1][2] = 7;
        numerosEnteros[1][3] = 8;

        //fila 2 teniendo en cuenta que comienza desde cero
        numerosEnteros[2][0] = 9;
        numerosEnteros[2][1] = 10;
        numerosEnteros[2][2] = 11;
        numerosEnteros[2][3] = 12;


        System.out.println(numerosEnteros.length);
        for (int filas = 0; filas < numerosEnteros.length; filas++){
            System.out.println("");
            for (int columnas = 0; columnas < numerosEnteros[filas].length; columnas++){
                System.out.println("Fila: " + filas + " En la columna " + columnas + " Su Valor Es: " + numerosEnteros[filas][columnas]);
            }
        }

    }
}
