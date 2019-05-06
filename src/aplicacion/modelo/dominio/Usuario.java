package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Usuario implements Serializable{
	private int dni;
	private String apellidoU, nombreU, telefonoU, emailU, passwordU, estadoU;
	private Rol rolU;
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getApellidoU() {
		return apellidoU;
	}
	public void setApellidoU(String apellidoU) {
		this.apellidoU = apellidoU;
	}
	public String getNombreU() {
		return nombreU;
	}
	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}
	public String getTelefonoU() {
		return telefonoU;
	}
	public void setTelefonoU(String telefonoU) {
		this.telefonoU = telefonoU;
	}
	public String getEmailU() {
		return emailU;
	}
	public void setEmailU(String emailU) {
		this.emailU = emailU;
	}
	public String getPasswordU() {
		return passwordU;
	}
	public void setPasswordU(String passwordU) {
		this.passwordU = passwordU;
	}
	public String getEstadoU() {
		return estadoU;
	}
	public void setEstadoU(String estadoU) {
		this.estadoU = estadoU;
	}
	public Rol getRolU() {
		return rolU;
	}
	public void setRolU(Rol rolU) {
		this.rolU = rolU;
	}
	public Usuario(int dni, String apellidoU, String nombreU, String telefonoU, String emailU, String passwordU,
			String estadoU, Rol rolU) {
		super();
		this.dni = dni;
		this.apellidoU = apellidoU;
		this.nombreU = nombreU;
		this.telefonoU = telefonoU;
		this.emailU = emailU;
		this.passwordU = passwordU;
		this.estadoU = estadoU;
		this.rolU = rolU;
	}
	public Usuario() {
		super();
	}
	

}
