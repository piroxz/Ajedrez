package Ajedrez;

public class Posicion {

	protected int fila;
	protected int columna;
	
	
	public Posicion(){
		fila = 0;
		columna = 0;
		
	}
	public Posicion(int fila, int columna){
		this.columna = columna;
		this.fila = fila;
		
	}
	public int getFila(){
		return fila;
	}
	public int getColumna(){
		return columna;
	}
	
	public void setfila(int fila){
		this.fila = fila;
	}
	public void setcolumna(int columna){
		this.columna = columna;
	}
	
	
	
	
	
	
	
	
	
}
