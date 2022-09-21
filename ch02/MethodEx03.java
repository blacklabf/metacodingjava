package ch02;

public class MethodEx03 {
	
	static void 자판기_음료_돌려주기(int coin) {
		System.out.println("동전을 투입하였습니다.");
	}

	static void 자판기_음료_돌려주기2(double paper) {
		System.out.println("지폐을 투입하였습니다.");
	}
	
	static void 자판기_음료_돌려주기3(String card) {
		System.out.println("카드를 투입하였습니다.");
	}
	
	static void add(int n1, int n2) { //매개변수가 2개!!
		System.out.println("더하기 메서드가 호출되었습니다.");
		int sum = n1 + n2;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		자판기_음료_돌려주기(1000);
		자판기_음료_돌려주기2(1000.50);
		자판기_음료_돌려주기3("삼성카드");
		자판기_음료_돌려주기3("국민카드");
		add(5,6); // 5가 n1에 들어가고 6이 n2에 들어감

	}

}
     //MethodEx03 클래스의 행위들 : sysout"동전" , "지폐", "카드" , "더하기" 등 각각 내부가 메서드
	// int coin 부터 int n1, int n2등등 각각을 매개변수라고 하고 1000, 1000.50 부터 5,6을 각각 인수라고 한다.
