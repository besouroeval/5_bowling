
public class Bowling {

	public static int score(int[] game) {
		int total = 0;
		boolean spare = false;
		for(int i=0 ; i< game.length/2 ; i++){
			int ball1 = game[2*i];
			int ball2 = game[2*i];
			
			total += frameTotal;
			
			if (frameTotal == 10) {
				spare = true;
			}
			
		}
		return total;
	}

}
