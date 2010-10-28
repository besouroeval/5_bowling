
public class Bowling {

	public static int score(int[] game) {
		int total = 0;
		boolean spare = false;
		for(int i=0 ; i< game.length/2 ; i++){
			int frameTotal = 0;
			frameTotal += game[2*i];
			frameTotal += game[2*i+1];
			
			if (spare) {
				total += frameTotal;
			}
			
			if (frameTotal == 10) {
				spare = true;
			}
			
		}
		return total;
	}

}
