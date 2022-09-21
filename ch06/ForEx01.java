package ch06;

public class ForEx01 {

	public static void main(String[] args) {
		// 표현식 (expression) - 호출하지 않아도 실행되는 메서드
		// int i =1; 초기화 (for 문이 시작될 때 단 한번만 실행된다.
		//  i=i+1 증감식(증가 or 감소) (for 문이 한번 실행된 이후부터 계속 실행)
		// i<101 조건문 (첨부터 끝까지 계속 실행)
		for(int i=1; i<101; i=i+1  ) { //i는 지역변수 - for 라는 stack 내부에서 정의되었기 때문.
			System.out.println(i);
		}

	}

}
