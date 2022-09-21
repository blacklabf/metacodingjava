package ch06;

abstract class 공{
	abstract String getName();
}


class 농구공 extends 공{ //우클릭 - source - generate getter and setter : private 변수(상태)에 대한 메서드(행위)생성
	// 상태를 직접적으로 접근을 못하니까 행위를 통해서 접근함. 
	private String name = "농구공";

	// 자식이 부모의 메서드와 동일한 것을 들고 있으면 부모의 메서드가 오버라이드(무효화)된다.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}

class 축구공 extends 공{
	private String name = "축구공";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class 가방<T>{
	private T data;
	
	public T getData() { //private t data를 리턴할 수 있는 함수
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

public class GenericEx03 {
	
	//9시면 축구하고 9시가 아니면 농구하러 가기
	static 가방<? extends 공> 꺼내기(int time) { //이 때 사용하는게 와일드카드! 물음표! 농구공, 축구공 다 됨 (원래는 ? 대신 축구공했더니 56번이 안됨)
		// <?> = <? extends Object>
		if(time == 9) {
			System.out.println("가방에 축구공이 담겼어요");
			축구공 g2 = new 축구공();
			가방<축구공> b2 = new 가방<>();
			b2.setData(g2);
			return b2;
		}else {
			System.out.println("가방에 농구공이 담겼어요");
			농구공 g1 = new 농구공();
			가방<농구공> b1 = new 가방<>();
			b1.setData(g1);
			return b1; 
		}
		
	}

	// 제네릭 고급 = 다형성, Object, 추상클래스, 오버라이드(무효화), 동적바인딩 // 추상클래스부터 왜 쓰는 지 알기.
	// 이 코드는 웹에서 다시 공부해도 되고 웹이나 프로그램을 만들 때 엄청난 위력을 발휘한다.!
	
	
	public static void main(String[] args) {
		//농구공 g1 = new 농구공();
		//축구공 g2 = new 축구공();
		
		//가방<농구공> b1 = new 가방<>(); // 여기서 31번부터 37번라인까지 T는 농구공
		//b1.setData(g1); //b1 한테 농구공 담음
		//가방<축구공> b2 = new 가방<>(); // 여기서 31번부터 37번라인까지 T는 축구공
		//b2.setData(g2); // b2한테 축구공 담음 - 무슨말?
		
		//System.out.println(b1.getData().getName());
		//System.out.println(b2.getData().getName());
		가방<?  extends 공> r1 = 꺼내기(9); // 꺼내기(9)만 해도 되는데 왜 굳이 앞에까지 적어서 리턴받는거지?
		가방<?  extends 공> r2 = 꺼내기(12);
		
		// r1.getData() - getData 가 object 타입이라 .name을 호출할 수가 없다. - 축구공과 농구공의 타입을 일치시키기 3번라인 - 둘다 extends해서 공으로 가능 / object를 하면 다운캐스팅 해야 하니까.
				// <T>에서 ?가 object의 자식이라서 object만 보게 된다.
		
		// 공은 getName 메서드가 없다. - 오버라이드 무효화 시켜서 쓰김 - 4번
		System.out.println(r1.getData().getName()); // getName 하면 공의 getName인데 무효화되서 자식의 getName이 호출 - 축구공 (오버라이딩, 동적바인딩)
		System.out.println(r2.getData().getName()); 
	}

}
