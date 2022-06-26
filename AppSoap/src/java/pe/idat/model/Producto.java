/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.model;

import java.util.Date;

public class Producto 
{
    private Integer productoId;
    private String nombre;
    private String marca;
    private Double precio;
    private Date fvencimiento;
    private Integer stock;

    public Producto() {
    }

    public Producto(Integer productoId, String nombre, String marca, Double precio, Date fvencimiento, Integer stock) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.fvencimiento = fvencimiento;
        this.stock = stock;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFvencimiento() {
        return fvencimiento;
    }

    public void setFvencimiento(Date fvencimiento) {
        this.fvencimiento = fvencimiento;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
