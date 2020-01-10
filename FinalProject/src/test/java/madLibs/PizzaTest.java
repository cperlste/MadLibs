package madLibs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PizzaTest {

	@Test
	public void PizzaRecipeGetStoryCorrect() {
		String[]contents= {"crazy", "Nigerian", "Donald Trump", "house",
				"big", "window", "truck", "impressive",
				"watches", "ring", "613", "parallelograms", 
				"waffles", "lasagna", "12,365,479,936"};
		Pizza story = new Pizza();
		assertEquals("Pizza was invented by a crazy Nigerian chef named Donald Trump. \nTo make "
				+ "pizza, you need to take a lump of house, and make a thin, round "
				+ "big window. \nThen you cover it with truck sauce, impressive cheese, and fresh chopped watches."
				+ "\nNext you have to bake it in a very hot ring. \nWhen it is done, cut into "
				+ "613 parallelograms. \nSome kids like waffles pizza the best, but my favorite is the lasagna pizza."
				+ "\nIf I could, I would eat pizza 12,365,479,936 times a day!", story.getStory(contents));
	}
}
