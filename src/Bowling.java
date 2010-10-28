
public class Bowling {

	public static int score(int[] game) {
		int total = 0;
		
		for(int i=0 ; i< game.length/2 ; i++){
			
			int ball1 = game[2*i];
			int ball2 = game[2*i+1];

			total += ball1;
			total += ball2;
			
			if (ball1 == 10) {
				
				total += game[2*i+2];
				
				// two following strikes
				if (game[2*i+2] == 10) {
					// first ball, two frames ahead
					total += game[2*i+4];
					
				} else {
					// second ball, next frame
					total += game[2*i+3];
					
				}
				
			} else if (ball1 + ball2 == 10) {
				total += game[2*i+2];
				
			}
			
		}
		return total;
	}

}
