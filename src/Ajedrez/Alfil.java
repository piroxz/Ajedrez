package Ajedrez;

// clase alfil que hereda de Pieza

public class Alfil extends Pieza {
	
	public Alfil() {
		super();
	}
	public Alfil(String nombre,String color){
		this.nombre = nombre;
		this.color = color;
		
	}
	@Override
	public boolean validarMovimiento(Posicion posInicial, Posicion posFinal) {
		boolean validaMovimient = false;
		if(posInicial.getColumna()-posFinal.getColumna() ==  posInicial.getFila()-posFinal.getColumna()){
			validaMovimient = true; 
		}
		 
		return validaMovimient;
		
		
	}
	@Override
	public boolean pintarPieza(String color, String nombre) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
}
