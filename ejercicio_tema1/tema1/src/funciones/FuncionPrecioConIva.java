package funciones;

public class FuncionPrecioConIva {
    public static void main(String[] args) {

        double precioMasIva = getPrecioMasIva(10000);
        System.out.println("Total Apagar = " + precioMasIva);
    }

    public static double getPrecioMasIva(double precio) {
        final double IVA = 0.19;
        double resultado = precio * IVA;

        return precio+resultado;

    }
}
