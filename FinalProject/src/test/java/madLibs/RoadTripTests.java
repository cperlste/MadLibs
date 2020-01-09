package madLibs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoadTripTests {
	@Test
	public void roadTripGetPromptsCorrect() {
		RoadTrip story= new RoadTrip();
		String [] myPrompts= {"an adjective", "a place", "an adjective", "an adjective", "a plural noun",
				"a plural noun", "a noun", "a verb", "a noun", "a verb ending in ed", "an action verb in past tense",
				"a plural noun", "a noun", "a verb ending in ING", "a noun", "a number", "an adjective",
				"an action verb", "a verb", "an adjective", "a noun"};
		assertArrayEquals(myPrompts, story.getPrompts());
	}
	@Test 
	public void roadTripGetFormatCorrect() {
		RoadTrip story= new RoadTrip();
		String format= "On the %s trip to %s, my  %s friend and I decided to invent a game."
				+ " \nSince this would be a rather  %s trip," + " it would need to be a game with  %s and  %s."
				+ " \nUsing our  %s to  %s, " + "we tried to get the  %s next to us to play too, "
				+ "but they just  %s at us and  %s away. "
				+ "\nAfter a few rounds, we thought the game could use some  %s, "
				+ "\nso we turned on the  %s and started  %s to the  %s that came on. "
				+ "\nThis lasted for %s hours before I got %s and decided to " + " %s. \nI'll never  %s that trip; "
				+ "it was the %s road trip of my  %s.";
	   assertEquals(format, story.getFormat());
	}
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
