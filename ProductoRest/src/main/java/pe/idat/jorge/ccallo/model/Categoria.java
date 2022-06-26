/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.jorge.ccallo.model;

/**
 *
 * @author Armando Morales
 */
public class Categoria {
    private Integer categoriaId;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(Integer categoriaId, String descripcion) {
        this.categoriaId = categoriaId;
        this.descripcion = descripcion;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
