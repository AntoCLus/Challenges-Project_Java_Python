package com.compras;

import java.util.Date;
import java.util.Scanner;

public class OrdenCompra {
    private static int identificador;
    private static String descripcion;
    private static Date fecha;
    private static Cliente cliente = new Cliente();
    private static Producto[] producto = new Producto[10];

    OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public Cliente setCliente() {
        return cliente;
    }

    public Date setFecha() {
        return fecha;
    }

    public double getGranTotal() {
        double granTotal = 0;
        for (Producto producto : producto) {
            granTotal += producto.getPrecio();
        }
        return granTotal;
    }

    public void agregarProducto(Producto producto1) {

    }

    public Producto[] getProductos() {
        return producto;
    }

}