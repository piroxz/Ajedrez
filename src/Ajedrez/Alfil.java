package Ajedrez;

/**
* Juego de Ajedrez
* 
* Contiene informacion de la pieza Alfil que hereda de pieza
* 
* 
*
* @author Robert
* 
* @version 1.0
*/

public class Alfil extends Pieza {
	
	/**
	*	Constructror de la clase y con el super se llama a los atributos de la  clase Pieza
	*/
	public Alfil() {
		super();
	}
	
	 
	/**
	*	Constructror que nos permite modificar los atributos o darles valor.
	*/
	public Alfil(String nombre,String color){
		this.nombre = nombre;
		this.color = color;
		
	}
	
	
	/**
	*	Este metodo nos devuelve un movimiento valido el cual utilizo un boolean para poder comparar si donde la pieza se movera esta vacia
	*
	*	nos devolverta @return validaMovimient 
	*/
	@Override
	public boolean validarMovimiento(Posicion posInicial, Posicion posFinal) {
		boolean validaMovimient = false;
		if(posInicial.getColumna()-posFinal.getColumna() ==  posInicial.getFila()-posFinal.getColumna()){
			validaMovimient = true; 
		}
		return validaMovimient;
	}
	/**
	*	 metodo abstracto que es llamado del padre (Pieza) 
	*
	*	
	*/
	
	@Override
	
	public boolean pintarPieza(String color, String nombre) {
		
		
	}
	

	
	
	
}
