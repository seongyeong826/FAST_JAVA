package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore1 = 150;
		int lastScore1 = ++gameScore1;	// gameScore += 1;  gameScore = gameScore + 1 와 같은 뜻
		
		System.out.println(lastScore1);
		System.out.println(gameScore1);
		
		
		
		int gameScore2 = 150;
		int lastScore2 = gameScore2++;
		
		System.out.println(lastScore2);
		System.out.println(gameScore2);

	}

}
