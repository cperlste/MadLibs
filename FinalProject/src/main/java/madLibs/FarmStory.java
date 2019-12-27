package madLibs;

public class FarmStory {
	private static String[] prompts= {
			"a noun", "a noun", "an adjective", "a verb ending in S", 
			"a noun", "an adjective", "a plural noun", "a plural noun", 
			"a plural noun","a verb", "a body part", "a verb ending in ING", 
			"a noun", "an adjective", "a noun", "an adjective", 
			"a noun"
			};
	private String[] userInput= new String[prompts.length];
	
	public FarmStory(String[] userInput) {
		this.userInput=userInput;
	}

	public String getStory() {
		return String.format("My Dad says Uncle Dudley's favorite expression is 'The Early %s"
				+ " catches the %s,' and boy is Dad right. "
				+ "\nWhen we stay at Uncle Dudley's %s farm, he drags us out of bed even before "
				+ "the rooster %s or the %s comes up. \nAnd right after we eat a %s breakfast, "
				+ "we have to milk the cows, feed the %s, and groom the %s. \nOnly when "
				+ "we've finished our %s can we go out and play hid and %s, go bare %s riding "
				+ "on the horses, or even %s in the old %s. \nDad thinks Uncle Dudley is a "
				+ "%s %s, but to the tell the %s truth, I love spending time on his %s.", userInput[0], userInput[1], userInput[2], userInput[3],
				userInput[4], userInput[5], userInput[6], userInput[7], userInput[8],
				userInput[9],userInput[10], userInput[11], userInput[12], userInput[13],
				userInput[14], userInput[15], userInput[16]);
	}

	public static String[] getPrompts() {
		return prompts;
	}
	public String[] getUserInput() {
		return this.userInput;
	}

}
