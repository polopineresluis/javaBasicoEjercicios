package estructuraDeDatos;

public class ejercicioNumero3 {

    public static void main(String[] args) {
        String[] nombres = {"Pepe","Juan","Anthony"};

        String nombreUnidos = "";

        for(int i=0; i<nombres.length; i++){

            if(i < nombres.length){
                nombreUnidos += " " +nombres[i];
            }
        }

        System.out.println(nombreUnidos);


    }
}
