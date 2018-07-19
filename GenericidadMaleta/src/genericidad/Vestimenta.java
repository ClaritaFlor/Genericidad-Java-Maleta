package genericidad;

public class Vestimenta {
	private String talla;
	private String color;
	public Vestimenta() {
		this.talla = "";
		this.color = "";
	}
	public Vestimenta(String talla, String color) {
		this.talla = talla;
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Vestimenta \n talla: " + talla + ", \n color: " + color + "";
	}

}
