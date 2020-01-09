package madLibs;

public class DriversChecklist extends Story{
	@Override
	public String[] getPrompts() {
		String[] prompts= {
				"an adjective", "an adjective", "a noun", "an adjective",
				"a plural noun", "a noun", "a plural noun", "an adverb",
				"a noun", "a liquid", "a noun", "a noun",
				"a plural noun", "a noun", "a number"};
		return prompts;
	}
	@Override
	public String getFormat() {
		// TODO Auto-generated method stub
		return "Before you follow the open road to a %s adventure, Dont forget to:\n"+
		  "1. Have a %s mechanic give your %s a %s tune-up.\n"+
		  "2. Make sure there is sufficient air in all four %s as well as in your spare %s.\n" +
		  "3. Make sure your windshield %s are fuctioning %s.\n"+
		  "4. Be sure to have a flash %s, some bottled %s, and an emergency %s kit in your glove %s.\n"+
		  "5. For your safety and the safety of other %s, don't even think about getting behind the %s\n"+ 
		  "   of the car without getting a good night's sleep of at least %s hours.";
	}
}
