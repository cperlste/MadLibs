package madLibs;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		Prompter prompter= new PrompterImpl();
		Menu menu= new Menu(prompter);
		menu.showMenu();
	}
}
