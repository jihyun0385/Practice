
// 배달 선주문 한 사람 선 배달 하는 서비스 
import java.util.*;

// 사람 저장할 Person class 및 변수 생성 
class Person {
	String name;
	String address;
	int ordersq;
	int nextordersq = 1;

// 메소드 생성 
	public Person(String name, String address, int ordersq) {
		this.ordersq = nextordersq++;
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getOrderseq() {
		return ordersq;
	}

}

public class DeliveryService {

	public static void main(String[] args) {
		// 주문 받기
		Queue<Person> orderQueue = new LinkedList();

		Scanner order = new Scanner(System.in);
		System.out.println("주문자의 이름를 입력하세요");
		String name = order.nextLine();

		System.out.println("주문자의 주소를 입력하세요");
		String address = order.nextLine();

		int ordersq = 0;
		// 큐에 저장하기
		Person person = new Person(name, address, ordersq);
		orderQueue.offer(person);

		System.out.println(name + "님의 대기순서는" + person.getOrderseq() + "입니다.");

	}
}
