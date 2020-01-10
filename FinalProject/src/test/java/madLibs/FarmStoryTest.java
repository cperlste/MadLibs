package madLibs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FarmStoryTest {
	@Test
	public void FarmStoryGetStoryCorrect() {
		String[] contents= {
				"song", "phone", "silly", "burps", 
				"car", "wet", "stop signs", "plants", 
				"weights","twist", "nostril", "reading", 
				"cord", "painful", "bench", "blank", 
				"screen"
				};
		FarmStory story= new FarmStory();
		assertEquals("My Dad says Uncle Dudley's favorite expression is 'The early song"
				+ " catches the phone,' and boy is Dad right. "
				+ "\nWhen we stay at Uncle Dudley's silly farm, he drags us out of bed even before "
				+ "the rooster burps or the car comes up. \nAnd right after we eat a wet breakfast, "
				+ "we have to milk the cows, feed the stop signs, and groom the plants. \nOnly when "
				+ "we've finished our weights can we go out and play hid and twist, go bare nostril riding "
				+ "on the horses, or even reading in the old cord. \nDad thinks Uncle Dudley is a "
				+ "painful bench, but to the tell the blank truth, I love spending time on his screen.", story.getStory(contents));
	}
}
