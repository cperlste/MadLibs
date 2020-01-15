package madLibs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class MainTest {
	@Test
	public void testGetChoice() {
		Prompter prompter = Mockito.mock(Prompter.class);
		Mockito.when(prompter.promptInt(Mockito.anyString())).thenReturn(1, 7);
		Menu menu = new Menu(prompter);
		int storyChoice = menu.getStoryChoice();
		assertEquals(1, storyChoice);
	}

	@Test
	public void testStorySetup() {
		String[] prompts = { "noun", "verb", "adjective", "plural noun", "adverb" };
		Prompter prompter = Mockito.mock(Prompter.class);
		Menu menu = new Menu(prompter);
		String[] array = { "person", "stop", "silly", "files", "lazily" };
	
		Mockito.when(menu.storySetup(prompts)).thenReturn(array);
		
		
		assertArrayEquals(array,menu.storySetup(prompts));
	}
}
