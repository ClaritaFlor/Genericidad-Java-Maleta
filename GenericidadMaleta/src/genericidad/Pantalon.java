package genericidad;

public class Pantalon extends Vestimenta {
	private String tipo;
	private String estilo;
	public Pantalon() {
		super();
		this.tipo = "";
		this.estilo = "";
	}
	public Pantalon(String tipo, String estilo,String talla, String color) {
		super(talla, color);
		this.tipo = tipo;
		this.estilo = estilo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	@Override
	public String toString() {
		return "\n***PANTALON \n tipo: " + tipo + ", \n estilo :" + estilo + "\n "+ super.toString();
	}
	
}
