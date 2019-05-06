package aplicacion.dao;

import aplicacion.modelo.dominio.Libro;

public interface ILibroDao {

	void crearLibro(Libro nLibro);
	void precargarLibros();
	void mostrarLibros();
	void mostrarDettaleInst();
	void precargarLibross();
	void modificarLibro();
	void cargarNuevoLibro();
	void quitarUnLibro();
	void ordenarLibros();

}
