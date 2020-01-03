package madLibs;

import java.util.Scanner;

public class PrompterImpl implements Prompter {
	private final Scanner scanner = new Scanner(System.in);

	@Override
	public void println(String msg) {
		System.out.println(msg);
	}

	@Override
	public int promptInt(String message) {
		System.out.println(message);
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}

	@Override
	public String promptString(String message) {
		System.out.println(message);
		return scanner.nextLine();
	}

}
