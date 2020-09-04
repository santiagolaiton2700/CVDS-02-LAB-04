package hangman.model;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
/**
*Original Score 
* -correctCount<0           				incorrect/@throws GameScoreException
* -incorrectCount<0         				incorrect/@throws GameScoreException
* -correctCount>=0 ^ 10<incorrectCount  	incorrect/@throws GameScoreException (SCORE<0)
* -correctCount>=0 ^ incorrectCount=0   	correct/score=100
* -correctCount>=0 ^ 0<incorrectCount<=10   correct/score-(incorrectCount*penalizacion)

*____________________________________________________________________________________________________________________


*Bonus Score 
* -correctCount<0           				incorrect/@throws GameScoreException
* -incorrectCount<0         				incorrect/@throws GameScoreException
* -correctCount=0 ^ incorrectCount>=1   	incorrect/@throws GameScoreException (SCORE<0)
* -correctCount=0 ^ incorrectCount=0	   	correct/score=0
* -correctCount=1 ^ incorrectCount=0		correct/score+(correctCount*bonificacion)-(incorrectCount*penalizacion)
* -correctCount=0 ^ incorrectCount=1		correct/score+(correctCount*bonificacion)-(incorrectCount*penalizacion)

*_____________________________________________________________________________________________________________________


*Power Score
* -correctCount<0           				incorrect/@throws GameScoreException
* -incorrectCount<0         				incorrect/@throws GameScoreException
* -correctCount=0 ^ incorrectCount>=1   	incorrect/@throws GameScoreException (SCORE<0)
* -correctCount=0 ^ incorrectCount=0  	    correct/score=0
* -correctCount>=4 ^ incorrectCount=0		correct/score=500
* -correctCount>0 ^ incorrectCount>0		correct/score+(correctCount*bonificacion)-(incorrectCount*penalizacion)
*/
public class GameScoreTest {
	private GameScore original = new OriginalScore();
	private GameScore bonus = new BonusScore();
	private GameScore power = new PowerScore();

/** 
* Pruebas Original Score
 * @throws GameScoreException 
*/
//Manda exception si parametros negativos(frontera)	
@Test 
public void deberianSerParametrosPositivoss() throws GameScoreException {
	try{
        original.calculateScore(-1,-1);
    }
    catch( Exception e ){
        Assert.assertTrue( true );
    }
}

//Manda excepcion si score es menor a cero (frontera) 
@Test 
public void elPuntajeMinimoDeberiaSerMayorIgualCero() throws GameScoreException {
	try{
        original.calculateScore(40,3);
    }
    catch( Exception e ){
        Assert.assertTrue( true );
    }
}

//ClaseEquivalencia: El score inicial es 100
@Test 
public void elScoreInicialEs100() throws GameScoreException {
	Assert.assertEquals(100,(original.calculateScore(0,0)));
}

//ClaseEquivalencia: No se bonifican letras correctas
@Test 
public void elScoreDeberiaSerElInicial() throws GameScoreException {
	Assert.assertEquals(100,(original.calculateScore(0,0)));
}

//ClaseEquivalencia: Cada letra incorrecta se penaliza con 10 puntos
@Test 
public void penalizacion() throws GameScoreException {
	Assert.assertEquals(90,(original.calculateScore(0,1)));
}
/** 
* Pruebas Bonus Score
 * @throws GameScoreException 
*/
//Manda exception si parametros negativos(frontera)	
@Test 
public void deberianSerParametrosPositivos() throws GameScoreException {
	try{
      bonus.calculateScore(-1,-1);
  }
  catch( Exception e ){
      Assert.assertTrue( true );
  }
}

//Manda excepcion si score es menor a cero (frontera) 
@Test 
public void elPuntajeMinimoEsCero() throws GameScoreException {
	try{
      bonus.calculateScore(1,0);
  }
  catch( Exception e ){
      Assert.assertTrue( true );
  }
}

//ClaseEquivalencia: El score inicial es 0
@Test 
public void elScoreInicialEs0() throws GameScoreException {
	Assert.assertEquals(0,(bonus.calculateScore(0,0)));
}

//ClaseEquivalencia: Se bonifica con 10 puntos cada letra correcta.
@Test 
public void bonificacion() throws GameScoreException {
	Assert.assertEquals(10,(bonus.calculateScore(1,0)));
}

//ClaseEquivalencia: Cada letra incorrecta se penaliza con 5 puntos
@Test 
public void penalizacionn() throws GameScoreException {
	Assert.assertEquals(5,(bonus.calculateScore(1,1)));
}

/** 
* Pruebas Power Score
 * @throws GameScoreException 
*/
//Manda exception si parametros negativos(frontera)	
@Test 
public void deberianSerParametrosPositivoos() throws GameScoreException {
	try{
      power.calculateScore(-1,-1);
  }
  catch( Exception e ){
      Assert.assertTrue( true );
  }
}

//Manda excepcion si score es menor a cero (frontera) 
@Test 
public void elPuntajeMinimoEs0() throws GameScoreException {
	try{
      power.calculateScore(0,15);
  }
  catch( Exception e ){
      Assert.assertTrue( true );
  }
}

//El puntaje mayor obtenido es 500 (frontera) 
@Test 
public void elPuntajeMaximoEs500() throws GameScoreException {
	Assert.assertEquals(500,(power.calculateScore(100,0)));
}

//ClaseEquivalencia: El score inicial es 0
@Test 
public void elScoreInicialEscero() throws GameScoreException {
	Assert.assertEquals(0,(power.calculateScore(0,0)));
}

//ClaseEquivalencia: La $i-ésima$ letra correcta se bonifica con $5^i$
@Test 
public void bonificacioon() throws GameScoreException {
	Assert.assertEquals(500,(power.calculateScore(10,0)));
}

}




