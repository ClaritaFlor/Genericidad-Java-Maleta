package genericidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrincipalMaleta {

	public static void main(String[] args) {
		Maleta<Vestimenta> maleta1=new Maleta<Vestimenta>();
		maleta1.poner(new Vestimenta("XXL","Rojo"));
		System.out.println(maleta1.toString());
		maleta1.quito();
		System.out.println(maleta1.toString());
		
		Maleta<Vestimenta> maleta2=new Maleta<Vestimenta>();
		maleta2.poner(new Chompa("lana","larga",true,"bicle","S","Verde"));
		System.out.println(maleta2.toString());
		maleta2.quito();
		System.out.println(maleta2.toString());
		
		//********USO DE ARRAYLIST
		List<Vestimenta> lista = new ArrayList<Vestimenta>();
		System.out.println("***********Añadiendo una fruta: manzana");
		lista.add(new Vestimenta("XXL","Rojo"));
		lista.add(new Chompa("lana","larga",true,"bicle","S","Verde"));
		lista.add(new Chompa("lana","3/4",false,"cuello V","XS","Rojo"));
		lista.add(new Pantalon("tela","clasico","S","Verde"));
		lista.add(new Pantalon("jeans","clasico","L","azul"));
		lista.add(new Pantalon("jeans","tubo","XS","azul"));
		lista.add(new Chompa("poliester","larga",true,"bicle","L","Negro"));
		lista.add(new Chompa("algodon","3/4",false,"cuello O","M","Rosado"));
		System.out.println("***********Imprimiendo ArrayList de Frutas");
		Iterator<Vestimenta> recorreLista = lista.iterator();
		while(recorreLista.hasNext()){
			Vestimenta elemento = recorreLista.next();
			System.out.println(elemento);
		}
	}

}
