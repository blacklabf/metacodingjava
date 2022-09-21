package ch05;

//only 요리사
class 요리사{
	String name = "요리사";
}

//홍길동 or 요리사
class 홍길동 extends 요리사{
	String name = "홍길동";
}
public class OOPEx03 {

	public static void main(String[] args) {
		홍길동 h1 = new  홍길동(); // (홍길동, 요리사) heap에 둘 다 떴는데 홍길동을 가리킴
		System.out.println(h1.name);
		
		요리사 y1 = new 홍길동(); // (홍길동, 요리사) heap에 둘 다 떴는데 요리사를 가리킴
		System.out.println(y1.name); 
		// new 홍길동(); 하면 다형성이기 때문에 홍길동도 가능하고 요리사도 가능함.
		
		// 홍길동 h2 = new 요리사(); // 이건 불가능함  - new 요리사() 하면 요리사만 떠서 홍길동으로 바라볼 수 없음.
	}

}
