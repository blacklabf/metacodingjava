package ch07;

class 총 {
	void shoot() {
		System.out.println("총을 발사했습니다.");
	}
}

public class ExceptionEx01 {

	public static void main(String[] args) {
		// 컴파일 예외 - (JAVA가 알 수 있다) 컴파일시 일어날 수 있는 대표적인 예외 :Thread.sleep // try-catch로 묶인 애들은 전부다 컴파일 예외.
		try {
			System.out.println("잠자기 시작");
			Thread.sleep(1000); // 메인스레드가 1초동안 잠을 잔다는 뜻 - 10번라인 뜻과 비교
			// 위에 줄 치면 오류나서 surround 어쩌구 해주는데 그게 컴파일시 예외를 잡아주는 거임.
		System.out.println("잠자기 끝");
		} //catch (InterruptedException e) { //Thread.sleep 할 때 방해가 생긴다.
			// 실행 후 오류를 보고 어떤 Exception인지 catch()안에 적어줘야 하는데 컴파일 예외들은 모두 부모가 Exception이어서 그냥 Exception을 적어주면 됨.
		catch (Exception e)	{
		e.printStackTrace(); // 방해를 받지 않아서 여기는 실행되지 않았다는데 뭔 소리지
		}
		
		// 런타임 예외 (개발자가 알 수 있다) - 18번처럼 오류가 없다가 실행하고 나면 오류가 나는 것들.
		int[] nums = {1,2,3};
		try { //실행 후 뜨는 코드를 보고 try + ctrl+space 해서 catch 해서 ()안에 오류 코드에 뭐가 exception인지 찾아서 복붙해서 넣었음. 
			// 근데 어차피 런타임 예외들은 부모가 Runtime Exception이라서 어떤 exception인지 안 적고 그냥 Runtime Exception으로 하면 됨. 
			System.out.println(nums[3]); 
		} //catch (ArrayIndexOutOfBoundsException e) {
			//catch의 역할은 try(시도)하다가 예외가 발생하면 어떻게 처리할지를 정의하는 영역
		catch (RuntimeException e)	{
		System.out.println("괜찮아 그냥 진행해");
			System.out.println(e.getMessage()); // e에 무슨 오류가 났는지 알려줌. => 로그 파일을 남겨둬야 한다. 
			e.printStackTrace(); // 오류추적로그
		}
		
	//	String data = null; //String data = "안녕"
	//	System.out.println(data.length()); // data의 길이.
		
		// try 꺼를 실행하다가 catch() 안에 ()오류가 발생하면 catch가 실행됨. 
		//System.out.println(nums[3]); // 여기서 강제종료! 18번부터 try-catch로 안 잡음녀 그 밑에 코드 진행안됨.(현재 3번지는 없어서 오류가 남)
		
		//총 s = new 총();
		//s.shoot();
		
		총 s = null; 
		try {
			s.shoot();
		} catch (NullPointerException e) { // 일단 정해진 문법대로 실행한 다음에 어떤 Exception인지 오류를 확인해서 복붙
			System.out.println("총이 없어서 총을 만들고 다시 시도하겠습니다..");
			s = new 총();
			s.shoot();
		}
		
		System.out.println("메인스레드 종료");
	}
}
