package Ajedrez;
/**
* Juego de Ajedrez
* 
* Contiene informacion de las Poscion
* 
* 
*
* @author Robert
* 
* @version 1.0
*/

public class Posicion {

	//atributos de la clase Posicion
	/**
	* Fila de la clase Posicion
	*/
	protected int fila;
	/**
	* Atributo columna de la clase Posicion
	*/
	protected int columna;
	
	
	/**
	*	Constructror de la clase e iniciados los atributos 
	* @param fila
	* @param columna
	*/
	public Posicion(){
		fila = 0;
		columna = 0;
	}
	
	
	
	/**
	* constructror de la clase  y con este se puede modificar los atributos
	*/
	public Posicion(int fila, int columna){
		this.columna = columna;
		this.fila = fila;
		
	}
	
	//
	/**
	* el Get nos sirve para obtener (recuperar o acceder) el valor ya asignado a un atributo
	*/
	public int getFila(){
		return fila;
	}
	public int getColumna(){
		return columna;
	}
	
	/**
	*  sirve para asignar un valor inicial a un atributo, pero de forma explícita.
	*/
	public void setfila(int fila){
		this.fila = fila;
	}
	/**
	*  sirve para asignar un valor inicial a un atributo, pero de forma explícita.
	*/
	public void setcolumna(int columna){
		this.columna = columna;
	}
	
	
	
	
	
	
	
	
	
}
