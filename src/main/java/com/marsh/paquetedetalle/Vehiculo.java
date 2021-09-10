//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.10 a las 10:44:57 AM CDT 
//


package com.marsh.paquetedetalle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Vehiculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Vehiculo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipovehiculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clavemarca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clavesubmarca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clavedescripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="submarca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechanac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iniciovig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="finvig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoCotizacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoPaquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehiculo", propOrder = {
    "tipovehiculo",
    "modelo",
    "clavemarca",
    "clavesubmarca",
    "clavedescripcion",
    "mail",
    "sexo",
    "telefono",
    "cp",
    "marca",
    "submarca",
    "descripcion",
    "fechanac",
    "edad",
    "iniciovig",
    "finvig",
    "tipoCotizacion",
    "tipoPaquete"
})
public class Vehiculo {

    @XmlElement(required = true)
    protected String tipovehiculo;
    @XmlElement(required = true)
    protected String modelo;
    @XmlElement(required = true)
    protected String clavemarca;
    @XmlElement(required = true)
    protected String clavesubmarca;
    @XmlElement(required = true)
    protected String clavedescripcion;
    @XmlElement(required = true)
    protected String mail;
    @XmlElement(required = true)
    protected String sexo;
    @XmlElement(required = true)
    protected String telefono;
    @XmlElement(required = true)
    protected String cp;
    @XmlElement(required = true)
    protected String marca;
    @XmlElement(required = true)
    protected String submarca;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected String fechanac;
    @XmlElement(required = true)
    protected String edad;
    @XmlElement(required = true)
    protected String iniciovig;
    @XmlElement(required = true)
    protected String finvig;
    @XmlElement(required = true)
    protected String tipoCotizacion;
    @XmlElement(required = true)
    protected String tipoPaquete;

    /**
     * Obtiene el valor de la propiedad tipovehiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipovehiculo() {
        return tipovehiculo;
    }

    /**
     * Define el valor de la propiedad tipovehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipovehiculo(String value) {
        this.tipovehiculo = value;
    }

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
     * Obtiene el valor de la propiedad clavesubmarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClavesubmarca() {
        return clavesubmarca;
    }

    /**
     * Define el valor de la propiedad clavesubmarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClavesubmarca(String value) {
        this.clavesubmarca = value;
    }

    /**
     * Obtiene el valor de la propiedad clavedescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClavedescripcion() {
        return clavedescripcion;
    }

    /**
     * Define el valor de la propiedad clavedescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClavedescripcion(String value) {
        this.clavedescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad mail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Define el valor de la propiedad mail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCp() {
        return cp;
    }

    /**
     * Define el valor de la propiedad cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCp(String value) {
        this.cp = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad submarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmarca() {
        return submarca;
    }

    /**
     * Define el valor de la propiedad submarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmarca(String value) {
        this.submarca = value;
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
     * Obtiene el valor de la propiedad fechanac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechanac() {
        return fechanac;
    }

    /**
     * Define el valor de la propiedad fechanac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechanac(String value) {
        this.fechanac = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdad(String value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad iniciovig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIniciovig() {
        return iniciovig;
    }

    /**
     * Define el valor de la propiedad iniciovig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIniciovig(String value) {
        this.iniciovig = value;
    }

    /**
     * Obtiene el valor de la propiedad finvig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinvig() {
        return finvig;
    }

    /**
     * Define el valor de la propiedad finvig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinvig(String value) {
        this.finvig = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCotizacion() {
        return tipoCotizacion;
    }

    /**
     * Define el valor de la propiedad tipoCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCotizacion(String value) {
        this.tipoCotizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPaquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPaquete() {
        return tipoPaquete;
    }

    /**
     * Define el valor de la propiedad tipoPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPaquete(String value) {
        this.tipoPaquete = value;
    }

}
