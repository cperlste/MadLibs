package madlibs;

import static org.junit.Assert.*;
import org.junit.*;

public class StoryTest {
	@Test
	public void vacayStoryCorrect() {
		String[] adjectives= {"funny", "happy", "silly", "weird", "fat"};
		String[] nouns= {"Timbuktu", "skirts", "tires", "mint", "folder", "papers", "rhinestone", "cup", "years", "pencil"};
		String[] verbs= {"eat", "jump", "walking", "pay", "laugh"};
		RoadTrip story= new RoadTrip(userInputs);
		String expected=("On the "+"funny"+" trip to "+"Timbuktu"+", my "+"happy"+" friend and I decided to invent a game. "
				+ "\nSince this would be a rather "+"silly"+ " trip, it would need to be a game with "+"skirts"+" and "+"tires"
				+". \nUsing our "+"mint"+" to "+"eat"+", we tried to get the "+"papers"+" next to us to play too, but they just "+"laugh"+"ed at us and "+"jump"+
				" away. \nAfter a few rounds, we thought the game could use some "+"folder"+" so we turned on the "+"rhinestone"+" and started "+"walking"+
				" to the "+ "cup"+ " that came on. \nThis lasted for "+"years"+ " before I got "+"weird"+" and decided to "+"pay"+". I'll never "+"laugh"+" that trip;"
						+ " it was the "+"fat"+" road trip of my "+"pencil"+".");
		assertEquals(expected, story.getStory());
	}
}
