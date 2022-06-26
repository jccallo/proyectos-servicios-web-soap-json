/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.jorge.ccallo;

import java.util.List;
import pe.idat.jorge.ccallo.ws.Producto;

/**
 *
 * @author Armando Morales
 */
public class ProductoCliente {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Parte 2 – Cliente SOAP - Operacion listar 
        Integer limite = 7;
        List<Producto> itemsProducto = productoListar(limite);
        System.out.println("");
        System.out.println("Listado de productos con limite: " + limite);
        for (int i = 0; i < itemsProducto.size(); i++) {
            Producto producto = itemsProducto.get(i);
            System.out.println("---------- N° " + (i + 1) + " ----------");
            System.out.println("ProductoId: " + producto.getProductoId());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Stock: " + producto.getStock());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Marca: " + producto.getMarca());
            System.out.println("CategoriaId: " + producto.getCategoriaId());
        }
        
        // Parte 2 – Cliente SOAP - Operacion Crear
        System.out.println("Objeto producto para crear");
        Producto producto = new Producto();
        producto.setNombre("Nuevo Producto");
        producto.setStock(20);
        producto.setPrecio(29.9);
        producto.setMarca("Nueva Marca");
        producto.setCategoriaId(5);
        
        Producto productoModel = productoCrear(producto);
        System.out.println("");
        System.out.println("---------- Producto Creado ----------");
        System.out.println("ProductoId: " + productoModel.getProductoId());
        System.out.println("Nombre: " + productoModel.getNombre());
        System.out.println("Stock: " + productoModel.getStock());
        System.out.println("Precio: " + productoModel.getPrecio());
        System.out.println("Marca: " + productoModel.getMarca());
        System.out.println("CategoriaId: " + productoModel.getCategoriaId());
        
    }

    private static java.util.List<pe.idat.jorge.ccallo.ws.Producto> productoListar(java.lang.Integer limite) {
        pe.idat.jorge.ccallo.ws.ProductoWS_Service service = new pe.idat.jorge.ccallo.ws.ProductoWS_Service();
        pe.idat.jorge.ccallo.ws.ProductoWS port = service.getProductoWSPort();
        return port.productoListar(limite);
    }

    private static Producto productoCrear(pe.idat.jorge.ccallo.ws.Producto arg0) {
        pe.idat.jorge.ccallo.ws.ProductoWS_Service service = new pe.idat.jorge.ccallo.ws.ProductoWS_Service();
        pe.idat.jorge.ccallo.ws.ProductoWS port = service.getProductoWSPort();
        return port.productoCrear(arg0);
    }
}
