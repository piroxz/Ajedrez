package Ajedrez;

import java.util.Scanner;

public class Juego {
	//atributos de la clase Juego
	private int elTurno;
	
	//constructror de la clase e iniciados los atributos
	public Juego(){
		elTurno = 1;
	}
	
	//constructror de la clase  y con este se puede modificar los atributos
	public Juego(int elTurno){
		this.elTurno = elTurno;
	}

	
	//el Get nos sirve para obtener (recuperar o acceder) el valor ya asignado a un atributo 
	public int getelTurno(){
		return elTurno;
	}
	// sirve para asignar un valor inicial a un atributo, pero de forma explícita.
	public void setelTurno(int elTurno){
		this.elTurno = elTurno;
	}
	
	//este es un metodo el cual nos devuelve un movimiento .
	public Movimiento Jugada(String jugada,Pieza tabla[][]){
		Movimiento mov = null;
		
		char 0 = jugada.charAt(0); 
		
		
	
		return mov;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
