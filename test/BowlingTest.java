import junit.framework.Assert;

import org.junit.Test;


public class BowlingTest {

	@Test
	public void shouldComputeZeroGame() {
		Assert.assertEquals(0, Bowling.score(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
	}
	
}
