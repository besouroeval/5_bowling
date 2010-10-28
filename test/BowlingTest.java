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
	public void shouldComputeOneSpare() {
		Assert.assertEquals(12, Bowling.score(new int[]{1,9,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
	}
	
	@Test
	public void shouldComputeTwoFollowingSpares() {
		Assert.assertEquals(23, Bowling.score(new int[]{1,9,1,9,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
	}
	
	@Test
	public void shouldComputeThreeFollowingSpares() {
		Assert.assertEquals(11+11+11+1, Bowling.score(new int[]{1,9, 1,9, 1,9, 1,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0}));
	}
	
	@Test
	public void shouldComputeOneStrike() {
		Assert.assertEquals(14, Bowling.score(new int[]{10,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
	}
	
	@Test
	public void shouldComputeTwoFollowingStrikes() {
		Assert.assertEquals(21+12+2, Bowling.score(new int[]{10,0, 10,0, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0 }));
	}
	
	@Test
	public void shouldComputeThreeFollowingStrikes() {
		Assert.assertEquals(30+21+12+2, Bowling.score(new int[]{10,0, 10,0, 10,0, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0 }));
	}
	
	@Test
	public void shouldComputeLastBall() {
		Assert.assertEquals(12, Bowling.score(new int[]{0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 10,1,1 }));
	}
	
	@Test
	public void shouldComputePerfectGame() {
		Assert.assertEquals(300, Bowling.score(new int[]{0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 10,1,1 }));
	}
}
