package aplicacion.modelo.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import aplicacion.modelo.dominio.Usuario;

public class Usuarios implements Serializable {
	private List<Usuario> listaUsuarios;

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public Usuarios(List<Usuario> listaUsuarios) {
		super();
		this.listaUsuarios = listaUsuarios;
	}

	public Usuarios() {
		listaUsuarios = new ArrayList<>();
		Roles listaRoles = new Roles();
		listaUsuarios.add(new Usuario(28111111, "Sarmiento", "Domingo", "3881234567", "domingof@gmaail.com", "admin",
				"no borrado", listaRoles.getListaRoles().get(0)));
	}

}
