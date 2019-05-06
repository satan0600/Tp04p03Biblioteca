package aplicacion.dao;

import aplicacion.modelo.dominio.Usuario;

public interface IUssuarioDAO {
	Usuario verificarCredenciales(int dni, String password);

}
