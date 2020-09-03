package hangman.model;

public class PowerScore implements GameScore {
	private int score;
	private int penalizacion;
	private int minimo;
	private int bonificacion;
	
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
		score=0;
		minimo=0;
		penalizacion=8;
	}
	

}
