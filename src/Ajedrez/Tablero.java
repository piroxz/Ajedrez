package Ajedrez;

public class Tablero {

	protected Pieza tabla[][] ;
	
	
	
	public Tablero(){
		Pieza tabla[][] = new Pieza[7][7];
		tabla[0][0] = new Torre(color,nombre);
		tabla[0][1] =new Arfil(color,nombre);		
	}
	
	
	
	
	
	
	
	
	
	
}
