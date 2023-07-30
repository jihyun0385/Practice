import java.util.*;

public class BackwardEng {

	public static void main(String[] args) {
		Stack<Character> Englishword = new Stack();

		String exampleword = "abcdefg";

		for (int i = 0; i < exampleword.length(); i++) {
			char c = exampleword.charAt(i);
			Englishword.push(c);
		}
		while (!Englishword.isEmpty()) {
			Character result = Englishword.pop();
			System.out.println(result);
		}

	}
}