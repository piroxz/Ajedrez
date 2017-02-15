package Ajedrez;

public class Tablero {

	protected Pieza tabla[][] ;
	
	
	
	public Tablero(){
		tabla[0][0] = new Torre("color","nombre");
		tabla[0][1] = new Caballo("color","nombre");	
		tabla[0][2] = new Alfil("color","nombre");
		tabla[0][3] = new Rey("color","nombre");
		tabla[0][4] = new Reina("color","nombre");
		tabla[0][5] = new Alfil("color","nombre");
		tabla[0][6] = new Caballo("color","nombre");	
		tabla[0][7] = new Torre("color","nombre");
		for (int i = 0; i < tabla[1].length; i++) {
			tabla[1][i] = new Peon("color","nombre");
		}
		
		tabla[7][0] = new Torre("color","nombre");
		tabla[7][1] = new Caballo("color","nombre");	
		tabla[7][2] = new Alfil("color","nombre");
		tabla[7][3] = new Rey("color","nombre");
		tabla[7][4] = new Reina("color","nombre");
		tabla[7][5] = new Alfil("color","nombre");
		tabla[7][6] = new Caballo("color","nombre");	
		tabla[7][7] = new Torre("color","nombre");
		for (int i = 0; i < tabla[6].length; i++) {
			tabla[6][i] = new Peon("color","nombre");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
