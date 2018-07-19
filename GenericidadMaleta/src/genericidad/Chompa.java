package genericidad;

public class Chompa extends Vestimenta {
	private String material;
	private String manga;
	private boolean cuello_alto;
	private String tipo_cuello;
	public Chompa() {
		super();
		this.material = "";
		this.manga = "";
		this.cuello_alto = false;
		this.tipo_cuello = "";
	}
	public Chompa(String material, String manga, boolean cuello_alto, String tipo_cuello, String talla, String color ) {
		super(talla, color);
		this.material = material;
		this.manga = manga;
		this.cuello_alto = cuello_alto;
		this.tipo_cuello = tipo_cuello;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getManga() {
		return manga;
	}
	public void setManga(String manga) {
		this.manga = manga;
	}
	public boolean isCuello_alto() {
		return cuello_alto;
	}
	public void setCuello_alto(boolean cuello_alto) {
		this.cuello_alto = cuello_alto;
	}
	public String getTipo_cuello() {
		return tipo_cuello;
	}
	public void setTipo_cuello(String tipo_cuello) {
		this.tipo_cuello = tipo_cuello;
	}
	@Override
	public String toString() {
		return " \n***CHOMPA \n material: " + material + ",\n manga: " + manga + ", \n cuello_alto: " + cuello_alto + ", \n tipo_cuello="
				+ tipo_cuello + "\n "+ super.toString();
	}
	
}
