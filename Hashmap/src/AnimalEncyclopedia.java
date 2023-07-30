import java.util.*;

public class AnimalEncyclopedia {

	public static void main(String[] args) {
		Scanner inputenglish = new Scanner(System.in);
		HashMap<String, String> Englishvocabulary = new HashMap<>();

		Englishvocabulary.put("dog", "개");
		Englishvocabulary.put("cat", "고양이");
		Englishvocabulary.put("elephant", "코끼리");
		Englishvocabulary.put("tiger", "호랑이");
		Englishvocabulary.put("lion", "사자");
		Englishvocabulary.put("giraffe", "기린");
		Englishvocabulary.put("zebra", "얼룩말");

		while (true) {
			System.out.println("수행하고자 하는 작업을 선택하세요. (단어등록, 영단어검색, 단어수정,종료)");
			String input = inputenglish.nextLine();

			if (input.equals("단어등록")) {
				System.out.println("영어단어를 입력하세요");
				String inputEnglish = inputenglish.nextLine();
				System.out.println("단어 뜻을 입력하세요");
				String inputTrans = inputenglish.nextLine();

				Englishvocabulary.put(inputEnglish, inputTrans);
				System.out.println("등록이 완료되었습니다.");
			}

			else if (input.equals("영단어검색")) {
				System.out.println("검색하고자 하는 영어단어를 입력하세요.");
				String searchEnglish = inputenglish.nextLine();
				String gettrans = Englishvocabulary.get(searchEnglish);

				if (gettrans != null) {
					System.out.println("검색하신 단어의 뜻은 " + gettrans + "입니다");
				} else {
					System.out.println("해당 단어가 사전에 등록되어 있지 않습니다.");
				}

			} else if (input.equals("단어뜻수정")) {
				System.out.println("수정하고자 하는 영어단어를 입력하세요.");
				String modifEnglish = inputenglish.nextLine();
				String getTrans = Englishvocabulary.get(modifEnglish);

				System.out.println("수정하고자 하는 뜻을 입력하세요");
				String modifyTrans = inputenglish.nextLine();
				Englishvocabulary.put(modifEnglish, modifyTrans);

				System.out.println(modifEnglish + "의 단어 의미가 " + modifyTrans + "로 수정되었습니다.");

			} else if (input.equals("종료")) {
				break;
			}
		}
	}

}
