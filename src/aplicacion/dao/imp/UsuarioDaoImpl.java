package aplicacion.dao.imp;

import java.io.Serializable;
import java.util.List;

import aplicacion.dao.IUssuarioDAO;
import aplicacion.modelo.dominio.Usuario;

public class UsuarioDaoImpl implements Serializable, IUssuarioDAO{
	private List<Usuario> listaUsuariosD;
	

	public List<Usuario> getListaUsuariosD() {
		return listaUsuariosD;
	}


	public void setListaUsuariosD(List<Usuario> listaUsuariosD) {
		this.listaUsuariosD = listaUsuariosD;
	}
	


	public UsuarioDaoImpl() {
		super();
	}


	public UsuarioDaoImpl(List<Usuario> listaUsuariosD) {
		super();
		this.listaUsuariosD = listaUsuariosD;
	}


	@Override
	public Usuario verificarCredenciales(int dni, String password) {
		Usuario usuD=null;
		for (Usuario usuario : listaUsuariosD) {
			if (usuario.getDni()==dni&&usuario.getPasswordU().equals(password)) {
				usuD=usuario;
			}
		}
		return usuD;
	}
	

}
