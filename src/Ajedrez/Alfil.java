package Ajedrez;

// clase alfil que hereda de Pieza

public class Alfil extends Pieza {
	//constructror de la clase y con el super se llama a los atributos de la  clase Pieza
	public Alfil() {
		super();
	}
	
	//constructror que nos permite modificar los atributos o darles valor. 
	public Alfil(String nombre,String color){
		this.nombre = nombre;
		this.color = color;
		
	}
	
	//Este metodo nos devuelve un movimiento valido el cual utilizo un boolean para poder comparar si donde la pieza se movera esta vacia		
	@Override
	public boolean validarMovimiento(Posicion posInicial, Posicion posFinal) {
		boolean validaMovimient = false;
		if(posInicial.getColumna()-posFinal.getColumna() ==  posInicial.getFila()-posFinal.getColumna()){
			validaMovimient = true; 
		}
		return validaMovimient;
	}
	// metodo abstracto que es llamado del padre (Pieza) 
	@Override
	
	public boolean pintarPieza(String color, String nombre) {
		
		
	}
	

	
	
	
}
