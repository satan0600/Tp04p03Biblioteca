package aplicacion.controlador.beans.forms;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import aplicacion.contrrolador.beans.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;

@ManagedBean
@RequestScoped
public class LoginFormBean {
	@ManagedProperty(value = "#{usuarioBean}")
	private int dni;
	private String password;
	private UsuarioBean usuarioBean;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginFormBean(int dni, String password) {
		super();
		this.dni = dni;
		this.password = password;
	}
	
	
	public LoginFormBean() {
		super();
	}
	
	 public String verificarCredenciales() {
		 String resultado="";
		Usuario usuarioB= usuarioBean.VerificarCredenciales(dni, password);
		if (usuarioB !=null) {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuarioB);
			resultado="menu?faces-redirect=true";
		}
		else {
			FacesContext fc= FacesContext.getCurrentInstance();
			fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"acceso denegado","credenciales incorrectas"));
			
		}
		return resultado;
	 }
	

}
