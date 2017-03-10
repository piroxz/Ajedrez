package Ajedrez;

//clase Peon que hereda de Pieza
/**
* Juego de Ajedrez
* 
* Contiene informacion de la pieza Peon que hereda de pieza
* 
* 
*
* @author Robert
* 
* @version 1.0
*/

public class Peon extends Pieza {
	
	/**
	* constructror de la clase y con el super se llama a los atributos de la  clase Pieza
	*/
	public Peon(){
		super();
	}

	/**
	*	 constructror de la clase y con el super se llama a los atributos de la  clase Pieza indicando cuales se modifican 	
	*/
	public Peon(String nombre,String color){
		super();
	}
	
	/**
	*	 metodo abstracto que es llamado del padre (Pieza) 	
	*/
	@Override
	public void validarMovimiento(Posicion posInicial, Posicion posFinal) {
		
		
	}
	
	/**
	*	 metodo abstracto que es llamado del padre (Pieza) 	
	*/
	@Override
	public void pintarPieza(String color, String nombre) {
		
		
	}
	
	
	
}
