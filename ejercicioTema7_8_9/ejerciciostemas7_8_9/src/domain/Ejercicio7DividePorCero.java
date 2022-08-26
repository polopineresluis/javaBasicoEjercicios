package domain;

public class Ejercicio7DividePorCero {

    public static void main(String[] args) {

        try{
            int resultado = DividePorCero(20,0);
            System.out.println(resultado);

        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }
        finally {
            System.out.println("Demo de Código");
        }
    }


    public static int DividePorCero(int numero1, int numero2) throws ArithmeticException{

        int resultado = 0;
        try{
            resultado = numero1 / numero2;
        }catch (ArithmeticException e){
            throw new ArithmeticException("Esto no puede hacerse");
        }

        return  resultado;
    }
}
