package ch06;

public class ArrayForEx01 {
	
	static void 남은금액계산(int[] coin, int restMoney) {// coin이랑 restMoney 있어야지 오류 안남! - 왜! - 오류가 났을 때 이걸 선언하지 않았다는 걸 내가 알아야 함!
		for(int i=0; i<4;i++) { //i=1 부터가 아니라 i=0까지 // 인덱스

			System.out.println(coin[i]+ "원: " +(restMoney/coin[i])); 
			restMoney = restMoney%coin[i];
			System.out.println("남은금액 : " +restMoney);
		}
		}

	public static void main(String[] args) {
		// 최소동전구하기 500,100,50,10 (ch03의 CoinExample를 배열,반복문으로 풀기)
		int[] coin = {500,100,50,10}; // 배열 , 대괄호의 위치는 int 뒤나 coin뒤나 아무상관x
		int money = 1350;
		int restMoney = money;

		// 아래의 스텝 4개를 위에서 만든 배열과 for문을 이용해서 수정하세요 - 리팩토링(코드재생산)
		남은금액계산(coin,restMoney); // 메서드호출
		// 원래는 5번에서 12번대신 6번부터 10번을 21번 대신 넣어줘도 되지만 이렇게 해도 되고
		
	}
}


