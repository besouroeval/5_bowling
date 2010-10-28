import junit.framework.Assert;

import org.junit.Test;


public class BowlingTest {

	@Test
	public void shouldComputeZeroGame() {
		Assert.assertEquals(0, Bowling.score(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
	}
	
	@Test
	public void shouldComputeSingleHitGame() {
		Assert.assertEquals(1, Bowling.score(new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
	}
	
	@Test
	public void shouldComputeTotalSum() {
		Assert.assertEquals(20, Bowling.score(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
	}
	
	@Test
	public void shouldComputeSpare() {
		Assert.assertEquals(12, Bowling.score(new int[]{1,9,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
	}
	
}
