package Ajedrez;

public class Juego {
	
	private int elTurno;
	
	public Juego(){
		elTurno = 1;
	}
	
	
	public Juego(int elTurno){
		this.elTurno = elTurno;
	}

	public int getelTurno(){
		return elTurno;
	}
	
	public void setelTurno(int elTurno){
		this.elTurno = elTurno;
	}
	
	public Movimiento Jugada(String jugada,Pieza tabla[][]){
		Movimiento mov = null;
		return mov;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
