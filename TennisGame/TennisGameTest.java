//import junit.framework.TestCase;

public class TennisGameTest {
	
	TennisGame game = new TennisGame("Boris Becker" , "Bjorn Borg");
	
    public TennisGameTest() 
    {
	    this.testNewGameShouldReturnLoveAll();
	}
	
	public void testNewGameShouldReturnLoveAll()
	{
		String score = game.getScore();
		
		System.out.format("Love all", score);
	}
	
	public void testPlayerOneWinsFirstBall()
	{
		game.playerOneScores();

		String score = game.getScore();
		System.out.format("Fifteen,Love", score);		
	}
	
	public void testFifteenAll(){
		game.playerOneScores();
		game.playerTwoScores();
		
		String score = game.getScore();
		System.out.format("Fifteen all", score);
	}
	
	public void testPlayerTwoWinsFirstTwoBalls() {
		createScore(0, 2);
		
		String score = game.getScore();
		System.out.format("Love,Thirty", score);
	}
	
	
	public void testPlayerOneWinsFirstThreeBalls(){
		createScore(3, 0);
		String score = game.getScore();
		System.out.format("Forty,Love", score);
	}
	
	public void testPlayersAreDeuce() {
		createScore(3, 3);
		
		String score = game.getScore();
		System.out.format("Deuce", score);		
	}
	
	public void testPlayerOneWinsGame()
	{
		createScore(4, 0);
		
		String score = game.getScore();
		System.out.format("Boris Becker wins", score);
	}
	
	public void testPlayerTwoWinsGame(){
		createScore(1,4);
		
		String score = game.getScore();
		System.out.format("Bjorn Borg wins", score);
	}
	
	public void testPlayersAreDuce4() {
		createScore(4, 4);
		String score = game.getScore();
		System.out.format("Deuce", score);		
	}

	public void testPlayerTwoAdvantage(){
		createScore(4, 5);
		
		String score = game.getScore();
		System.out.format("Advantage Bjorn Borg", score);
	}

	public void testPlayerOneAdvantage(){
		createScore(5, 4);
		
		String score = game.getScore();
		System.out.format("Advantage Boris Becker", score);
	}
	
	public void testPlayerTwoWins(){
		createScore(2, 4);
		String score = game.getScore();
		System.out.format("Bjorn Borg wins", score);
	}
	
	
	public void testPlayerTwoWinsAfterAdvantage() {
		createScore(6, 8);
		String score = game.getScore();
		System.out.format("Bjorn Borg wins", score);
	}
	
	
	
	public void testPlayerOneWinsAfterAdvantage() {
		createScore(8, 6);
		String score = game.getScore();
		System.out.format("Boris Becker wins", score);
	}
	
    
	
	private void createScore(int playerOneBalls, int playerTwoBalls ) {
		for (int i = 0; i < playerOneBalls; i++) {
			game.playerOneScores();
		}
		for (int i = 0; i < playerTwoBalls; i++) {
			game.playerTwoScores();
		}
	}

    public static void main(String [] args)
    {
       System.out.println("Play Tennis Game");
       //TennisGameTest test = new TennisGameTest();
       //test.testPlayerTwoWinsFirstTwoBalls();
    }    		
    
}




