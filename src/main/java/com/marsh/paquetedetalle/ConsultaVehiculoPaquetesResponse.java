//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.08 a las 04:34:49 PM CDT 
//


package com.marsh.paquetedetalle;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clavemarca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vehiculoDetalle" type="{http://marsh.com/paqueteDetalle}VehiculoDetalle" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modelo",
    "clavemarca",
    "descripcion",
    "vehiculoDetalle"
})
@XmlRootElement(name = "consultaVehiculoPaquetesResponse")
public class ConsultaVehiculoPaquetesResponse {

    @XmlElement(required = true)
    protected String modelo;
    @XmlElement(required = true)
    protected String clavemarca;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected List<VehiculoDetalle> vehiculoDetalle;

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad clavemarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClavemarca() {
        return clavemarca;
    }

    /**
     * Define el valor de la propiedad clavemarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClavemarca(String value) {
        this.clavemarca = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the vehiculoDetalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehiculoDetalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehiculoDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehiculoDetalle }
     * 
     * 
     */
    public List<VehiculoDetalle> getVehiculoDetalle() {
        if (vehiculoDetalle == null) {
            vehiculoDetalle = new ArrayList<VehiculoDetalle>();
        }
        return this.vehiculoDetalle;
    }

}
