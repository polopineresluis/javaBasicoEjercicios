package domain;

public class CadenaInvertida {
    public static void main(String[] args) {

        System.out.println(reverse("Hola mundo"));
    }
   public static String reverse(String texto){

        StringBuilder cadenaInvertida = new StringBuilder(texto);
        return cadenaInvertida.reverse().toString();

    }
}

