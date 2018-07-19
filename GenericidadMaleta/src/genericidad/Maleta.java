package genericidad;

public class Maleta <T>{
	private T dato;

	public Maleta() {
		this.dato=null;
	}
	public T levantar() {
		System.out.println("Se levanto en elemento "+this.dato+" de la maleta");
		return this.dato;
	}

	public void poner(T d) {
		System.out.println("Se puso en elemento "+d+" en la maleta");
		this.dato = d;
	}

	public T quito() {
		System.out.println("Se quito en elemento "+this.dato+" de la maleta");
		T x=this.dato;
		this.dato=null;
		return x;
	}

	@Override
	public String toString() {
		return "***CONTENIDO DE MALETA*** \n " + dato + "\n************************";
	}
}
