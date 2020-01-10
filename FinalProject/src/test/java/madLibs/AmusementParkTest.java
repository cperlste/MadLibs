package madLibs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AmusementParkTest {
	@Test 
	public void amusementParkGetStoryCorrect() {
		String[] contents= {
				"water", "skirt", "funny", "silly",
				"mouse", "spies", "button",
				"donut", "pea soup", "toe", "computer", 
				"teeth", "lion", "google"};
		AmusementPark story= new AmusementPark();
		assertEquals("An amusement park is fun to visit on a hot summer water."
				+ "\nWhen you get there, you can wear your skirt and go for a swim. "
				+ "\nAnd there are lots of funny things to eat. "
				+ "\nYou can start off with a silly-dog on a "
				+ "mouse with mustard, relish, and spies on it. \nThen you can have a buttered ear of button"
				+ " with a nice slice of donut and a big bottle of cold pea soup. "
				+ "\nWhen you are full, "
				+ "it's time to go on the roller coaster, which should settle your toe. "
				+ "\nOther amusement park rides are the bumper cars, which have a little computer that you"
				+ " drive and run into other teeth, \nand the merry-go-round, where you can sit on a big"
				+ " lion \nand try to grab the gold google as you ride past it. Enjoy your day!", story.getStory(contents));
	}
	
}
