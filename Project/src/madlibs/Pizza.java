package madlibs;

public class Pizza {
	private static String[]prompts= {
			"an adjective", "a nationality", "the name of a famous person", "a noun",
			"an adjective", "a noun", "an adjective", "an adjective",
			"a plural noun", "a noun", "a number", "a shape in plural form", 
			"a food", "another food", "a number"};
	private String[] userInput= new String[prompts.length];
	
	public Pizza(String[] userInput) {
		this.userInput=userInput;
	}

	public static String[] getPrompts() {
		return prompts;
	}

	public String getStory() {
		return String.format("Pizza was invented by a %s %s chef named %s. \nTo make "
				+ "pizza, you need to take a lump of %s, and make a thin, round "
				+ "%s %s. \nThen you cover it with %s sauce, %s cheese, and fresh chopped %s."
				+ "\nNext you have to bake it in a very hot %s. \nWhen it is done, cut into "
				+ "%s %s. \nSome kids like %s pizza the best, but my favorite is the %s pizza."
				+ "\nIf I could, I would eat pizza %s times a day!", userInput[0], userInput[1], userInput[2], userInput[3],
				userInput[4], userInput[5], userInput[6], userInput[7], userInput[8],
				userInput[9],userInput[10], userInput[11], userInput[12], userInput[13],
				userInput[14]);
	}

}
