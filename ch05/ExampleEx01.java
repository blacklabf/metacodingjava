package ch05;
// 인터페이스 예제

// 시나리오 : 길동이 집에는 티비가 2대가 있다. 그런데 정말 불편한 점이 있었다. 
// 삼성티비는 초록버튼을 클릭하면 전원이 켜지고 파랑버튼을 클릭하면 전원이 꺼졌다. 
// 엘지티비는 초록버튼을 클릭하면 전원이 켜지고 빨간버튼을 클릭하면 전원이 꺼졌다.
// 두 회사의 차이 때문에 안방에 있는 삼성티비에서는 티비를 끌 때 파랑버튼을 클릭했고
// 거실에 있는 엘지 티비에서는 빨간버튼을 클릭해서 티비를 껐다. 혼란스러웠다.
// 길동이는 이 문제를 해결하고자 삼성과 엘지에 동시에 적용되는 리모콘을 직접 개발하였다.
// 초록버튼은 전원켜짐 & 빨간버튼은 전원꺼짐
// 이렇게 통일하기로 마음 먹었고 행위에 대한 제약을 주기 위해 인터페이스를 만들었다.
// 인터페이스 이름은 RemoconAble 이라고 지었다. 
// public void 초록버튼();
// public void 빨간버튼();
// 이제 길동이는 RemoconAble 인터페이스를 토대로 리모콘을 대량 생산할 공장을 만들었고 new를 엄청 열심히 해서 리모콘을 만들었다.
// 아래의 예제를 완성하시오.


interface RemoconAble{
	public void 초록버튼();
	public void 빨간버튼();
}

class Samsung implements RemoconAble{ // implements는 내부를 구현해야함.

	@Override
	public void 초록버튼() { // 인터페이스에 대한 제약을 받아서 행위에 대한 제약이 걸려버림.
		System.out.println("전원이 켜졌습니다. ");
	}

	@Override
	public void 빨간버튼() {
		System.out.println("전원이 꺼졌습니다. ");
		
	}
	
}

class LG implements RemoconAble{

	@Override
	public void 초록버튼() {
		System.out.println("전원이 켜졌습니다. ");
		
	}

	@Override
	public void 빨간버튼() {
		System.out.println("전원이 꺼졌습니다. ");
		
	}
	
}




public class ExampleEx01 {

	public static void main(String[] args) {
		// 삼성 리모콘 2개 만들기 (new 2번)
		Samsung s1 = new Samsung();
		Samsung s2 = new Samsung();

		// LG 리모콘 2개 만들기 (new 2번)
	    LG g1 = new LG();
		LG g2 = new LG();

	}

}
