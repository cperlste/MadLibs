package madLibs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoadTripTests {
	@Test
	public void roadTripStoryCorrect() {
		String[]content= {"funny", "Zimbabwe", "long", "purple",
				"teeth", "hairs", "coat", "scratch",
				"cord", "started", "ran", "sweaters",
				"earring", "waiting", "word", "400 thousand",
				"enormous", "jump", "spit", "stale",
				"person"};
		RoadTrip story= new RoadTrip();
		assertEquals("On the funny trip to Zimbabwe, my  long friend and I decided to invent a game."
				+ " \nSince this would be a rather  purple trip,"
				+ " it would need to be a game with  teeth and  hairs."
				+ " \nUsing our  coat to  scratch, "
				+ "we tried to get the  cord next to us to play too, "
				+ "but they just  started at us and  ran away. "
				+ "\nAfter a few rounds, we thought the game could use some  sweaters, "
				+ "\nso we turned on the  earring and started  waiting to the  word that came on. "
				+ "\nThis lasted for 400 thousand hours before I got enormous and decided to "
				+ " jump. \nI'll never  spit that trip; "
				+ "it was the stale road trip of my  person.", story.getStory(content));
	}
}
