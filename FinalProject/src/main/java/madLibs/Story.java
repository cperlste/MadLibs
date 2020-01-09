package madLibs;

public abstract class Story {
	public abstract String[] getPrompts();
	public abstract String getFormat();
	public String getStory(String[] userInput) {
		return String.format(getFormat(), (Object []) userInput);
	}
	/*
	public String testForVowel(String string) {
		if (string.toUpperCase().charAt(0)== 'A'
				||string.toUpperCase().charAt(0)== 'E'
				||string.toUpperCase().charAt(0)== 'I'
				||string.toUpperCase().charAt(0)== 'O'
				||string.toUpperCase().charAt(0)== 'U') {
			return ("an "+string);
		}
		return "a "+string;
	}
	*/
}
