package Ajedrez;
/**
* Juego de Ajedrez
* 
* Contiene informacion de las piezas
* 
* 
*
* @author Robert
* 
* @version 1.0
*/



public abstract class Pieza {
	//atributos de la clase Pieza .
	
	/**
	*Color de la clase pieza
	*/
	protected String color;
	/**
	* nombre de la clase pieza
	*/
	protected String nombre;
	
	
	// Metodos publicos
	/**
	* Constructor de la clase Pieza por defecto que inicializa por defecto dos parametros.
	* @param color el color de la pieza
	* @param nombre nombre de la pieza
	*/
	public Pieza(){
		color = "Blancas";
		nombre = "Peon";
	}
	
	/**
	* metodo pintarPieza que devuelve @return color+nombre
	*/
	public String pintarPieza(){
		return color+nombre;
	}
	//el Get nos sirve para obtener (recuperar o acceder) el valor ya asignado a un atributo .	
	/**
	* get color que nos devuelve @return color .
	*/
	public String getcolor(){
		return color ;
	}
	/**
	* get de nombre que nos devuelve @return nombre
	*/
	public String getnombre(){
		return nombre ;
	}
	
	// los set modifica los datos 
	/**
	* set que modifica @param color color
	*/
	public void setcolor(String color){
		this.color = color;
	}
	/**
	* set que modifica @param nombre nombre
	*/
	public void setnombre(String nombre){
		this.nombre = nombre;
	}
	
	// esto es un metodo abstracto que se van a usar en sus hijos (en este caso en cada pieza del ajedrez)
	/**
	* Metodos abstractos .
	*/
	public abstract boolean validarMovimiento(Posicion posInicial ,Posicion posFinal);
	public abstract boolean pintarPieza(String color, String nombre);
}
