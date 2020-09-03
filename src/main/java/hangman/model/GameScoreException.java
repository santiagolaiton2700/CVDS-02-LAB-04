package hangman.model;

public class GameScoreException extends Exception {
	public static final String PUNTAJE_MINIMO = "El puntaje no puede ser menor a 0";
	public GameScoreException(String message) {
		super(message); 
	}
}
