package Ajedrez;




public abstract class Pieza {
	//atributos de la clase Pieza .
	protected String color;
	protected String nombre;
	
	
	// inicializa los atributos 
	public Pieza(){
		color = "Blancas";
		nombre = "Peon";
	}
	
	
	public String pintarPieza(){
		return color+nombre;
	}
	
	//el Get nos sirve para obtener (recuperar o acceder) el valor ya asignado a un atributo .	
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
	
	// esto es un metodo abstracto que se van a usar en sus hijos (en este caso en cada pieza del ajedrez)
	
	public abstract boolean validarMovimiento(Posicion posInicial ,Posicion posFinal);
	public abstract boolean pintarPieza(String color, String nombre);
}
