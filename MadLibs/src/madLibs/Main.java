package madLibs;

import java.util.Scanner;

public class Main {
	
public static void main(String[]args) {
	Scanner kb= new Scanner(System.in);
	System.out.println("Welcome to MadLibs!");
	int storyChoice = 0;
	while(storyChoice!=7) {
		System.out.println("1 for Road Trip, 2 for Uncle Dudley's Farm, 3 for Pizza Recipe, 4 for Amusement Parks,\n"+
							"5 for Driver's Checklist, 6 for Letter From Camp, 7 to Exit");
		storyChoice= kb.nextInt();
		kb.nextLine();
		switch(storyChoice) {
			case 1:
				String[] userInputsRoadTrip= storySetup(kb, RoadTrip.getPrompts());
				RoadTrip vacayStory= new RoadTrip(userInputsRoadTrip);
				System.out.println(vacayStory.getStory());
				break;
			case 2:
				String[] userInputsFarm=storySetup(kb, FarmStory.getPrompts());
				FarmStory farmStory= new FarmStory(userInputsFarm);
				System.out.println(farmStory.getStory());
				break;
			case 3:
				String [] userInputsPizza=storySetup(kb, Pizza.getPrompts());
				Pizza pizza= new Pizza(userInputsPizza);
				System.out.println(pizza.getStory());
				break;
			case 4:
				String [] userInputsAmusementParks=storySetup(kb, AmusementPark.getPrompts());
				AmusementPark ap= new AmusementPark(userInputsAmusementParks);
				System.out.println(ap.getStory());
				break;
			case 5:
				String [] userInputsDriversChecklist=storySetup(kb, DriversChecklist.getPrompts());
				DriversChecklist check= new DriversChecklist(userInputsDriversChecklist);
				System.out.println(check.getStory());
				break;
			case 6:
				String [] userInputsLetterFromCamp=storySetup(kb, LetterFromCamp.getPrompts());
				LetterFromCamp letter= new LetterFromCamp(userInputsLetterFromCamp);
				System.out.println(letter.getStory());
				break;
			case 7:
				System.out.println("Thank you for playing! MadLibs is exiting.");
				System.exit(0);
			default:
				System.out.println("Error. Invalid Selection");
		}
		System.out.println();
	}
}

private static String[] storySetup(Scanner kb, String[]prompts) {
	String[] userInput= new String[prompts.length];
	for(int x=0; x<prompts.length; x++) {
		System.out.println("Enter "+prompts[x]+": ");
		userInput[x]=kb.nextLine();
	}
	return userInput;
}
}
