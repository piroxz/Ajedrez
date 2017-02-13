package Ajedrez;

public class Movimiento {

	protected Posicion posInicial;
	protected Posicion posFinal;
	
	public Movimiento(){
		posInicial = 0 ;
		posFinal = 0 ;
	}
	
	public Movimiento(Posicion posInicial,Posicion posFinal){
		this.posInicial = posInicial;
		this.posFinal = posFinal;	
	}
	
	public boolean esVertical(){
		
		 boolean vertical = false;
		 if (posInicial.columna==posFinal.columna)
			 vertical=true;
		 return vertical;
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
