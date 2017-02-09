package Ajedrez;

public class Posicion extends Tablero{

	protected int fila;
	protected int columna;
	protected  Tabla [][] tabla;
	
	public Posicion(){
		tabla[fila][columna] = [8][8];
		fila = 0;
		columna = 0;
	}
	
	public int getfila(){
		return fila;
	}
	public int columna(){
		return columna;
	}
	
	public void setfila(int fila){
		this.fila = fila;
	}
	public void setcolumna(int columna){
		this.columna = columna;
	}
	
	
	
	
	
	
	
	
	
}
