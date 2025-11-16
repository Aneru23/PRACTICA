package Nro4;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // c)
    public void agregarProducto(Producto p) throws Exception {

        for (Producto prod : productos) {
            if (prod.getCodigo().equals(p.getCodigo()))
                throw new Exception("Código ya registrado: " + p.getCodigo());
        }

        if (p.getPrecio() < 0 || p.getStock() < 0)
            throw new Exception("Precio o stock no pueden ser negativos.");

        productos.add(p);
    }

    // d)
    public Producto buscarProducto(String codigo)
            throws ProductoNoEncontradoException {

        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo))
                return p;
        }

        throw new ProductoNoEncontradoException("Producto con código " + codigo + " no existe.");
    }

    // e)
    public void venderProducto(String codigo, int cantidad)
            throws Exception {

        Producto p = buscarProducto(codigo);

        if (p.getStock() < cantidad)
            throw new StockInsuficienteException("Stock insuficiente para vender " + cantidad);

        p.reducirStock(cantidad);
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

