package ch06;

class 궁수{
	String name = "궁수";
}
class 전사{
	String name = "전사";
}

public class ObjectEx02 {

	public static void main(String[] args) {
		//궁수[] s1 = new 궁수[2];
		//s1[0] = new 궁수();
		//s1[1] = new 궁수(); 
		// 위에 처럼 하면 s1이 궁수타입이기 때문에 new 전사(); 를 할 수 없음.
		
		// 궁수랑 전사 모두 하려면 아래처럼 object 타입으로 해야 함.
		Object[] s1 = new Object[2]; // object class는 모든 class에 부모라서 다형성 때문에 저렇게 해도 됨. 
		s1[0] = new 궁수();
		s1[1] = new 전사(); 
		
		//object에 name이 없기 때문에 다운캐스팅을 해줘야 함. - 근데 다운캐스팅을 하면 전체로 인식해서 하기가 힘듦
		//System.out.println((궁수)(s1[0]).name);
		//System.out.println((전사)s1[1].name);
		
		// 다운캐스팅
		궁수 g1 = (궁수)s1[0];
		전사 g2 = (전사)s1[1];
		System.out.println(g1.name);
		System.out.println(g2.name);

	}
}
// Object Class는 자주 쓰이지는 않지만 타입을 묶어줄 때 쓰여지고 단점은 다운캐스팅을 해줘야 함.
