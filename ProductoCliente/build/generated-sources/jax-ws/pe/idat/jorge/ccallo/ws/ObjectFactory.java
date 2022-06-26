
package pe.idat.jorge.ccallo.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.idat.jorge.ccallo.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProductoListarResponse_QNAME = new QName("http://ws.ccallo.jorge.idat.pe/", "productoListarResponse");
    private final static QName _ProductoCrearResponse_QNAME = new QName("http://ws.ccallo.jorge.idat.pe/", "productoCrearResponse");
    private final static QName _ProductoCrear_QNAME = new QName("http://ws.ccallo.jorge.idat.pe/", "productoCrear");
    private final static QName _ProductoListar_QNAME = new QName("http://ws.ccallo.jorge.idat.pe/", "productoListar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.idat.jorge.ccallo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductoListar }
     * 
     */
    public ProductoListar createProductoListar() {
        return new ProductoListar();
    }

    /**
     * Create an instance of {@link ProductoCrear }
     * 
     */
    public ProductoCrear createProductoCrear() {
        return new ProductoCrear();
    }

    /**
     * Create an instance of {@link ProductoCrearResponse }
     * 
     */
    public ProductoCrearResponse createProductoCrearResponse() {
        return new ProductoCrearResponse();
    }

    /**
     * Create an instance of {@link ProductoListarResponse }
     * 
     */
    public ProductoListarResponse createProductoListarResponse() {
        return new ProductoListarResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ccallo.jorge.idat.pe/", name = "productoListarResponse")
    public JAXBElement<ProductoListarResponse> createProductoListarResponse(ProductoListarResponse value) {
        return new JAXBElement<ProductoListarResponse>(_ProductoListarResponse_QNAME, ProductoListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoCrearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ccallo.jorge.idat.pe/", name = "productoCrearResponse")
    public JAXBElement<ProductoCrearResponse> createProductoCrearResponse(ProductoCrearResponse value) {
        return new JAXBElement<ProductoCrearResponse>(_ProductoCrearResponse_QNAME, ProductoCrearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoCrear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ccallo.jorge.idat.pe/", name = "productoCrear")
    public JAXBElement<ProductoCrear> createProductoCrear(ProductoCrear value) {
        return new JAXBElement<ProductoCrear>(_ProductoCrear_QNAME, ProductoCrear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoListar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ccallo.jorge.idat.pe/", name = "productoListar")
    public JAXBElement<ProductoListar> createProductoListar(ProductoListar value) {
        return new JAXBElement<ProductoListar>(_ProductoListar_QNAME, ProductoListar.class, null, value);
    }

}
