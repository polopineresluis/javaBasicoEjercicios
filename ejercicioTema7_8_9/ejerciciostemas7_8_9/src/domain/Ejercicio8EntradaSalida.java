package domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Ejercicio8EntradaSalida {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream prueba  = new PrintStream("C:/Users/ACER/Dropbox/codigos_bootcamp/codigosparapracticar/luis.txt");
        FileInputStream a = new FileInputStream("C:/Users/ACER/Dropbox/codigos_bootcamp/codigosparapracticar/luis.txt");
        prueba(prueba,a);

    }


    public static void prueba(PrintStream fileIn, FileInputStream fileOut){
        try {
            fileIn.print("Hola Luis m");
            fileIn.flush();

            fileOut = new FileInputStream("C:/Users/ACER/Dropbox/codigos_bootcamp/codigosparapracticar/luis.txt");
            int valor = fileOut.read();
            while (valor !=-1){
                System.out.print((char) valor);
                valor = fileOut.read();
            }


        }catch (Exception e){
            System.out.println("No se puede leer el archivo" + e.getMessage());
        }
    }

}
