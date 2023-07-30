
import java.util.*;
public class StackCalculate0730 {
	public static void main(String[] args) {
		String example = "5-3+(2+3*6)";

		// 숫자 저장하는 Number
		Stack<Integer> numbers = new Stack<>();
		// 연산 저장하는 Operate
		Stack<Character> operators = new Stack<>();

		// 반복문 읽기 .
		for (int i = 0; i < example.length(); i++) {
			char c = example.charAt(i);

			// 숫자로 변환
			if (!(c == '+') && !(c == '-') && !(c == '/') && !(c == '-') && !(c == '(') && !(c == ')')) {
				int num = Character.getNumericValue(c);

				// 여는 괄호 만나면 숫자 연산자 스택에 넣고 계산해서 다시 넣기)
				if (c == '(') {
					numbers.push(num);
					operators.push(c); // 연산자 넣기

					// 계산해서 결과값 다시 넣기
					while (!operators.isEmpty()) {
						// - + 들어갔ㄱ고 3 5 들어갔음 +는 다시 넣고3+5 계산
						char lastoper = operators.pop();
						char operator = operators.pop();
						int num2 = numbers.pop();
						int num1 = numbers.pop();
						int result = evaluate(operator, num1, num2);
						System.out.println(result);
						// 결과값 다시 숫자 스택에 넣기
						numbers.push(result);
						operators.push(lastoper);
					}
					// 닫는 괄호를 만나면 또 넣고 계산
					 if (c == ')') {
						// 2,3,6 들어가고+*
						numbers.push(num);
						operators.push(c); // 연산자 넣기
						while (!operators.isEmpty()) {
							char operator = operators.pop();
							int num2 = numbers.pop();
							int num1 = numbers.pop();
							int result = evaluate(operator, num1, num2);
							numbers.push(result);
						}
						// 2 18 +
						while (!operators.isEmpty()) {
							char operator = operators.pop();
							int num2 = numbers.pop();
							int num1 = numbers.pop();
							int result = evaluate(operator, num1, num2);
							numbers.push(result);

							// 20 나오고
						}
						System.out.println(numbers);
						while (!operators.isEmpty()) {
							char operator = operators.pop();
							int num2 = numbers.pop();
							int num1 = numbers.pop();
							int result = evaluate(operator, num1, num2);
							numbers.push(result);

						}
					}
				}
			}
		}
	}

	private static int evaluate(char operator, int num1, int num2) {
		switch (operator) {
		case '+':
			return (num1 + num2);
		case '-':
			return (num1 - num2);
		case '/':
			return (num1 / num2);
		case '*':
			return (num1 * num2);
		}
		return (0);

	}
}

