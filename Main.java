package madLibs;

import java.util.Scanner;

public class Main {
	
public static void main(String[]args) {
	Scanner kb= new Scanner(System.in);
	System.out.println("Type 1 for VacationStory");
	int storyChoice= kb.nextInt();
	kb.nextLine();
	switch(storyChoice) {
	case 1:
		String vacayStory= vacayStorySetup(kb);
		System.out.println(vacayStory);
		break;
	default:
		System.out.println("Error. Invalid Selection");
	}
}

private static String vacayStorySetup(Scanner kb) {
	
	String[]adjectives= new String[5];
	for(int x=0; x<adjectives.length; x++) {
		System.out.println("Enter an adjective:");
		adjectives[x]=kb.nextLine();
	}
	
	String[]verbs= new String[5];
	for(int y=0; y<verbs.length; y++) {
		if(y==0 || y==4) {
			System.out.println("Enter a verb: ");
			verbs[y]=kb.nextLine();
		}
		else if(y==1 || y==3) {
			System.out.println("Enter an action verb");
			verbs[y]=kb.nextLine();
		}
		else {
			System.out.println("Enter a verb ending in -ing");
			verbs[y]=kb.nextLine();
		}
	}
	
	String[]nouns= new String[10];
	for(int w=0; w<nouns.length; w++) {
		if (w==0) {
			System.out.println("Enter a place: ");
			nouns[w]=kb.nextLine();
		}
		else if(w==1 || w==2 || w==4) {
			System.out.println("Enter a plural noun: ");
			nouns[w]=kb.nextLine();
		}
		else if(w==3 || w==5 || w== 6 || w==7 || w==9) {
			System.out.println("Enter a noun: ");
			nouns[w]=kb.nextLine();
		}
		else {
			System.out.println("Enter a measurement of time");
			nouns[w]=kb.nextLine();
		}	
	}
	VacationStory vacayStory= new VacationStory(adjectives, nouns, verbs);
	return vacayStory.getStory();
}
}
