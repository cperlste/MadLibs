package madLibs;

public interface Prompter {
	//one method for prompting an int
	int promptInt(String message);
	String promptString(String message);
	//one method for println
	void println(String msg);
}
