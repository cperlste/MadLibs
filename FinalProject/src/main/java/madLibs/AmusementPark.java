package madLibs;

public class AmusementPark {
	static String[] prompts= {
			"a noun", "an article of clothing", "an adjective", "an adjective",
			"a noun", "a plural noun", "a noun",
			"a food", "a liquid", "a body part", "a noun", 
			"a plural noun", "an animal", "a noun"};
	private String[] userInput= new String[prompts.length];
	
	public String [] getPrompts() {
		return prompts;
	}
	public String[] getUserInput() {
		return this.userInput;
	}
	public String getStory(String [] userInput) {
		return String.format("An amusement park is fun to visit on a hot summer %s.\nWhen you get there, you can wear your %s and go for a swim. "
				+ "\nAnd there are lots of %s things to eat. \nYou can start off with a/an %s-dog on a"
				+ "%s with mustard, relish, and %s on it. \nThen you can have a buttered ear of %s"
				+ " with a nice slice of %s and a big bottle of cold %s. \nWhen you are full, "
				+ "it's time to go on the roller coaster, which should settle your %s. "
				+ "\nOther amusement park rides are the bumper cars, which have a little %s that you"
				+ " drive and run into other %s, \nand the merry-go-round, where you can sit on a big"
				+ " %s \nand try to grab the gold %s as you ride past it. Enjoy your day!", 
				userInput[0], userInput[1], userInput[2], userInput[3],
				userInput[4], userInput[5], userInput[6], userInput[7],
				userInput[8], userInput[9],userInput[10], userInput[11],
				userInput[12], userInput[13]);
	}
}
