package madLibs;

public class LetterFromCamp extends Story {
	static String[] prompts= {
			"a plural noun", "a plural noun", "full name of a person in room", "an adjective",
			"a noun", "an adjective", "a verb", "a noun","a plural noun", "a noun",
			 "a plural noun", "a noun","a plural noun", "a noun", "an adjective",
			"a plural noun", "an body part", "a noun", "name of a person in room"};
	public String getStory(String[]userInput) {
		return String.format("Dear Folks,\nCamp is great! I like all the %s in my tent.I have become close as\n"+
							 "two %s in a pod with %s, who has %s personality and is never without \n"+
							 "%s. He/she tells really %s stories which make all of us %s out loud. I have\n"+
							 "to stop writing now. I know I promised a long %s, but this morning I washed my\n"+
							 "shirts and %s and put them out to dry on the clothes %s and it looks likes it's\n"+
							 "getting ready to rain cats and %s. I better get off my %s and get my %s off the\n"+
							 "%s line before I run out of %s clothes. I promise to write a letter chock full of\n"+
							 "%s before my %s hits the pillow tonight...or tommorrow...or maybe I'll write Tuesday.\n"+
							 "Your loving %s,\n%s", 
							 userInput[0], userInput[1], userInput[2], testForVowel(userInput[3]),
							 testForVowel(userInput[4]), userInput[5], userInput[6], userInput[7],
							 userInput[8], userInput[9],userInput[10], userInput[11],
							 userInput[12], userInput[13], userInput[14], userInput[15],
							 userInput[16], userInput[17], userInput[18]);
	}


}
