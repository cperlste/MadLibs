package madLibs;

public class DriversChecklist extends Story{
	static String[] prompts= {
			"an adjective", "an adjective", "a noun", "an adjective",
			"a plural noun", "a noun", "a plural noun", "an adverb",
			"a noun", "a liquid", "a noun", "a noun",
			"a plural noun", "a noun", "a number"};
	public String getStory(String [] userInput) {
		return String.format("Before you follow the open road to %s adventure, Dont forget to:\n"+
							  "1. Have %s mechanic give your %s %s tune-up.\n"+
							  "2. Make sure there is sufficient air in all four %s as well as in your spare %s.\n" +
							  "3. Make sure your windshield %s are fuctioning %s.\n"+
							  "4. Be sure to have a flash %s, some bottled %s, and an emergency %s kit in your glove %s.\n"+
							  "5. For your safety and the safety of other %s, don't even think about getting behind the %s\n"+ 
							  "   of the car without getting a good night's sleep of at least %s hours.", 
							  testForVowel(userInput[0]), testForVowel(userInput[1]), userInput[2], testForVowel(userInput[3]),
							  userInput[4], userInput[5], userInput[6], userInput[7],
							  userInput[8], userInput[9],userInput[10], userInput[11],
							  userInput[12], userInput[13], userInput[14]);
	}
}
