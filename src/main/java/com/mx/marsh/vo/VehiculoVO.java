package com.mx.marsh.vo;


public class VehiculoVO {

	private String tipovehiculo;
    
    private String modelo;
    
    private String clavemarca;
    
    private String clavesubmarca;
    
    private String clavedescripcion;
    
    private String mail;
    
    private String sexo;
    
    private String telefono;
    
    private String cp;
    
    private String marca;
    
    private String submarca;
    
    private String descripcion;
    
    private String fechanac;
    
    private String edad;
    
    private String iniciovig;
    
    private String finvig;
    
    private String tipoCotizacion;
    
    private String tipoPaquete;

	public String getTipovehiculo() {
		return tipovehiculo;
	}

	public void setTipovehiculo(String tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getClavemarca() {
		return clavemarca;
	}

	public void setClavemarca(String clavemarca) {
		this.clavemarca = clavemarca;
	}

	public String getClavesubmarca() {
		return clavesubmarca;
	}

	public void setClavesubmarca(String clavesubmarca) {
		this.clavesubmarca = clavesubmarca;
	}

	public String getClavedescripcion() {
		return clavedescripcion;
	}

	public void setClavedescripcion(String clavedescripcion) {
		this.clavedescripcion = clavedescripcion;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSubmarca() {
		return submarca;
	}

	public void setSubmarca(String submarca) {
		this.submarca = submarca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechanac() {
		return fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getIniciovig() {
		return iniciovig;
	}

	public void setIniciovig(String iniciovig) {
		this.iniciovig = iniciovig;
	}

	public String getFinvig() {
		return finvig;
	}

	public void setFinvig(String finvig) {
		this.finvig = finvig;
	}

	public String getTipoCotizacion() {
		return tipoCotizacion;
	}

	public void setTipoCotizacion(String tipoCotizacion) {
		this.tipoCotizacion = tipoCotizacion;
	}

	public String getTipoPaquete() {
		return tipoPaquete;
	}

	public void setTipoPaquete(String tipoPaquete) {
		this.tipoPaquete = tipoPaquete;
	}

	@Override
	public String toString() {
		return "VehiculoVO [tipovehiculo=" + tipovehiculo + ", modelo=" + modelo + ", clavemarca=" + clavemarca
				+ ", clavesubmarca=" + clavesubmarca + ", clavedescripcion=" + clavedescripcion + ", mail=" + mail
				+ ", sexo=" + sexo + ", telefono=" + telefono + ", cp=" + cp + ", marca=" + marca + ", submarca="
				+ submarca + ", descripcion=" + descripcion + ", fechanac=" + fechanac + ", edad=" + edad
				+ ", iniciovig=" + iniciovig + ", finvig=" + finvig + ", tipoCotizacion=" + tipoCotizacion
				+ ", tipoPaquete=" + tipoPaquete + "]";
	}

}
