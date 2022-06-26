
package pe.idat.jorge.ccallo.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductoWS", targetNamespace = "http://ws.ccallo.jorge.idat.pe/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductoWS {


    /**
     * 
     * @param limite
     * @return
     *     returns java.util.List<pe.idat.jorge.ccallo.ws.Producto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "productoListar", targetNamespace = "http://ws.ccallo.jorge.idat.pe/", className = "pe.idat.jorge.ccallo.ws.ProductoListar")
    @ResponseWrapper(localName = "productoListarResponse", targetNamespace = "http://ws.ccallo.jorge.idat.pe/", className = "pe.idat.jorge.ccallo.ws.ProductoListarResponse")
    @Action(input = "http://ws.ccallo.jorge.idat.pe/ProductoWS/productoListarRequest", output = "http://ws.ccallo.jorge.idat.pe/ProductoWS/productoListarResponse")
    public List<Producto> productoListar(
        @WebParam(name = "limite", targetNamespace = "")
        Integer limite);

    /**
     * 
     * @param arg0
     * @return
     *     returns pe.idat.jorge.ccallo.ws.Producto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "productoCrear", targetNamespace = "http://ws.ccallo.jorge.idat.pe/", className = "pe.idat.jorge.ccallo.ws.ProductoCrear")
    @ResponseWrapper(localName = "productoCrearResponse", targetNamespace = "http://ws.ccallo.jorge.idat.pe/", className = "pe.idat.jorge.ccallo.ws.ProductoCrearResponse")
    @Action(input = "http://ws.ccallo.jorge.idat.pe/ProductoWS/productoCrearRequest", output = "http://ws.ccallo.jorge.idat.pe/ProductoWS/productoCrearResponse")
    public Producto productoCrear(
        @WebParam(name = "arg0", targetNamespace = "")
        Producto arg0);

}
