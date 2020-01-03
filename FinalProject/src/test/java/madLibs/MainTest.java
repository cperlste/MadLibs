package madLibs;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;
import org.mockito.Mockito;

public class MainTest {
	@Test
	public void testGetChoice1() {
		Prompter prompter= Mockito.mock(Prompter.class);
		//if the parameter is a string, answer 1
		//second param means that after entering 1, enter 7 to exit
		Mockito.when(prompter.promptInt(Mockito.anyString())).thenReturn(1, 7);
		Menu menu= new Menu(prompter);
		int storyChoice= menu.getStoryChoice();
		assertEquals(1, storyChoice);
	}
}
