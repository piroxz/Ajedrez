package Ajedrez;



//empezar por aki y luego seguir en tablero
public abstract class Pieza {

	protected String color;
	protected String nombre;
	
	
	// inicializa los atributos 
	public Pieza(){
		color = "Blancas";
		nombre = "Peon";
	}
	
	// lso get devuelve los datos 
	public String pintarPieza(){
		return color+nombre;
	}
	
	
	public String getcolor(){
		return color ;
	}
	public String getnombre(){
		return nombre ;
	}
	
	// los set modifica los datos 
	public void setcolor(String color){
		this.color = color;
	}
	public void setnombre(String nombre){
		this.nombre = nombre;
	}
	
	// esto es un metodo abstracto que se van a usar en sus hijos (en este caso en cada pieza del ajedrez
	
	public abstract boolean validarMovimiento(Posicion posInicial ,Posicion posFinal);
	public abstract boolean pintarPieza(String color, String nombre);
}
