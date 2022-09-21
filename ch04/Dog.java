package ch04;

// 클래스 = 여러가지 특징(상태)를 가지고 있다.
// int, double, String 등 이것들은 한가지의 상태만 가질 수 있다.
public class Dog {
	int age = 20; //변경가능
	String name = "토토"; //변경가능
	String color = "하얀색"; //변경가능
	final String type = "말티즈"; //변경불가능 , 변수가 아닌 상수임, 그래서 앞에다가 final을 붙인다. - 상수가 됨
}
