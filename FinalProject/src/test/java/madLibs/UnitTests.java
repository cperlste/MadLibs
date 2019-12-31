package madLibs;

import static org.junit.Assert.*;

import org.junit.*;

public class UnitTests {

	@Test
	public void roadTripStoryCorrect() {
		String[]content= {"funny", "Zimbabwe", "long", "purple",
				"teeth", "hairs", "coat", "scratch",
				"cord", "started", "ran", "sweaters",
				"earring", "waiting", "word", "400 thousand",
				"enormous", "jump", "spit", "stale",
				"person"};
		RoadTrip story= new RoadTrip(content);
		assertEquals("On the funny trip to Zimbabwe, my  long friend and I decided to invent a game."
				+ " \nSince this would be a rather  purple trip,"
				+ " it would need to be a game with  teeth and  hairs."
				+ " \nUsing our  coat to  scratch, "
				+ "we tried to get the  cord next to us to play too, "
				+ "but they just  started at us and  ran away. "
				+ "\nAfter a few rounds, we thought the game could use some  sweaters, "
				+ "\nso we turned on the  earring and started  waiting to the  word that came on. "
				+ "\nThis lasted for 400 thousand hours before I got enormous and decided to "
				+ " jump. \nI'll never  spit that trip; "
				+ "it was the stale road trip of my  person.", story.getStory());
	}
	
	@Test 
	public void amusementParkStoryCorrect() {
		String[] contents= {
				"water", "skirt", "funny", "intelligent",
				"mouse", "spies", "button",
				"donut", "pea soup", "toe", "computer", 
				"teeth", "lion", "google"};
		AmusementPark story= new AmusementPark(contents);
		assertEquals("An amusement park is fun to visit on a hot summer water."
				+ "\nWhen you get there, you can wear your skirt and go for a swim. "
				+ "\nAnd there are lots of funny things to eat. "
				+ "\nYou can start off with a/an intelligent-dog on a"
				+ "mouse with mustard, relish, and spies on it. \nThen you can have a buttered ear of button"
				+ " with a nice slice of donut and a big bottle of cold pea soup. "
				+ "\nWhen you are full, "
				+ "it's time to go on the roller coaster, which should settle your toe. "
				+ "\nOther amusement park rides are the bumper cars, which have a little computer that you"
				+ " drive and run into other teeth, \nand the merry-go-round, where you can sit on a big"
				+ " lion \nand try to grab the gold google as you ride past it. Enjoy your day!", story.getStory());
	}
	
	@Test 
	public void driversChecklistCorrect() {
		String[]contents= {"fat", "brown", "cholent", "wooly",
				"bottles", "mouse", "lips", "brilliantly",
				"hair", "juice", "car", "gasoline",
				"keypads", "case", "54 billion"};
		DriversChecklist story = new DriversChecklist();
		assertEquals("Before you follow the open road to a/an fat adventure, Dont forget to:\n"+ 
				"1. Have a/an brown mechanic give your cholent a/an wooly tune-up.\n" + 
				"2. Make sure there is sufficient air in all four bottles as well as in your spare mouse.\n" + 
				"3. Make sure your windshield lips are fuctioning brilliantly.\n" + 
				"4. Be sure to have a flash hair, some bottled juice, and an emergency car kit in your glove gasoline.\n" + 
				"5. For your safety and the safety of other keypads, don't even think about getting behind the case\n" + 
				"   of the car without getting a good night's sleep of at least 54 billion hours.", story.getStory(contents));
	}
	
	@Test
	public void FarmStoryCorrect() {
		String[] contents= {
				"song", "phone", "silly", "burps", 
				"car", "wet", "stop signs", "plants", 
				"weights","twist", "nostril", "reading", 
				"cord", "painful", "bench", "blank", 
				"screen"
				};
		FarmStory story= new FarmStory(contents);
		assertEquals("My Dad says Uncle Dudley's favorite expression is 'The early song"
				+ " catches the phone,' and boy is Dad right. "
				+ "\nWhen we stay at Uncle Dudley's silly farm, he drags us out of bed even before "
				+ "the rooster burps or the car comes up. \nAnd right after we eat a wet breakfast, "
				+ "we have to milk the cows, feed the stop signs, and groom the plants. \nOnly when "
				+ "we've finished our weights can we go out and play hid and twist, go bare nostril riding "
				+ "on the horses, or even reading in the old cord. \nDad thinks Uncle Dudley is a "
				+ "painful bench, but to the tell the blank truth, I love spending time on his screen.", story.getStory());
	}
	@Test
	public void PizzaRecipeCorrect() {
		String[]contents= {"ridiculous", "Nigerian", "Donald Trump", "house",
				"big", "window", "truck", "impressive",
				"watches", "ring", "613", "parallelograms", 
				"waffles", "lasagna", "12,365,479,936"};
		Pizza story = new Pizza(contents);
		assertEquals("Pizza was invented by a ridiculous Nigerian chef named Donald Trump. \nTo make "
				+ "pizza, you need to take a lump of house, and make a thin, round "
				+ "big window. \nThen you cover it with truck sauce, impressive cheese, and fresh chopped watches."
				+ "\nNext you have to bake it in a very hot ring. \nWhen it is done, cut into "
				+ "613 parallelograms. \nSome kids like waffles pizza the best, but my favorite is the lasagna pizza."
				+ "\nIf I could, I would eat pizza 12,365,479,936 times a day!", story.getStory());
	}

	@Test
	public void LetterFromCampCorrect() {
		String contents[]= {"instruments", "blankets", "Batsheva Tanenbaum", "nice",
				"guitar", "purple", "run", "roof","barbeques", "keyboard",
				 "lawns", "basketball","pools", "chicken", "lonely",
				"trees", "elbow", "game", "Mindy"};
		LetterFromCamp story= new LetterFromCamp(contents);
		assertEquals("Dear Folks,\nCamp is great! I like all the instruments in my tent.I have become close as\n"+
				 "two blankets in a pod with Batsheva Tanenbaum, who has a/an nice personality and is never without a\n"+
				 "guitar. He/she tells really purple stories which make all of us run out loud. I have\n"+
				 "to stop writing now. I know I promised a long roof, but this morning I washed my\n"+
				 "shirts and barbeques and put them out to dry on the clothes keyboard and it looks likes it's\n"+
				 "getting ready to rain cats and lawns. I better get off my basketball and get my pools off the\n"+
				 "chicken line before I run out of lonely clothes. I promise to write a letter chock full of\n"+
				 "trees before my elbow hits the pillow tonight...or tommorrow...or maybe I'll write Tuesday.\n"+
				 "Your loving game,\nMindy", story.getStory());
	}
	
}
