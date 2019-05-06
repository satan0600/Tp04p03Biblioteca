package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Calendar;

public class Libro implements Serializable{
	private String editorialL, tematicaL, autorL, tituloL, codigoL, ISBNL;
	private int  cantPaginasL;
	private Calendar fechaEL= Calendar.getInstance();
	public String getEditorialL() {
		return editorialL;
	}
	public void setEditorialL(String editorialL) {
		this.editorialL = editorialL;
	}
	public String getTematicaL() {
		return tematicaL;
	}
	public void setTematicaL(String tematicaL) {
		this.tematicaL = tematicaL;
	}
	public String getAutorL() {
		return autorL;
	}
	public void setAutorL(String autorL) {
		this.autorL = autorL;
	}
	public String getTituloL() {
		return tituloL;
	}
	public void setTituloL(String tituloL) {
		this.tituloL = tituloL;
	}
	public String getCodigoL() {
		return codigoL;
	}
	public void setCodigoL(String codigoL) {
		this.codigoL = codigoL;
	}
	public String getISBNL() {
		return ISBNL;
	}
	public void setISBNL(String iSBNL) {
		ISBNL = iSBNL;
	}
	public int getCantPaginasL() {
		return cantPaginasL;
	}
	public void setCantPaginasL(int cantPaginasL) {
		this.cantPaginasL = cantPaginasL;
	}
	public Calendar getFechaEL() {
		return fechaEL;
	}
	public void setFechaEL(Calendar fechaEL) {
		this.fechaEL = fechaEL;
	}
	public Libro(String editorialL, String tematicaL, String autorL, String tituloL, String codigoL, String iSBNL,
			int cantPaginasL, Calendar fechaEL) {
		super();
		this.editorialL = editorialL;
		this.tematicaL = tematicaL;
		this.autorL = autorL;
		this.tituloL = tituloL;
		this.codigoL = codigoL;
		ISBNL = iSBNL;
		this.cantPaginasL = cantPaginasL;
		this.fechaEL = fechaEL;
	}
	public Libro() {
		super();
	}
	@Override
	public String toString() {
		return "Libro [editorialL=" + editorialL + ", tematicaL=" + tematicaL + ", autorL=" + autorL + ", tituloL="
				+ tituloL + ", codigoL=" + codigoL + ", ISBNL=" + ISBNL + ", cantPaginasL=" + cantPaginasL
				+ ", fechaEL=" + fechaEL + "]";
	}
	

	
	
	
	

}
