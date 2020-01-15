package madLibs;

public interface Prompter {
	//one method for prompting an int
	int promptInt(String message);
	String promptString(String message);
	String [] promptStringArray(String[] array);
	//one method for println
	void println(String msg);
}
