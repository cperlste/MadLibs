package madLibs;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private final Prompter prompter;

	public Menu(Prompter prompter) {
		this.prompter = prompter;
	}

	public void showMenu() {
		System.out.println("Welcome to MadLibs!");
		ArrayList<Story> stories = new ArrayList<Story>();
		stories.add(new RoadTrip());
		stories.add(new FarmStory());
		stories.add(new Pizza());
		stories.add(new AmusementPark());
		stories.add(new DriversChecklist());
		stories.add(new LetterFromCamp());

		 int storyChoice;
		 while ((storyChoice = getStoryChoice()) != 7){
			printStoryFromChoice(stories, storyChoice);
		}
	}

	void printStoryFromChoice(ArrayList<Story> stories, int storyChoice) {
		Story currStory = stories.get(storyChoice-1);
		String[] userInputs = storySetup(currStory.getPrompts());
		prompter.println(currStory.getStory(userInputs));
	}

	int getStoryChoice() {
		int storyChoice;
		storyChoice = prompter.promptInt("1 for Road Trip \n2 for Uncle Dudley's Farm \n3 for Pizza Recipe \n4 for Amusement Parks,\n"
						+ "5 for Driver's Checklist \n6 for Letter From Camp \n7 to Exit");
		return storyChoice;
	}

	String[] storySetup(String[] prompts) {
		
		return prompter.promptStringArray(prompts);
	}
}
