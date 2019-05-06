package aplicacion.dao.imp;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import aplicacion.modelo.dominio.Libro;
import aplicacion.modelo.utils.Libros;
import aplicacion.dao.ILibroDao;

public class LibrosDaoImpl implements Serializable, ILibroDao {
	private Libros lLibros=new Libros();
	Scanner teclado=new Scanner(System.in);
	Libro unLibroA=new Libro();
	Libro unLibroB=new Libro();
	Libro unLibroC=new Libro();
	

	@Override
	public void crearLibro(Libro nLibro) {
		
		lLibros.agregarAliLibros(nLibro);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void precargarLibros() {
		
		unLibroA.setAutorL("AAAAA");
		unLibroA.setEditorialL("BBBBB");
		unLibroA.setTematicaL("CCCCC");
		unLibroA.setTituloL("zelda");
		unLibroA.setCodigoL("aaaaa");
		unLibroA.setISBNL("bbbbb");
		unLibroA.setCantPaginasL(1000);
		unLibroA.setFechaEL(new GregorianCalendar(2016, 5, 16));
		unLibroB.setAutorL("BBBBB");
		unLibroB.setEditorialL("CCCCC");
		unLibroB.setTematicaL("DDDDD");
		unLibroB.setTituloL("elcamino");
		unLibroB.setCodigoL("ggggg");
		unLibroB.setISBNL("hhhhh");
		unLibroB.setCantPaginasL(2000);
		unLibroB.setFechaEL(new GregorianCalendar(2017, 5, 16));
		unLibroC.setAutorL("BBBBB");
		unLibroC.setEditorialL("CCCCC");
		unLibroC.setTematicaL("DDDDD");
		unLibroC.setTituloL("greed");
		unLibroC.setCodigoL("ggggg");
		unLibroC.setISBNL("hhhhh");
		unLibroC.setCantPaginasL(2000);
		unLibroC.setFechaEL(new GregorianCalendar(2018, 5, 16));
		
		lLibros.agregarAliLibros(unLibroA);
		lLibros.agregarAliLibros(unLibroB);
		lLibros.agregarAliLibros(unLibroC);
		}

	@Override
	public void mostrarLibros() {
		lLibros.mostrarLibros();
	}

	@Override
	public void mostrarDettaleInst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void precargarLibross() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarLibro() {
		String editorial, codigo, tematica, autor, titulo, isbn;
		int po,cantPaginas,dd, mm, yy;
		Libro libroN=new Libro();
		System.out.println("ingrese posicion");
		po=teclado.nextInt();
		
		System.out.println("ingrese editorial");
		editorial = teclado.next();
		libroN.setEditorialL(editorial);
		System.out.println("ingrese tematica");
		tematica = teclado.next();
		libroN.setTematicaL(tematica);
		System.out.println("ingrese autor");
		autor = teclado.next();
		libroN.setAutorL(autor);
		System.out.println("titulo");
		titulo = teclado.next();
		libroN.setTituloL(titulo);
		System.out.println("codigo");
		codigo = teclado.next();
		libroN.setCodigoL(codigo);
		System.out.println("Isbn");
		isbn = teclado.next();
		libroN.setISBNL(isbn);
		System.out.println("cantidad de paginas");
		cantPaginas = teclado.nextInt();
		libroN.setCantPaginasL(cantPaginas);
		System.out.println("cargando fecha yyyy-mm-dd");
		System.out.println("anio");
		yy = teclado.nextInt();
		System.out.println("mes");
		mm = teclado.nextInt();
		System.out.println("dia");
		dd = teclado.nextInt();
		libroN.setFechaEL(new GregorianCalendar(yy, mm, dd));

		
		lLibros.modificarLibro(po,libroN);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cargarNuevoLibro() {
		lLibros.cargarNuevoLibro();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quitarUnLibro() {
		int posicion;
		System.out.println("ingrese posicion de libro a eliminar");
		posicion=teclado.nextInt();
		lLibros.quitarUnLibro(posicion);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarLibros() {
		lLibros.ordenarMayoraMeLibros();
		System.out.println("de mayor a menor");
		lLibros.mostrarLibros();
		lLibros.ordenarMeaMaLibros();
		System.out.println("de menor a mayor");
		lLibros.mostrarLibros();
		// TODO Auto-generated method stub
		
	}

	
	

	
	
	
}