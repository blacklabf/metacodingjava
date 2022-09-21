package ch06;

class 호랑이{
	String name = "호랑이";
}

class 사자{
	String name = "사자";
}
// 경우에 따라 호랑이를 담거나 사자를 담음 - object 클래스
//class 큰바구니{
//	Object data;
//}
//public class GenericEx02 {
	//public static void main(String[] args) {
		//큰바구니 s1 = new 큰바구니();
		//s1.data = new 호랑이();
		//다운캐스팅
		//호랑이 h1 = (호랑이) s1.data;
		//System.out.println(h1.name); //()안에 s1.data.name 이었는데 다운캐스팅 해서 h1.name으로
		
// generic 이용 - object는 다운캐스팅 해야해서 힘듦
class 큰바구니 <T>{ //30번라인에서 호랑이가 들어가면서 23,24번에 T가 호랑이가 됨.
			T data;
		}

		public class GenericEx02 {

			public static void main(String[] args) {
				큰바구니<호랑이> s1 = new 큰바구니<호랑이>(); //뒤에<>안의 호랑이는 생략가능
				s1.data = new 호랑이();
				System.out.println(s1.data.name);
				
				큰바구니<사자> s2 = new 큰바구니<>();
				s2.data = new 사자();
				System.out.println(s2.data.name);
	}

}
		// Generic은 어떤 class를 만들 때 타입이 정해져있지 않으면 object로 하면 불편하니까 generic이라는 문법을 써라!
