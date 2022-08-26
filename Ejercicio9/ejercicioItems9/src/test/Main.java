package test;

import domain.Producto;

import javax.swing.*;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static Producto productoEncontrado;
    static ArrayList<Producto> productos;

    public static void main(String[] args) {
        mostrarMenu();

    }

    public static void mostrarMenu() {
        scanner = new Scanner(System.in);
        System.out.println("Digite una opcion");
        int op;
        do {
            System.out.println("1.Agregar Producto\n2.Buscar\n3.Buscar Por Id\n" +
                    "4.Modificar\n5.Eliminar\n7.Realizar Copia\n8.Leer Copia\n9.Salir");
            op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1) {
                ingresarProducto();
            } else if (op == 2) {
                imprimir(productos);

            } else if (op == 3) {
                try {
                    buscarCriterio(productos);
                } catch (NullPointerException e) {
                    System.out.println("Error: No Se encontro datos para mostrar");
                    mostrarMenu();
                }
            } else if (op == 4) {
                modificarProducto(productos);
            } else if (op == 5) {
                eliminarProducto(productos);
            } else if (op == 7) {
                try {
                    copiaTxtArrayList(productos);
                } catch (Exception e) {
                    System.out.println("Erro: Contacta al Desarrollador");
                }
            } else if (op == 8) {
                try {
                    leerTxtArrayList(productos);
                } catch (Exception e) {
                    System.out.println("Error: Contacta al Desarrollado");
                }
            } else {
                System.out.println("Adios..");
            }

        } while (op != 9);
    }

    public static void ingresarProducto() {

        scanner = new Scanner(System.in);
        System.out.println("cuantos Productos Vas a Digitar?");
        int n = scanner.nextInt();
        scanner.nextLine();

        try {

            ArrayList<Producto> prods = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println("Nombre del Producto: ");
                String nombre = scanner.nextLine();
                System.out.println("Digite Stock Existente");
                float stock = scanner.nextFloat();
                scanner.nextLine();
                System.out.println("Digite Precio de Compra");
                float precio_compra = scanner.nextFloat();
                scanner.nextLine();
                System.out.println("Digite Precio de Venta");
                float precio_venta = scanner.nextFloat();
                scanner.nextLine();
                System.out.println("Digite El Iva");
                float iva = scanner.nextFloat();
                scanner.nextLine();
                System.out.println("Digite Stock Minimo");
                float stock_min = scanner.nextFloat();
                scanner.nextLine();
                System.out.println("Digite Stock Maximo");
                float stock_max = scanner.nextFloat();
                scanner.nextLine();
                // productos = new ArrayList<Producto>();
                //productos.add(new Producto(nombre,stock));

                prods.add(productoEncontrado = new Producto(nombre, stock, precio_compra,
                        precio_venta, iva, stock_min, stock_max));
                productos = prods;
            }

        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Se esta presentando Error en los datos que Esta Introduciendo",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void imprimir(ArrayList<Producto> productos) {

        try {
            for (Producto i : productos) {
                System.out.println(i);
            }

        } catch (NullPointerException e) {
            System.out.println("No Existe productos, Agrege uno ");
        }
    }

    public static void buscarCriterio(ArrayList<Producto> producto) throws NullPointerException {
        scanner = new Scanner(System.in);
        System.out.println("Digite el Id:");
        int id = scanner.nextInt();

        boolean encontrado = false;

        try {
            for (int i = 0; i < producto.size(); i++) {
                if (producto.get(i).getId() == id) {
                    encontrado = true;
                    productoEncontrado = producto.get(i);
                }
            }

            if (encontrado != false) {
                System.out.println(productoEncontrado);
            } else {
                System.out.println("E ID: " + id + " No Existe");
            }

        } catch (NullPointerException e) {
            throw new NullPointerException("Error: no hay datos que mostrar");
        }

    }

    public static void modificarProducto(ArrayList<Producto> producto) {

        LinkedList<Producto> copiaProducto = new LinkedList<>(producto);

        for (Producto p : copiaProducto) {
            System.out.println(p);
        }
        scanner = new Scanner(System.in);
        System.out.println("Que producto quiere Modificar");
        int id = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < copiaProducto.size(); i++) {
            if (copiaProducto.get(i).getId() == id) {
                encontrado = true;
                productoEncontrado = copiaProducto.get(i);
            }
        }

        if (encontrado != false) {
            System.out.println(productoEncontrado);
            System.out.println("Que dato Vas a modificar?");
            System.out.println("1.Nombre\n2.Stock\n3.Precio Compra" +
                    "\n.4.Precio Venta\n5.Iva\n6.Stock Minimo\n7.Stock Maximo");
            int opc = scanner.nextInt();
            scanner.nextLine();

            if (opc == 1) {
                System.out.println("Digite el Nombre");
                String nombre = scanner.nextLine();
                productoEncontrado.setNombre(nombre);
            }
        }
    }

    public static void eliminarProducto(ArrayList<Producto> producto) {

        for (Producto p : producto) {
            System.out.println(p);
        }
        scanner = new Scanner(System.in);
        System.out.println("Digite El Id del Producto que deseas Eliminar");
        int id = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i).getId() == id) {
                productoEncontrado = producto.get(i);
                encontrado = true;
            }
        }

        if (encontrado != false) {
            producto.remove(productoEncontrado);
            System.out.println("Producto Eliminado...");
        } else {
            System.out.println("Producto no Encontrado");
        }
    }

    public static void copiaTxtArrayList(ArrayList<Producto> producto) throws FileNotFoundException, IOException {
        try {
            PrintStream add = new PrintStream("C:/Users/ACER/Dropbox/codigos_bootcamp/codigosparapracticar/pruebLuis.txt");
            add.print(producto);
        } catch (Exception e) {
            System.out.println("No pude Realizar la Copia");
        }
    }

    public static void leerTxtArrayList(ArrayList<Producto> producto) throws FileNotFoundException, IOException {
        try {
            scanner = new Scanner(System.in);
            System.out.println("Digite la URL");
            String url = scanner.nextLine();
            InputStream fichero = new FileInputStream(url);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fichero);

            //leer su contenido, el devuelve byte
            try {
                int dato = bufferedInputStream.read();
                while (dato != -1) {
                    System.out.print((char) dato);
                    dato = bufferedInputStream.read();
                }

            } catch (IOException e) {
                System.out.println("Erro: al intentar leer el fichero, Contacte al Administrador");
            }
        } catch (Exception e) {
            System.out.println("Huy, estoy presentando Error en estos momentos intenta mas tarde");
        }
    }

}
