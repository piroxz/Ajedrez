package Ajedrez;
/**
* Juego de Ajedrez
* 
* Contiene informacion del Juego
* 
* 
*
* @author Robert
* 
* @version 1.0
*/
import java.util.Scanner;

public class Juego {
	//atributos de la clase Juego
	
	/**
	*	Atributo elTurno 
	*/
	private int elTurno;
	
	
	/**
	*	constructror de la clase e iniciados los atributos
	*/
	public Juego(){
		elTurno = 1;
	}
	
	
	/**
	*	constructror de la clase  y con este se puede modificar los atributos 
	*/
	public Juego(int elTurno){
		this.elTurno = elTurno;
	}

	
	
	/**
	*	El Get nos sirve para obtener (recuperar o acceder) el valor ya asignado a un atributo
	*
	*	@return elTurno
	*/
	public int getelTurno(){
		return elTurno;
	}
	
	
	/**
	*	Sirve para asignar un valor inicial a un atributo, pero de forma explícita.
	*/
	public void setelTurno(int elTurno){
		this.elTurno = elTurno;
	}
	
	
	/**
	*	Este es un metodo el cual nos devuelve @return mov un movimiento .
	*/
	public Movimiento Jugada(String jugada,Pieza tabla[][]){
		Movimiento mov = null;
		
		char 0 = jugada.charAt(0); 
		
		
	
		return mov;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
