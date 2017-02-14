package Ajedrez;



//empezar por aki y luego seguir en tablero
public abstract class Pieza {

	protected String color;
	protected String nombre;
	
	
	
	public Pieza(){
		color = "Blancas";
		nombre = "Peon";
	}
	
	public String pintarPieza(){
		return color+nombre;
	}
	
	
	public String getcolor(){
		return color ;
	}
	public String getnombre(){
		return nombre ;
	}
	
	public void setcolor(String color){
		this.color = color;
	}
	public void setnombre(String nombre){
		this.nombre = nombre;
	}
	

	public abstract void validarMovimiento(Posicion posInicial ,Posicion posFinal);
}
