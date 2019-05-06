package aplicacion.modelo.dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;

import aplicacion.modelo.utils.Libros;


public class Biblioteca {
	private Libro unLibroBi=new Libro();
	private Libros librosBi=new Libros();
	
	public Libro getUnLibroBi() {
		return unLibroBi;
	}

	public void setUnLibroBi(Libro unLibroBi) {
		this.unLibroBi = unLibroBi;
	}

	public Libros getLibrosBi() {
		return librosBi;
	}

	public void setLibrosBi(Libros librosBi) {
		this.librosBi = librosBi;
	}
	

	public Biblioteca(Libro unLibroBi, Libros librosBi) {
		super();
		this.unLibroBi = unLibroBi;
		this.librosBi = librosBi;
	}
	

	public Biblioteca() {
		super();
	}

	public void precargarLibros() {
		Calendar fechaA=new GregorianCalendar(2015, 05, 15);
		Calendar fechaB=new GregorianCalendar(2016, 05, 15);
		Calendar fechaC=new GregorianCalendar(2017, 05, 15);
		Calendar fechaD=new GregorianCalendar(2018, 05, 15);
		
		Libro libroA=new Libro("AAAAA", "BBBBB", "CCCCC", "DDDDD", "aaaaa", "bbbbb",1000,fechaA );
		Libro libroB=new Libro("BBBBB", "CCCCC", "DDDDD", "EEEEE", "bbbbb", "ccccc",2000,fechaB );
		Libro libroC=new Libro("CCCCC", "DDDDD", "EEEEE", "FFFFF", "ccccc", "ddddd",1000,fechaC );
		Libro libroD=new Libro("DDDDD", "EEEEE", "FFFFF", "GGGGG", "ddddd", "eeeee",1000,fechaD );
		librosBi.getlLibros().add(libroA);
		librosBi.getlLibros().add(libroB);
		librosBi.getlLibros().add(libroC);
		librosBi.getlLibros().add(libroD);
		
	}
	
	

}
