/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.jorge.ccallo.dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pe.idat.jorge.ccallo.model.Producto;

/**
 *
 * @author Armando Morales
 */
public class ProductoDaoTest {
    
    public ProductoDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findAllByCategoria method, of class ProductoDao.
     */
    @org.junit.Test
    public void testFindAllByCategoria() {
        System.out.println("findAllByCategoria");
        String categoria = "Televisores";
        Integer limite = 3;
        ProductoDao instance = new ProductoDao();
        boolean result = instance.findAllByCategoria(categoria, limite).size() > 0; // ya tiene registros asi que debe ser mayor que cero para q sea verdadero
        assertTrue(result);
    }

    /**
     * Test of delete method, of class ProductoDao.
     */
    @org.junit.Test
    public void testDelete() {
        System.out.println("delete");
        Integer productoId = 31;
        ProductoDao instance = new ProductoDao();
        int expResult = 1;
        int result = instance.delete(productoId); // devuelve 1 si se logro eliminar al estudiante
        assertEquals(expResult, result);
    }
    
}
