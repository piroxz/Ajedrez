package Ajedrez;

//clase alfil que hereda de Pieza

public class Reina extends Pieza{

	
	public Reina(){
		super();
	}
	public Reina(String nombre,String color){
		this.nombre = nombre;
		this.color = color;
	}
	
	@Override
	
	public void validarMovimiento(Posicion posInicial, Posicion posFinal){
		
	}
}
