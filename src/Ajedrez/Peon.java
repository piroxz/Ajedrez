package Ajedrez;

//clase alfil que hereda de Pieza

public class Peon extends Pieza {
	//constructror de la clase y con el super se llama a los atributos de la  clase Pieza
	public Peon(){
		super();
	}
	//constructror de la clase y con el super se llama a los atributos de la  clase Pieza indicando cuales se modifican
	public Peon(String nombre,String color){
		super();
	}
	
	@Override
	public void validarMovimiento(Posicion posInicial, Posicion posFinal) {
		
		
	}

	@Override
	public void pintarPieza(String color, String nombre) {
		
		
	}
	
	
	
}
