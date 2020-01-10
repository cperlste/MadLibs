package madLibs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class MainTest {
	@Test
	public void testGetChoice() {
		Prompter prompter= Mockito.mock(Prompter.class);
		Mockito.when(prompter.promptInt(Mockito.anyString())).thenReturn(1, 7);
		Menu menu= new Menu(prompter);
		int storyChoice= menu.getStoryChoice();
		assertEquals(1, storyChoice);
	}
	
	@Test 
	public void testStorySetup() {
		String [] prompts = {"noun", "verb", "adjective", "plural noun", "adverb"};
		Prompter prompter=Mockito.mock(Prompter.class);
		Mockito.when(prompter.promptString("noun")).thenReturn("person");
		Mockito.when(prompter.promptString("verb")).thenReturn("stop");
		Mockito.when(prompter.promptString("adjective")).thenReturn("silly");
		Mockito.when(prompter.promptString("plural noun")).thenReturn("files");
		Mockito.when(prompter.promptString("adverb")).thenReturn("lazily");
		Menu menu= new Menu(prompter);
		String [] userInput = menu.storySetup(prompts);
		assertArrayEquals(prompts, userInput);
	}
}

