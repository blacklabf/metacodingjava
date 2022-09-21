package ch04;

import java.util.Random; // java 라는 패키지안에 util이라는 패키지안에 Random이라는 클래스가 있다.

import recipe.MySoup; // 직접 적으면 불편해서 13번에 MySoup 치고 ctrl+space 하면 import가 자동으로 됨

//JDK를 설치하면 - JDK(javac, java), JRE(라이브러리), JVM(자바 가상머신)
//JavaSystemLibrary 가면 자바를 더 쉽게 쓸 수 있는 기능들이 있음.

public class LibEx01 {

	public static void main(String[] args) {
		MySoup m = new MySoup();
		m.김치찌개(); //라이브러리에 뭐가 있는지는 모르지만 m.을 하면 김치찌개가 나온다는 걸 알 수 있어서 사용가능
		
		Random r = new Random(); 
		//난 안됨 ;; Random을 ctrl+클릭하면 .class 파일을 볼 수 있고 class파일은 우리가 이해할 수 없지만 
		//attach source를 들어가서 external location에 external file을 열고 java 설치한 파일에 들어감
		// jdk-11 의 lib의 src.zip 내부에 .java 파일들을 다 제공해두었기 때문에 내부소스코드들을 볼 수 있다.
		
		// static을 확인하기 위해서는 클래스명. 을 해서 뭐가 뜨는지를 확인하는데 Random. 하면 아무거도 안나와서 new를 통해 static을 제외한 모든것들을 heap공간에다가 띄운다.
	    System.out.println(r.nextInt()); // r. 하면 매서드 들이 잔뜩 나옴 (질문! 메서드와 함수의 차이?)
	    //newtInt 우클릭하면 바로 함수로 나옴.
	
	}

}
