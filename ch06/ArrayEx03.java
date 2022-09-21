package ch06;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[][] nums = { {1,2,3},{4,5,6} }; // 2차원 배열 - [2][3]배열// {1,2,3}을 0번지 행 / {4,5,6}을 1번지 행
		
		System.out.println(nums[0][0]);
		System.out.println(nums[0][2]);
		System.out.println(nums[1][1]);
		
		//  2차원 배열의 다른 표기법 & 데이터 값넣기
		int[][] nums2 = new int[2][2]; // 6번째 라인의 다른 표기법 / 2행 2열의 배열이 나옴.
		nums2[0][0] = 1;
		nums2[0][1] = 2;
		nums2[1][0] = 3;
		nums2[1][1] = 4;
		
		System.out.println(nums2[1][0]);
	}

}
