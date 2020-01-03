package madLibs;

import java.util.Scanner;

public class Menu {
	private final Prompter prompter;
	public Menu(Prompter prompter) {
		this.prompter=prompter;
	}
	public void showMenu() {
		Scanner kb= new Scanner(System.in);
		System.out.println("Welcome to MadLibs!");
		int storyChoice = getStoryChoice();
		getStoryFromChoice(kb, storyChoice);
			System.out.println("1 for Road Trip, \n2 for Uncle Dudley's Farm, \n3 for Pizza Recipe, \n4 for Amusement Parks,\n"+
								"\n5 for Driver's Checklist, \n6 for Letter From Camp, 7 to Exit");
		
			System.out.println();
		}
	void getStoryFromChoice(Scanner kb, int storyChoice) {
		switch(storyChoice) {
			case 1:
				String[] userInputsRoadTrip= storySetup(RoadTrip.prompts);
				RoadTrip vacayStory= new RoadTrip();
				prompter.println(vacayStory.getStory(userInputsRoadTrip));
				break;
			case 2:
				String[] userInputsFarm=storySetup(FarmStory.prompts);
				FarmStory farmStory= new FarmStory();
				prompter.println(farmStory.getStory(userInputsFarm));
				break;
			case 3:
				String [] userInputsPizza=storySetup(Pizza.prompts);
				Pizza pizza= new Pizza();
				prompter.println(pizza.getStory(userInputsPizza));
				break;
			case 4:
				String [] userInputsAmusementParks=storySetup(AmusementPark.prompts);
				AmusementPark ap= new AmusementPark();
				prompter.println(ap.getStory(userInputsAmusementParks));
				break;
			case 5:
				String [] userInputsDriversChecklist=storySetup(DriversChecklist.prompts);
				DriversChecklist check= new DriversChecklist();
				prompter.println(check.getStory(userInputsDriversChecklist));
				break;
			case 6:
				String [] userInputsLetterFromCamp=storySetup(LetterFromCamp.prompts);
				LetterFromCamp letter= new LetterFromCamp();
				prompter.println(letter.getStory(userInputsLetterFromCamp));
				break;
			case 7:
				prompter.println("Thank you for playing! MadLibs is exiting.");
			default:
				prompter.println("Error. Invalid Selection");
		}
	}

	int getStoryChoice() {
		int storyChoice;
		storyChoice= prompter.promptInt("1 for Road Trip \n2 for Uncle Dudley's Farm \n3 for Pizza Recipe \n4 for Amusement Parks,\n"+
							"5 for Driver's Checklist \n6 for Letter From Camp \n7 to Exit");
		return storyChoice;
	}

	 String[] storySetup(String[]prompts) {
		String[] userInput= new String[prompts.length];
		for(int x=0; x<prompts.length; x++) {
			userInput[x]=prompter.promptString("Enter "+prompts[x]+": ");
		}
		return userInput;
	}
}
