package madLibs;

public class FarmStory extends Story {
	@Override
	public String[] getPrompts() {
		String[] prompts = { "a noun", "a noun", "an adjective", "a verb ending in S", "a noun", "an adjective",
				"a plural noun", "a plural noun", "a plural noun", "a verb", "a body part", "a verb ending in ING",
				"a noun", "an adjective", "a noun", "an adjective", "a noun" };
		return prompts;
	}

	@Override
	public String getFormat() {
		return "My Dad says Uncle Dudley's favorite expression is 'The early %s"
				+ " catches the %s,' and boy is Dad right. "
				+ "\nWhen we stay at Uncle Dudley's %s farm, he drags us out of bed even before "
				+ "the rooster %s or the %s comes up. \nAnd right after we eat a %s breakfast, "
				+ "we have to milk the cows, feed the %s, and groom the %s. \nOnly when "
				+ "we've finished our %s can we go out and play hid and %s, go bare %s riding "
				+ "on the horses, or even %s in the old %s. \nDad thinks Uncle Dudley is a "
				+ "%s %s, but to the tell the %s truth, I love spending time on his %s.";
	}
}
