package madLibs;

public class Pizza extends Story {
	@Override
	public String[] getPrompts() {
		String[]prompts= {
				"an adjective", "a nationality", "the name of a famous person", "a noun",
				"an adjective", "a noun", "an adjective", "an adjective",
				"a plural noun", "a noun", "a number", "a shape in plural form", 
				"a food", "another food", "a number"};
		return prompts;
	}
	@Override
	public String getFormat() {
		return "Pizza was invented by "
				+ "a"
				+ " %s %s chef named %s. \nTo make "
				+ "pizza, you need to take a lump of %s, and make a thin, round "
				+ "%s %s. \nThen you cover it with %s sauce, %s cheese, and fresh chopped %s."
				+ "\nNext you have to bake it in a very hot %s. \nWhen it is done, cut into "
				+ "%s %s. \nSome kids like %s pizza the best, but my favorite is the %s pizza."
				+ "\nIf I could, I would eat pizza %s times a day!";
	}

}
