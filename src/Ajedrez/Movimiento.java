package Ajedrez;

public class Movimiento {

	protected Posicion posInicial;
	protected Posicion posFinal;
	
	
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
	
	
	
	public int comprobarMov(){
		
	}
	
	public boolean esHorizontal(){
		
		boolean horizontal = false;
		if (posInicial.fila==posFinal.fila)
			horizontal = true;
		return horizontal;
	}
	
	public boolean esDiagonal(){
		
		boolean diagonal = false;
		if (posInicial.fila!=posFinal.fila)
			diagonal = true;
		return diagonal;
	}
	
	public int saltoHorizontal(){
		int saltoHori = 0;
		saltoHori = posInicial.columna - posFinal.columna ;
		if (saltoHori < 0)
			saltoHori = saltoHori *(-1);
		return saltoHori;
		
	}
	
	public int saltoVertical(){
		int saltoVer = 0;
		saltoVer = posInicial.fila - posFinal.fila;
		if (saltoVer < 0 )
			saltoVer = saltoVer * (-1);
		return saltoVer;
	}
	
}
