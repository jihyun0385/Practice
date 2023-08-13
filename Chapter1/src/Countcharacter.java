import java.util.*;

public class Countcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String example = "20230810 자고싶다 정말 abcdef ";

		// 공백포함 총 개수 세기
		int resultcount = example.length();
		System.out.println("총 글자수는" + resultcount + " 자리입니다.(공백포함)");

		// 공백제외 총 문자수 세기
		int blank = 0;
		for (int a = 0; a < example.length(); a++) {
			char textpoint = example.charAt(a);
			if (textpoint == ' ') {
				blank++;
			}
		}
		int nospaceresult = example.length() - blank;
		System.out.println("공백 제외한 총 글자수는 " + nospaceresult + " 입니다");

		// 숫자 0-9제외하고는 다 공백만들어서 숫자만 카운트
		String num = example.replaceAll("[^0-9]", "");
		System.out.println("숫자는 " + num.length() + " 자리입니다");

		// 문자만 카운트
		String countchar = example.replaceAll("[^a-zA-Zㄱ-힣]", "");
		System.out.println("문자는 " + countchar.length() + "자리입니다.");
	}
}
