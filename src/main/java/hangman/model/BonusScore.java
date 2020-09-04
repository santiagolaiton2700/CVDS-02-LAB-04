package hangman.model;

public class BonusScore implements GameScore{
	private int score;
	private int penalizacion;
	private int bonificacion;
	private int minimo;
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
		score=0;
		bonificacion=10;
		penalizacion=5;
		minimo=0;
		
		if(score-(incorrectCount*penalizacion)+(correctCount*bonificacion)<minimo || incorrectCount<0 || correctCount<0) {
			throw new GameScoreException( GameScoreException.PUNTAJE_MINIMO);
		}else {
			score=score+(correctCount*bonificacion)-(incorrectCount*penalizacion);
		}
		return score;
	}

}
