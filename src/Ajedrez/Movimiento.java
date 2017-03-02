package Ajedrez;

public class Movimiento {
	//atributos prtegidos de la clase Posicion .
	protected Posicion posInicial;
	protected Posicion posFinal;
	
	//constructror publico de la clase Movimiento en cual no da la posibilidad de dar valores a los atributos. 
	public Movimiento(Posicion posInicial,Posicion posFinal){
		this.posInicial = posInicial;
		this.posFinal = posFinal;	
	}
	
	// metodo para conocer si una pieza permanece en la la misma columna.
	public boolean esVertical(){
		
		 boolean vertical = false;
		 if (posInicial.columna==posFinal.columna)
			 vertical=true;
		 return vertical;
	}
	
	
	
	public int comprobarMov(){
		
		
	}
	// metodo para conocer si una pieza permanece en la la misma fila.
	public boolean esHorizontal(){
		
		boolean horizontal = false;
		if (posInicial.fila==posFinal.fila)
			horizontal = true;
		return horizontal;
	}
	// metodo para conocer si una pieza cambia de fila y columna .
	public boolean esDiagonal(){
		
		boolean diagonal = false;
		if (posInicial.fila!=posFinal.fila)
			diagonal = true;
		return diagonal;
	}
	// metodo para conocer cuantos saltos horizontales da la pieza restando la posicion inicial y la pisocion final.
	public int saltoHorizontal(){
		int saltoHori = 0;
		saltoHori = posInicial.columna - posFinal.columna ;
		return saltoHori;
		
	}
	// metodo para conocer cuantos saltos verticales  da la pieza restando la posicion inicial y la pisocion final.
	public int saltoVertical(){
		int saltoVer = 0;
		saltoVer = posInicial.fila - posFinal.fila;
		if (saltoVer < 0 )
			saltoVer = saltoVer * (-1);
		return saltoVer;
	}
	
}
