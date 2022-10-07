package comunicacion;

public class Alfabeto extends Pictograma {
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String cadena = "";
		for(int i = 0; i < letras.length; i++) {
			cadena += letras[i];
			if (i<letras.length-1) {
				cadena += ", ";
			}
		}
		return cadena;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public String[] getLetras() {
		return letras;
	}
	
}
