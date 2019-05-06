package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Rol implements Serializable{
	private int codigoR;
	private String nombre, descripcion,estado;
	public int getCodigoR() {
		return codigoR;
	}
	public void setCodigoR(int codigoR) {
		this.codigoR = codigoR;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Rol(int codigoR, String nombre, String descripcion, String estado) {
		super();
		this.codigoR = codigoR;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public Rol(String estado) {
		super();
		
	}
	

}
