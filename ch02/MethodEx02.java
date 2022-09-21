package ch02;

public class MethodEx02 {
	
	//static void add()에서 void는 리턴(돌려주지)하지 않겠다. - main에서 sum 호출(접근) 못함.
	static int add() { //호출이 되면 중괄호 내부가 실행된다. 이때 stack 공간이 메모리에 만들어진다. 
		// 위에서 int를 적은 이유는 return 하는 것과 type이 같아야 하므로 sum의 타입인 int를 적어준 거
		int sum = 5+6; // 지역변수 
		// System.out.println(sum);
		return sum; // 나를 호출한 곳으로 sum을 return 시킴 즉, 14번 라인에 add()로 11을 저장
	}

	public static void main(String[] args) {
		//add(); // add() 메서드 호출 // add에다가 static 붙여서 new 없이 바로 불러옴
		int result = add(); //add() 메서드 호출 -> 9번에 리턴을 받아서 add() 가 11이 됨 즉,int result = 11; 
		//위에서 void 대신 int를 써서 return으로 int값을 돌려받음 그래서 sum이 사라져도 retrun한 sum 값이 있어서 main 메서드에서 호출 가능
		System.out.println(result);
	}

}