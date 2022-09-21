package ch01;

//MyVar은 클래스 자료형으로서 개발자가 만드는 커스텀 자료형
//MyVar 처럼 여러가지 데이터를 가지고 있는 클래스를 Beans 라고 부름.
class MyVar{
	static int n1 = 10;
	static char c1 = 'A';
}

class MyVar2{
	static int n1 = 20;
	static char c1 = 'B';
}


public class VarEx03 {
	
	static int num = 500;

	public static void main(String[] args) {
		System.out.println(MyVar.n1);
		System.out.println(MyVar.c1);
		System.out.println(VarEx03.num); //이름이 같아서 VarEx03. 을 생략해도 되지만 정확히 하자면 넣어야 함
		System.out.println(MyVar2.n1);
		System.out.println(MyVar2.c1);
		
	}

}
