import java.util.Stack;

public class flipword3 {

	public static void main(String[] args) {
		// 단순 뒤집기
		String exword = "abcdefg 안녕하세요.";

		StringBuilder sb = new StringBuilder(exword);
		String reversedStr = sb.reverse().toString();

		System.out.println(reversedStr);

		// stack사용

		String word = "abcdefg 안녕하세요.";

		Stack flipword = new Stack();
		for (int a = 0; a < word.length(); a++) {
			char inputword = word.charAt(a);
			flipword.push(inputword);
		}
		while (!flipword.isEmpty()) {
			System.out.print(flipword.pop());

		}
	}
}
