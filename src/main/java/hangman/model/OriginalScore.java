package hangman.model;

public class OriginalScore implements GameScore{
	private int score;
	private int penalizacion;
	private int minimo;
	
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
		score=100;
		penalizacion=10;
		minimo=0;
		
		if(score-(incorrectCount*penalizacion)<minimo || incorrectCount<0 || correctCount<0) {
			throw new GameScoreException( GameScoreException.PUNTAJE_MINIMO);
			
		}else {
			score=score-(incorrectCount*penalizacion);
			
		} 
		
		return score;
	}
	

}
