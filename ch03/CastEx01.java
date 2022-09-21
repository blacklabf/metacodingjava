package ch03;

public class CastEx01 {

	public static void main(String[] args) {
		// 캐스팅 (다운캐스팅 ,업캐스팅)
		int n1 =100; // 4Byte 공간에 100을 넣음
		double d1 = n1; // 8Byte공간에 100을 넣음 (8Byte 안에 4Byte 짜리를 넣음)
		System.out.println(d1) ; // 업캐스팅(묵시적 허용)
		
		double d2 = 100.8;
		// 명시적 형변환 (int) 다운캐스팅 : 데이터가 유실 될 수 있다.
		int n2 = (int)d2; // double을 int로 변환할 수 없어요. // 그래서 명시적 형변환 (int)를 함  0.8이 잘림
		System.out.println(n2);
		
		int money = 130;
		System.out.println(130/100);
		System.out.println(money/100);
		System.out.println(money/100.0); // int/double 이므로 큰 쪽 (double)을 따라간다. -> 값이 double이다. 
	}

}
