//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.10 a las 10:44:57 AM CDT 
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
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primaFinal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cobertura" type="{http://marsh.com/paqueteDetalle}Cobertura" maxOccurs="unbounded"/&gt;
 *         &lt;element name="adicional" type="{http://marsh.com/paqueteDetalle}Cobertura" maxOccurs="unbounded"/&gt;
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
    "nombre",
    "primaFinal",
    "cobertura",
    "adicional"
})
@XmlRootElement(name = "consultaVehiculoPaquetesResponse")
public class ConsultaVehiculoPaquetesResponse {

    @XmlElement(required = true)
    protected String nombre;
    protected double primaFinal;
    @XmlElement(required = true)
    protected List<Cobertura> cobertura;
    @XmlElement(required = true)
    protected List<Cobertura> adicional;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad primaFinal.
     * 
     */
    public double getPrimaFinal() {
        return primaFinal;
    }

    /**
     * Define el valor de la propiedad primaFinal.
     * 
     */
    public void setPrimaFinal(double value) {
        this.primaFinal = value;
    }

    /**
     * Gets the value of the cobertura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobertura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCobertura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cobertura }
     * 
     * 
     */
    public List<Cobertura> getCobertura() {
        if (cobertura == null) {
            cobertura = new ArrayList<Cobertura>();
        }
        return this.cobertura;
    }

    /**
     * Gets the value of the adicional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adicional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdicional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cobertura }
     * 
     * 
     */
    public List<Cobertura> getAdicional() {
        if (adicional == null) {
            adicional = new ArrayList<Cobertura>();
        }
        return this.adicional;
    }

}
