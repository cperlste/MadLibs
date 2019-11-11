package madLibs;

public class VacationStory {
	private String adj1, place, adj2, adj3, pluralNoun1, 
	pluralNoun2, noun1, verb1,actionVerb1,
	pluralNoun3, noun2,verbING1, 
	noun3, noun4, time, adj4, 
	actionVerb2, verb2, adj5, noun5;
	public VacationStory(String adjectives[], String nouns[], String verbs[]) {
		this.adj1=adjectives[0];
		this.adj2=adjectives[1];
		this.adj3=adjectives[2];
		this.adj4=adjectives[3];
		this.adj5=adjectives[4];
		
		this.place=nouns[0];
		this.pluralNoun1=nouns[1];
		this.pluralNoun2=nouns[2];
		this.noun1=nouns[3];
		this.pluralNoun3=nouns[4];
		this.noun2=nouns[5];
		this.noun3=nouns[6];
		this.noun4=nouns[7];
		this.time=nouns[8];
		this.noun5=nouns[9];
		
		this.verb1=verbs[0];
		this.actionVerb1=verbs[1];
		this.verbING1=verbs[2];
		this.actionVerb2=verbs[3];
		this.verb2=verbs[4];
		
	}
	
	public String getStory() {
		String story= "On the "+adj1+" trip to "+place+", my "+adj2+" friend and I decided to invent a game. "
				+ "\nSince this would be a rather "+adj3+ " trip, it would need to be a game with "+pluralNoun1+" and "+pluralNoun2
				+". \nUsing our "+noun1+" to "+verb1+", we tried to get the "+noun2+" next to us to play too, but they just "+verb2+"ed at us and "+actionVerb1+
				" away. \nAfter a few rounds, we thought the game could use some "+pluralNoun3+" so we turned on the "+noun3+" and started "+verbING1+
				" to the "+ noun4+ " that came on. \nThis lasted for "+time+ " before I got "+adj4+" and decided to "+actionVerb2+". I'll never "+verb2+" that trip;"
						+ " it was the "+adj5+" road trip of my "+noun5+".";
		
		
		
		return story;	
	}
}
