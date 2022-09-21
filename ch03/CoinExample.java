package ch03;

public class CoinExample {

	public static void main(String[] args) {
		// 동전구하기 500, 100, 50 ,10원이 몇개 인지
		int money = 45484320;
		int restMoney = money;//커밀표기법?
		
		// 변수명 첫글자가 숫자가 될 수 없다.
		int count500 = 0; 
		int count100 = 0;
		int count50 = 0;
		int count10 = 0;
		
		//스탭 1
		count500 = restMoney/500;
		System.out.println("500원 : " +(count500)); // 180원 남음
		restMoney = restMoney%500;
		System.out.println("남은금액 : " +restMoney);
		
		//스탭2
		count100 = restMoney/100;
		System.out.println("100원 : " +(count100));
		restMoney = restMoney%100 ;
		System.out.println("남은금액:" +restMoney);
		
		//스탭3
		count50 = restMoney/50;
		System.out.println("50원 :" +(count50));
		restMoney = restMoney%50;
		System.out.println("남음금액 :" +restMoney);
		
		//스탭4
		count10 = restMoney/10;
		System.out.println("10원 :" +(count10));
		restMoney = restMoney%10;
		System.out.println("남음금액 :" +restMoney);
		
		//마무리
		System.out.println("================");
		System.out.println(money+"의 최소동전 갯수는?"); // 여기서 money의 값을 쓰고 싶어서 새로운 변수인 restMoney를 만들어 준거다
		System.out.println("500원 "+count500+"개"); //문자열과 변수와 문자열을 결합한 형태
		System.out.println("100원 "+count100+" 개");
		System.out.println("50원 "+count50+" 개");
		System.out.println("10원 "+count10+" 개");
		System.out.println("================");
	}

}
