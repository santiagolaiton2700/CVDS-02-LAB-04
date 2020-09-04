package hangman.model;
import java.lang.Math;

public class PowerScore implements GameScore {
	private int score;
	private int penalizacion;
	private int minimo;
	private int bonificacion;
	private int maximo;
	private int bono;
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
		score=0;
		minimo=0;
		penalizacion=8;
		bono=5;
		maximo=500; 
		
		if(score-(incorrectCount*penalizacion)+(correctCount*bonificacion)<minimo || incorrectCount<0 || correctCount<0) {
			throw new GameScoreException( GameScoreException.PUNTAJE_MINIMO);
		}
		for (int i=1;i<correctCount;i++) {
			score+=(Math.pow(bono,i));
		}
			
		score=score-incorrectCount*penalizacion;
		
		if(score>500) {
			return 500;
		}else {
			return score;
		}
		
	}
	

}
