
public class Bowling {

	public static int score(int[] game) {
		int total = 0;
		for(int i=0 ; i< game.length/2 ; i++){
			int frameTotal = 0;
			frameTotal += game[2*i];
			frameTotal += game[2*i+1];
			total += frameTotal;
		}
		return total;
	}

}
