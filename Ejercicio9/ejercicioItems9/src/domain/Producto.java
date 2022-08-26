package domain;

public class Producto {

    private int id;
    private static  int contadorProductos;
    private String nombre;

    private float stock;
    private float precio_compra;
    private float precio_venta;
    private float iva;
    private float stock_mi;
    private float stock_max;

    public Producto() {
        Producto.contadorProductos++;
        this.id = Producto.contadorProductos;
    }

    public Producto(String nombre, float stock) {
        this();
        this.nombre = nombre;
        this.stock = stock;
    }

    public Producto(String nombre, float stock,
                    float precio_compra, float precio_venta,
                    float iva, float stock_mi, float stock_max) {
        this();
        this.nombre = nombre;
        this.stock = stock;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.iva = iva;
        this.stock_mi = stock_mi;
        this.stock_max = stock_max;

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public float getIva() {

        float iva = precio_venta*19/100;

        this.iva = iva;
        if(precio_venta <= 20000){
            System.out.println("Excepto del iva");
            return  0;
        }
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getStock_mi() {
        return stock_mi;
    }

    public void setStock_mi(float stock_mi) {
        this.stock_mi = stock_mi;
    }

    public float getStock_max() {
        return stock_max;
    }

    public void setStock_max(float stock_max) {
        this.stock_max = stock_max;
    }

    public void imprimir(){
        System.out.println("Id: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Stock: " + this.stock);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Id:").append(this.id);
        sb.append(" Nombre: ").append(this.nombre);
        sb.append(" Stock: ").append(this.stock);
        sb.append(" Precio Compra: ").append(this.precio_compra);
        sb.append(" Precio Venta: ").append(this.precio_venta);
        sb.append(" Iva: ").append(this.iva);
        sb.append(" Stock Minimo: ").append(this.stock_mi);
        sb.append(" Stock Maximo: ").append(this.stock_max);

        return sb.toString();
    }
}
