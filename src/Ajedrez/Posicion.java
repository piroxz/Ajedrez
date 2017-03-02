package Ajedrez;


public class Posicion {

	//atributos de la clase Posicion
	
	protected int fila;
	protected int columna;
	
	//constructror de la clase e iniciados los atributos  
	public Posicion(){
		fila = 0;
		columna = 0;
		
	}
	
	//constructror de la clase  y con este se puede modificar los atributos
	public Posicion(int fila, int columna){
		this.columna = columna;
		this.fila = fila;
		
	}
	
	//el Get nos sirve para obtener (recuperar o acceder) el valor ya asignado a un atributo 
	public int getFila(){
		return fila;
	}
	public int getColumna(){
		return columna;
	}
	
	// sirve para asignar un valor inicial a un atributo, pero de forma explícita.
	
	public void setfila(int fila){
		this.fila = fila;
	}
	public void setcolumna(int columna){
		this.columna = columna;
	}
	
	
	
	
	
	
	
	
	
}
