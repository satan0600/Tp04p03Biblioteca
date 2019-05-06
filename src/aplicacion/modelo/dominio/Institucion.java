package aplicacion.modelo.dominio;

public class Institucion {
	private String nombreInst, categoriaInst;
	private int codInst;

	
	public Institucion(String nombreInst, String categoriaInst, int codInst) {
		super();
		this.nombreInst = nombreInst;
		this.categoriaInst = categoriaInst;
		this.codInst = codInst;
	}



	public String getNombreInst() {
		return nombreInst;
	}



	public void setNombreInst(String nombreInst) {
		this.nombreInst = nombreInst;
	}


	public String getCategoriaInst() {
		return categoriaInst;
	}


	public void setCategoriaInst(String categoriaInst) {
		this.categoriaInst = categoriaInst;
	}


	public int getCodInst() {
		return codInst;
	}


	public void setCodInst(int codInst) {
		this.codInst = codInst;
	}

	
	public Institucion() {
		super();
	}
	
	

}
