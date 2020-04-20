package com.problems.sorts;

public class BubbleTestMain {

	public static void main(String[] args) {
		int temp = 0 ;
		String str = "593128476";
		// 정렬할 때는 왠만하면 int[] 배열 사용하자. list쓰면 swap할 때 어려워짐.
		// 그리고 입력이 String이면, String.charAt() + int[] 배열 조합으로 
		int[] list = new int[str.length()] ; 
		
		for(int i = 0 ; i < str.length() ; i ++) {
			list[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		for(int i = 0; i < list.length ; i ++) {
			for(int j = list.length-1 ; j >= 0 ; j --) {
				if(j != 0) {
					if(list[j] < list[j-1]) {
						temp = list[j];
						list[j] = list[j-1];
						list[j-1] = temp;
					}					
				}
			}
		}
		
		for(int i = 0 ; i < list.length ; i ++) {
			System.out.print(list[i]);
		}
	}

}
