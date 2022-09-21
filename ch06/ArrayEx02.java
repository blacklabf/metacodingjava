package ch06;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] nums = new int[3]; // 메모리에 연속된 3개의 공간을 생성 (int라서 1공간당 4byte)
		nums[0] = 4; // 0번지에 4라는 데이터를 넣음
		nums[1] = 5;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]); // int의 값이 초기화 되지 않으면 0이 나온다.


	}

}
