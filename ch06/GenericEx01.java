package ch06;

// 경우에 따라 문자열을 담을 때도 있고 숫자를 담을 때도 있다. - object class 이용
class 바구니{
	Object data;
}


public class GenericEx01 {

	public static void main(String[] args) {
		바구니 s1 = new 바구니();
		s1.data = 1;
		System.out.println(s1.data);

		바구니 s2 = new 바구니();
		s2.data = "문자열";
		System.out.println(s2.data);
	}

}
