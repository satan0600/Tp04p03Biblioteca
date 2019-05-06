package aplicacion.modelo.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import aplicacion.modelo.dominio.Rol;

public class Roles implements Serializable{
	private List<Rol> listaRoles;

	public List<Rol> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<Rol> listaRoles) {
		this.listaRoles = listaRoles;
	}

	public Roles(List<Rol> listaRoles) {
		super();
		this.listaRoles = listaRoles;
	}

	public Roles() {
		listaRoles=new ArrayList<>();
		listaRoles.add(new Rol(0, "Admin", "permiso de administrativos", "no Borrado"));
		listaRoles.add(new Rol(1, "Admin", "permiso de consulta", "no Borrado"));
		
	}
		
		
	
	

}
