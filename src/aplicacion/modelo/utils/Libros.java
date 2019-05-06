package aplicacion.modelo.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;



import aplicacion.modelo.dominio.Institucion;
import aplicacion.modelo.dominio.Libro;

public class Libros implements Serializable{
	private Institucion institucion = new Institucion("sarmiento", "bliblioteca Publica", 12);
	private ArrayList<Libro> lLibros = new ArrayList<Libro>();
	private Libro unLibro = new Libro();
	Scanner teclado = new Scanner(System.in);

	public Institucion getInstitucion() {
		return institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

	public ArrayList<Libro> getlLibros() {
		return lLibros;
	}

	public void setlLibros(ArrayList<Libro> lLibros) {
		this.lLibros = lLibros;
	}

	public Libro getUnLibro() {
		return unLibro;
	}

	public void setUnLibro(Libro unLibro) {
		this.unLibro = unLibro;
	}

	public Libros(Institucion institucion, ArrayList<Libro> lLibros, Libro unLibro) {
		super();
		this.institucion = institucion;
		this.lLibros = lLibros;
		this.unLibro = unLibro;
	}

	public Libros() {
		super();
	}

	public void precargarLibros() {
		

	}

	public void cargarNuevoLibro() {
		String editorial, codigo, tematica, autor, titulo, isbn;
		int cantPaginas;
		int dd, mm, yy;
		unLibro = new Libro();
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese editorial");
		editorial = teclado.next();
		unLibro.setEditorialL(editorial);
		System.out.println("ingrese tematica");
		tematica = teclado.next();
		unLibro.setTematicaL(tematica);
		System.out.println("ingrese autor");
		autor = teclado.next();
		unLibro.setAutorL(autor);
		System.out.println("titulo");
		titulo = teclado.next();
		unLibro.setTituloL(titulo);
		System.out.println("codigo");
		codigo = teclado.next();
		unLibro.setCodigoL(codigo);
		System.out.println("Isbn");
		isbn = teclado.next();
		unLibro.setISBNL(isbn);
		System.out.println("cantidad de paginas");
		cantPaginas = teclado.nextInt();
		unLibro.setCantPaginasL(cantPaginas);
		System.out.println("cargando fecha yyyy-mm-dd");
		System.out.println("anio");
		yy = teclado.nextInt();
		System.out.println("mes");
		mm = teclado.nextInt();
		System.out.println("dia");
		dd = teclado.nextInt();
		unLibro.setFechaEL(new GregorianCalendar(yy, mm, dd));
		lLibros.add(unLibro);

	}

	public void cargarFecha() {
		int dd, mm, yy;
		System.out.println("cargando fecha yyyy-mm-dd");
		System.out.println("anio");
		yy = teclado.nextInt();
		System.out.println("mes");
		mm = teclado.nextInt();
		System.out.println("dia");
		dd = teclado.nextInt();
		unLibro.getFechaEL().set(yy, mm, dd);

	}

	public void agregarAliLibros(Libro nLibro) {

		lLibros.add(nLibro);

	}

	public void mostrarLibros() {
		int d, m, y;
		mostrarDetalleInst();
		for (Libro li : lLibros) {
			y = li.getFechaEL().get(Calendar.YEAR);
			m = li.getFechaEL().get(Calendar.MONTH);
			d = li.getFechaEL().get(Calendar.DAY_OF_MONTH);
			System.out.println("editorial: " + li.getEditorialL() + "--tematica: " + li.getTematicaL() + "--autor: "
					+ li.getAutorL() + "--titulo: " + li.getTituloL() + "--codigo: " + li.getCodigoL() + "--ISBN: "
					+ li.getISBNL() + "--cantidad de paginas: " + li.getCantPaginasL() + "--fecha Edicion: " + y + "-"
					+ m + "-" + d);
		}
	}

	public void mostrarDetalleInst() {
		System.out.println("Institucion: " + institucion.getNombreInst() + "--Categoria: "
				+ institucion.getCategoriaInst() + "--codigo: " + institucion.getCodInst());
	}

	public void quitarUnLibro(int posicion) {
		lLibros.remove(posicion);
	}

	public void modificarLibro(int posicion, Libro nLibro) {
		for (int i = 0; i < lLibros.size(); i++) {
			if (lLibros.get(i).equals(lLibros.get(posicion))) {
				lLibros.set(i, nLibro);

			}

		}

	}
	public void ordenarMeaMaLibros() {
		lLibros.sort(Comparator.comparing(Libro::getTituloL));
		
		
		
	}
	public void ordenarMayoraMeLibros() {
		lLibros.sort(Comparator.comparing(Libro::getTituloL));
		
		
		
	}

	

	}


