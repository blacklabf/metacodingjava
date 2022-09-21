package ch07;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("바다"); //100번지
		String s2 = new String("바다"); //30번지
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); // == : 주소를 비교 (값이 아님)
		
		String s3 = "바다"; // 1538384번지를 가리킴
		String s4 = "바다"; // 1538384번지를 가리킴
		System.out.println(s3.hashCode()); //hashCode(); - 정확히 몇번지를 가르키는 나옴.
		System.out.println(s4.hashCode()); //hashCode(); - 정확히 몇번지를 가르키는 나옴.
		System.out.println(s3==s4); // == : 주소를 비교 (값이 아님)
		
		s3 = s3 + "태양";
		System.out.println(s3);
		System.out.println(s4);
		s3 = s3 + "달";
		System.out.println(s3);

	


//쓰레기 수집 대상 (가비지컬렉션) : 새로운 공간이 할당되면서 그 전의 더이상 쓰이지 않게 되는 공간을 메모리에서 날려버림 

//문자열을 비교할 때 -> s1 s2 s3 s4 (바다) // 같은 값이면서 같은 위치, 주소에 있는 건지 아래에서 확인
System.out.println(s1.equals("바다")); //  문자열 값 자체와 주소 두개를 비교한다. 
// 여기서 s1과 바다가 같다는 건지 뭔 소리ㅣ지
}
}


// StringConstantPool 
// 장점 : 같은 문자열 (같은 공간 공유) : 메모리의 효율이 높다.
// 단점 : 문자열을 변경하게 될 때 마다 새로운 공간이 할당되어서 자주 변경하게 된다면 별로 좋지 않다.
