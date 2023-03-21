package com.compras;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Producto producto1 = new Producto("Fabricante 1", "Producto 1", 10.0);
        Producto producto2 = new Producto("Fabricante 2", "Producto 2", 20.0);
        Producto producto3 = new Producto("Fabricante 3", "Producto 3", 30.0);
        Producto producto4 = new Producto("Fabricante 4", "Producto 4", 40.0);
        Producto producto5 = new Producto("Fabricante 5", "Producto 5", 50.0);
        Producto producto6 = new Producto("Fabricante 6", "Producto 6", 60.0);
        Producto producto7 = new Producto("Fabricante 7", "Producto 7", 70.0);
        Producto producto8 = new Producto("Fabricante 8", "Producto 8", 80.0);
        Producto producto9 = new Producto("Fabricante 9", "Producto 9", 90.0);
        Producto producto10 = new Producto("Fabricante 10", "Producto 10", 100.0);


        Cliente cliente1 = new Cliente("Cliente 1", "Apellido 1");
        Cliente cliente2 = new Cliente("Cliente 2", "Apellido 2");
        Cliente cliente3 = new Cliente("Cliente 3", "Apellido 3");


        OrdenCompra orden1 = new OrdenCompra(cliente1.toString());
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);

        OrdenCompra orden2 = new OrdenCompra(cliente2.toString());
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);

        OrdenCompra orden3 = new OrdenCompra(cliente3.toString());
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto10);
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto2);

        // Imprimir los valores de las ordenes en consola
        System.out.println("Orden 1:");
        System.out.println("Cliente: " + orden1.getCliente().getNombre());
        System.out.println("Productos:");
        for (Producto producto : orden1.getProductos()) {
            System.out.println("- " + producto.getFabricante() + " " + producto.getNombre() + " $" + producto.getPrecio());
        }
        System.out.println("Gran total: $" + orden1.getGranTotal());

        System.out.println("Orden 2:");
        System.out.println("Cliente: " + orden2.getCliente().getNombre());
        System.out.println("Productos:");
        for (Producto producto : orden2.getProductos()) {
            System.out.println("- " + producto.getFabricante() + " " + producto.getNombre() + " $" + producto.getPrecio());
        }
        System.out.println("Gran total: $" + orden2.getGranTotal());

        System.out.println("Orden 3:");
        System.out.println("Cliente: " + orden3.getCliente().getNombre());
    }
}
