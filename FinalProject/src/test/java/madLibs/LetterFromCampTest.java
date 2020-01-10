package madLibs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LetterFromCampTest {

	@Test
	public void LetterFromCampGetStoryCorrect() {
		String contents[]= {"instruments", "blankets", "Batsheva Tanenbaum", "nice",
				"guitar", "purple", "run", "roof","barbeques", "keyboard",
				 "lawns", "basketball","pools", "chicken", "lonely",
				"trees", "elbow", "game", "Mindy"};
		LetterFromCamp story= new LetterFromCamp();
		assertEquals("Dear Folks,\nCamp is great! I like all the instruments in my tent.I have become close as\n"+
				 "two blankets in a pod with Batsheva Tanenbaum, who has a nice personality and is never without \n"+
				 "a guitar. He/she tells really purple stories which make all of us run out loud. I have\n"+
				 "to stop writing now. I know I promised a long roof, but this morning I washed my\n"+
				 "shirts and barbeques and put them out to dry on the clothes keyboard and it looks likes it's\n"+
				 "getting ready to rain cats and lawns. I better get off my basketball and get my pools off the\n"+
				 "chicken line before I run out of lonely clothes. I promise to write a letter chock full of\n"+
				 "trees before my elbow hits the pillow tonight...or tommorrow...or maybe I'll write Tuesday.\n"+
				 "Your loving game,\nMindy", story.getStory(contents));
	}
	
}
