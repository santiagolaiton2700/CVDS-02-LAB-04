package hangman.model;

public class OriginalScore implements GameScore{
	private int score;
	private int penalizacion;
	private int minimo;
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreExceptions {
		score=100;
		penalizacion=10;
		minimo=0;
		
		if(score-(incorrectCount*penalizacion)<minimo) {
			
		}
		
		return 0;
	}
	

}
