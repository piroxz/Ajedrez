package Ajedrez;

public class Tester {

	public static void main(String[] args) {
		
		
		Tablero tablero  = new Tablero();
		Juego juego = new juego();
		Movimiento mov = juego.Jugada("C2D4", tablero.tabla);
		

	}

}
