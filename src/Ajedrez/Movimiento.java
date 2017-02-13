package Ajedrez;

public class Movimiento {

	protected int posInicial;
	protected int posFinal;
	
	public Movimiento(){
		posInicial = 0 ;
		posFinal = 0 ;
	}
	
	public Movimiento(int posInicial,int posFinal){
		this.posInicial = posInicial;
		this.posFinal = posFinal;	
	}
	
	public boolean esVertical(){
		
		 boolean vertical = true;
		 
		if(posInicial%2 != 0){
			return vertical ;
		}else
			return vertical = false;
	
	}
	
	
	public boolean esHorizontal(){
		
		boolean vertical = true;
		
		if(posInicial%2 == 0){
			return vertical ;
		}else
			return vertical = false;
	}
	
	public boolean esDiagonal(){
		
	}
	
	public int saltoHorizontal(){
		
		
	}
	
	public int saltoVertical(){
		
	}
	
}
