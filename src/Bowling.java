
public class Bowling {

	public static int score(int[] game) {
		int total = 0;
		for(int i=0 ; i< game.length/2 ; i++){
			total += game[2*i];
			total += game[2*i+1];
		}
		return total;
	}

}
