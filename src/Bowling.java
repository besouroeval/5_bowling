
public class Bowling {

	public static int score(int[] game) {
		int total = 0;
		for(int turn: game){
			total += turn;
		}
		return total;
	}

}
