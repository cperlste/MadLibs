package madLibs;

public class RoadTrip extends Story {
	@Override
	public String[] getPrompts() {
		String[] prompts = { "an adjective", "a place", "an adjective", "an adjective", "a plural noun",
				"a plural noun", "a noun", "a verb", "a noun", "a verb ending in ed", "an action verb in past tense",
				"a plural noun", "a noun", "a verb ending in ING", "a noun", "a number", "an adjective",
				"an action verb", "a verb", "an adjective", "a noun" };
		return prompts;
	}

	@Override
	public String getFormat() {
		return "On the %s trip to %s, my  %s friend and I decided to invent a game."
				+ " \nSince this would be a rather  %s trip," + " it would need to be a game with  %s and  %s."
				+ " \nUsing our  %s to  %s, " + "we tried to get the  %s next to us to play too, "
				+ "but they just  %s at us and  %s away. "
				+ "\nAfter a few rounds, we thought the game could use some  %s, "
				+ "\nso we turned on the  %s and started  %s to the  %s that came on. "
				+ "\nThis lasted for %s hours before I got %s and decided to " + " %s. \nI'll never  %s that trip; "
				+ "it was the %s road trip of my  %s.";
	}
}
