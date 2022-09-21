package ch03;

public class OperEx05 {

	public static void main(String[] args) {
		// 삼항 연산자 = 조건 연산자
		int n1 = 5;
		
		// 조건(비교연산자)? true : false
		System.out.println(n1==5 ? "5가 맞습니다." : "5가 아닙니다.");
		
		int point = 59;
		System.out.println(point >=60 ? "시험을 통과했습니다." : "내년에 재수강 해야 합니다." );
		
		String result = point >=60 ? "시험을 통과했습니다." : "내년에 재수강해야합니다." ;//삼항연산자의 결과는 문자열등 다른 것들이 될 수 있음.
		System.out.println("결과 : "+result); // 여기서 +는 결합
		
		boolean result2 = 1==1; // 비교연산자의 결과는 true , false 임
		System.out.println("결과 : "+result2);
		
		int result3 = point < 60 ? 0 : 1 ; // point가 60보다 작으면 0이 뜨고 크면 1이 뜬다. 그래서 string이 아닌 int로 해야 함
		System.out.println("결과 : "+result3);

	}

}
