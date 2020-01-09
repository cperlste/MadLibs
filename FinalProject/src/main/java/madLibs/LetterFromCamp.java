package madLibs;

public class LetterFromCamp extends Story {
	@Override
	public String[] getPrompts() {
		String[] prompts = { "a plural noun", "a plural noun", "full name of a person in room", "an adjective",
				"a noun", "an adjective", "a verb", "a noun", "a plural noun", "a noun", "a plural noun", "a noun",
				"a plural noun", "a noun", "an adjective", "a plural noun", "an body part", "a noun",
				"name of a person in room" };
		return prompts;
	}

	@Override
	public String getFormat() {
		return "Dear Folks,\nCamp is great! I like all the %s in my tent.I have become close as\n"
				+ "two %s in a pod with %s, who has a %s personality and is never without \n"
				+ "a %s. He/she tells really %s stories which make all of us %s out loud. I have\n"
				+ "to stop writing now. I know I promised a long %s, but this morning I washed my\n"
				+ "shirts and %s and put them out to dry on the clothes %s and it looks likes it's\n"
				+ "getting ready to rain cats and %s. I better get off my %s and get my %s off the\n"
				+ "%s line before I run out of %s clothes. I promise to write a letter chock full of\n"
				+ "%s before my %s hits the pillow tonight...or tommorrow...or maybe I'll write Tuesday.\n"
				+ "Your loving %s,\n%s";
	}

}
