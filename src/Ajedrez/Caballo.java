package Ajedrez;

//clase caballo que hereda de Pieza
/**
* Juego de Ajedrez
* 
* Contiene informacion de la pieza caballo que hereda de pieza
* 
* 
*
* @author Robert
* 
* @version 1.0
*/
public class Caballo extends Pieza{

	
	/**
	*	 constructror de la clase y con el super se llama a los atributos de la  clase Pieza 	
	*/
	public Caballo (){
		super();
	}
	

	/**
	*	 Constructror de la clase y con el super se llama a los atributos de la  clase Pieza indicando entre parentesis los atributos que usaremos.
	*/
	public Caballo(String nombre,String color){
		super();
	}
	
	
	/**
	*	 metodo abstracto que es llamado del padre (Pieza) 	
	*/
	@Override
	public void validarMovimiento(Posicion posInicial, Posicion posFinal){
		
		
		
	}
	
	/**
	*	 metodo abstracto que es llamado del padre (Pieza) 	
	*/
	@Override
	public void pintarPieza(String nombre, String color){
		
	}
}
