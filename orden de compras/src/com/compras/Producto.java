package com.compras;

public class Producto {
    public static String fabricante;
    public static String nombre;
    public static double precio;

    public Producto() {
    }

    public Producto(String fabricante, String nombre, double precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;

    }

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Producto.fabricante = fabricante;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Producto.nombre = nombre;
    }

    public static int getPrecio() {
        return (int) precio;
    }

    public static void setPrecio(int precio) {
        Producto.precio = precio;
    }
}
