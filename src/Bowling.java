
public class Bowling {

	public static int score(int[] is) {
		int total = 0;
		for(int turn: is){
			total += turn;
		}
		return total;
	}

}
