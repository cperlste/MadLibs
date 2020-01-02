package madLibs;

import java.util.Scanner;

public class Main {
	
public static void main(String[]args) {
	Scanner kb= new Scanner(System.in);
	System.out.println("Welcome to MadLibs!");
	int storyChoice = 0;
	while(storyChoice!=7) {
		storyChoice = getStoryChoice(kb);
		getStoryFromChoice(kb, storyChoice);
		System.out.println("1 for Road Trip, \n2 for Uncle Dudley's Farm, \n3 for Pizza Recipe, \n4 for Amusement Parks,\n"+
							"\n5 for Driver's Checklist, \n6 for Letter From Camp, 7 to Exit");
		storyChoice= kb.nextInt();
		kb.nextLine();
		switch(storyChoice) {
			case 1:
				String[] userInputsRoadTrip= storySetup(kb, RoadTrip.prompts);
				RoadTrip vacayStory= new RoadTrip();
				System.out.println(vacayStory.getStory(userInputsRoadTrip));
				break;
			case 2:
				String[] userInputsFarm=storySetup(kb, FarmStory.prompts);
				FarmStory farmStory= new FarmStory();
				System.out.println(farmStory.getStory(userInputsFarm));
				break;
			case 3:
				String [] userInputsPizza=storySetup(kb, Pizza.prompts);
				Pizza pizza= new Pizza();
				System.out.println(pizza.getStory(userInputsPizza));
				break;
			case 4:
				String [] userInputsAmusementParks=storySetup(kb, AmusementPark.prompts);
				AmusementPark ap= new AmusementPark();
				System.out.println(ap.getStory(userInputsAmusementParks));
				break;
			case 5:
				String [] userInputsDriversChecklist=storySetup(kb, DriversChecklist.prompts);
				DriversChecklist check= new DriversChecklist();
				System.out.println(check.getStory(userInputsDriversChecklist));
				break;
			case 6:
				String [] userInputsLetterFromCamp=storySetup(kb, LetterFromCamp.prompts);
				LetterFromCamp letter= new LetterFromCamp();
				System.out.println(letter.getStory(userInputsLetterFromCamp));
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

private static void getStoryFromChoice(Scanner kb, int storyChoice) {
	switch(storyChoice) {
		case 1:
			String[] userInputsRoadTrip= storySetup(kb, RoadTrip.prompts);
			RoadTrip vacayStory= new RoadTrip();
			System.out.println(vacayStory.getStory(userInputsRoadTrip));
			break;
		case 2:
			String[] userInputsFarm=storySetup(kb, FarmStory.prompts);
			FarmStory farmStory= new FarmStory();
			System.out.println(farmStory.getStory(userInputsFarm));
			break;
		case 3:
			String [] userInputsPizza=storySetup(kb, Pizza.prompts);
			Pizza pizza= new Pizza();
			System.out.println(pizza.getStory(userInputsPizza));
			break;
		case 4:
			String [] userInputsAmusementParks=storySetup(kb, AmusementPark.prompts);
			AmusementPark ap= new AmusementPark();
			System.out.println(ap.getStory(userInputsAmusementParks));
			break;
		case 5:
			String [] userInputsDriversChecklist=storySetup(kb, DriversChecklist.prompts);
			DriversChecklist check= new DriversChecklist();
			System.out.println(check.getStory(userInputsDriversChecklist));
			break;
		case 6:
			String [] userInputsLetterFromCamp=storySetup(kb, LetterFromCamp.prompts);
			LetterFromCamp letter= new LetterFromCamp();
			System.out.println(letter.getStory(userInputsLetterFromCamp));
			break;
		case 7:
			System.out.println("Thank you for playing! MadLibs is exiting.");
		default:
			System.out.println("Error. Invalid Selection");
	}
}

private static int getStoryChoice(Scanner kb) {
	int storyChoice;
	System.out.println("1 for Road Trip \n2 for Uncle Dudley's Farm \n3 for Pizza Recipe \n4 for Amusement Parks,\n"+
						"5 for Driver's Checklist \n6 for Letter From Camp \n7 to Exit");
	storyChoice= kb.nextInt();
	kb.nextLine();
	return storyChoice;
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
