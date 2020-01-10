package madLibs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DriversChecklistTests {
	
	@Test 
	public void driversChecklistGetStoryCorrect() {
		String[]contents= {"fat", "brown", "cholent", "wooly",
				"bottles", "mouse", "lips", "brilliantly",
				"hair", "juice", "car", "gasoline",
				"keypads", "case", "54 billion"};
		DriversChecklist story = new DriversChecklist();
		assertEquals("Before you follow the open road to a fat adventure, Dont forget to:\n"+ 
				"1. Have a brown mechanic give your cholent a wooly tune-up.\n" + 
				"2. Make sure there is sufficient air in all four bottles as well as in your spare mouse.\n" + 
				"3. Make sure your windshield lips are fuctioning brilliantly.\n" + 
				"4. Be sure to have a flash hair, some bottled juice, and an emergency car kit in your glove gasoline.\n" + 
				"5. For your safety and the safety of other keypads, don't even think about getting behind the case\n" + 
				"   of the car without getting a good night's sleep of at least 54 billion hours.", story.getStory(contents));
	}
}
