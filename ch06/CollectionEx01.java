package ch06;

import java.util.ArrayList;

class 백조{}

public class CollectionEx01 {

	public static void main(String[] args) {
		// 기본자료형(int, double, char, boolean)은 값을 가지고 있음
		// 레퍼런스자료형(String,커스텀자료형(Class))은 주소를 가지고 있음
		//아래 ArrayList 제네릭공간<>에는 기본자료형이 들어올 수 없다 => 래핑클래스를 만듦 (기본자료형을 래퍼런스자료형처럼 쓸 수 있게 만들어줌)
		// 래핑클래스 = Integer, Double, Character, Boolean // 기본자료형 대신 넣으면 같은 거 수집
		ArrayList<Integer> c1 = new ArrayList<>();//괄호안에 수집하고 싶은 걸 넣으면 됨
		// 컬렉션이기 때문에 윗줄에서<>안에 크기를 정해줄 필요 없음 
		// 아래처럼 그냥 데이터를 넣어줌
		c1.add(1); //  c1의 0번지에 1을 넣음
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
		c1.add(6);

		// 꺼낼 때는 get을 이용해야 함!
		//System.out.println(c1.get(0)); 
		
		//for문 (반복문) 과 컬렉션이 많이 같이 쓰임.
		// for치고 ctrl+space 해서 2번째 꺼 누르면 됨. 
		//System.out.println("사이즈 :" +c1.size());
		//for (int i = 0; i < c1.size(); i++) { //c1.size();해서 배열의 크기를 유동적으로 넣을 수 있어서 위에서 데이터를 추가해도 괜춘 get(i) 해주면 모든 게 순서대로 나옴
		//	System.out.println(c1.get(i)); // 그러나 메서드(c1.size)를 호출하는 것은 좋은 것이 아님 => 아래처럼 int를 통해 한번만 불러줌
		
		// 코드를 리팩토링 함.
		int size = c1.size();
		System.out.println("사이즈 :" +size);
		for (int i = 0; i <size; i++) { 
		System.out.println(c1.get(i)); 
		}
	
	}

}
