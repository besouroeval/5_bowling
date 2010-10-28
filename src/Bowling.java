
public class Bowling {

	public static int score(int[] game) {
		int total = 0;
		boolean strike = false;
		boolean spare = false;
		
		for(int i=0 ; i< game.length/2 ; i++){
			
			int ball1 = game[2*i];
			int ball2 = game[2*i+1];

			if (strike) {
				total += 2*ball1;
				total += 2*ball2;
				strike = false;
				
			} else if (spare) {
				total += 2*ball1;
				total += ball2;
				spare = false;
				
			}
			
			if (strike) {
				total += 2*ball1;
				total += 2*ball2;
				strike = false;
				
			} else if (spare) {
				total += 2*ball1;
				total += ball2;
				spare = false;
				
			} else {
				total += ball1;
				total += ball2;
				
			}
			
			if (ball1 == 10) {
				strike = true;
			} else if (ball1 + ball2 == 10) {
				spare = true;
			}
			
		}
		return total;
	}

}
