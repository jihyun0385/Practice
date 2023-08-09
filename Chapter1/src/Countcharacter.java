
public class Countcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String example = "20230810 자고싶다 정말 abcdef ";

		// 단순 총 개수 세기 
		int count = example.length();
		System.out.println(count);
		
		int text, loweng, upeng =0;
		
		// 숫자 0-9제외하고는 다 공백만들어서 카운트 
			String num = example.replaceAll("[^0-9]","");
            System.out.println(num.length());
		}
	
	
	}


