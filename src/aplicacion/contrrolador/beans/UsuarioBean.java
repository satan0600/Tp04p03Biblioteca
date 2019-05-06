package aplicacion.contrrolador.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import aplicacion.dao.IUssuarioDAO;
import aplicacion.dao.imp.UsuarioDaoImpl;
import aplicacion.modelo.dominio.Usuario;

@ManagedBean
@RequestScoped
public class UsuarioBean implements Serializable { 
private IUssuarioDAO iUsuarioDAO;

public IUssuarioDAO getiUsuarioDAO() {
	return iUsuarioDAO;
}

public void setiUsuarioDAO(IUssuarioDAO iUsuarioDAO) {
	this.iUsuarioDAO = iUsuarioDAO;
}

public UsuarioBean(IUssuarioDAO iUsuarioDAO) {
	super();
	this.iUsuarioDAO = iUsuarioDAO;
}

public UsuarioBean() {
	iUsuarioDAO=new UsuarioDaoImpl();
}
/**
 * @param dni
 * @param password
 * @return
 */
public Usuario VerificarCredenciales(int dni, String password) {
	return iUsuarioDAO.verificarCredenciales(dni, password);
}
}
