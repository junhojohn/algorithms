package com.problems.sorts;

public class SelectionTestMain {

	public static void main(String[] args) {
		String str 	= "617893542";
		int minIdx	= 0;
		int fixIdx 	= 0;
		int temp	= 0;
		int[] list 	= new int[str.length()];
		
		for(int i = 0 ; i < str.length() ; i ++) {
			list[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		
		for(int k = 0 ; k < list.length ; k ++) {
			int min = 9;
			for(int i = fixIdx ; i < list.length ; i ++) {
				if(list[i] < min) {
					min = list[i];
					minIdx = i;
				}
			}			
			if(min < list[fixIdx]) {
				temp 		 = list[minIdx];
				list[minIdx] = list[fixIdx];
				list[fixIdx] = temp;
				fixIdx++;
			}
		}
		
		for(int i = 0 ; i < list.length ; i ++) {
			System.out.print(list[i]);
		}
		
		
	}

}
