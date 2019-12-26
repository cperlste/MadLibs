package madLibs;

import static org.junit.Assert.*;

import org.junit.*;

public class StoryTest {

	@Test
	public void roadTripStoryCorrect() {
		String[]content= {"funny", "Zimbabwe", "long", "purple",
				"teeth", "hairs", "coat", "scratch",
				"cord", "started", "ran", "sweaters",
				"earring", "waiting", "word", "400 thousand",
				"enormous", "jump", "spit", "stale",
				"person"};
		RoadTrip story= new RoadTrip(content);
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
				+ "it was the stale road trip of my  person.", story.getStory());
	}
	
	@Test 
	public void amusementParkStoryCorrect() {
		String[] contents= {
				"water", "skirt", "funny", "intelligent",
				"mouse", "spies", "button",
				"donut", "pea soup", "toe", "computer", 
				"teeth", "lion", "google"};
		AmusementPark story= new AmusementPark(contents);
		assertEquals("An amusement park is fun to visit on a hot summer water."
				+ "\nWhen you get there, you can wear your skirt and go for a swim. "
				+ "\nAnd there are lots of funny things to eat. "
				+ "\nYou can start off with a/an intelligent-dog on a"
				+ "mouse with mustard, relish, and spies on it. \nThen you can have a buttered ear of button"
				+ " with a nice slice of donut and a big bottle of cold pea soup. "
				+ "\nWhen you are full, "
				+ "it's time to go on the roller coaster, which should settle your toe. "
				+ "\nOther amusement park rides are the bumper cars, which have a little computer that you"
				+ " drive and run into other teeth, \nand the merry-go-round, where you can sit on a big"
				+ " lion \nand try to grab the gold google as you ride past it. Enjoy your day!", story.getStory());
	}
}
