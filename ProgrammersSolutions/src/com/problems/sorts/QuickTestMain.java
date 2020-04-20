package com.problems.sorts;

public class QuickTestMain {

	public static void main(String[] args) {
		String str 		= "358129476";
		int[] list 		= new int[str.length()];
		int pivot 		= 2;
		int pivotIdx 	= 0;
		
		for(int i = 0 ; i < str.length() ; i ++) {
			list[i]  = Integer.parseInt(String.valueOf(str.charAt(i)));
			if(list[i] == pivot) {
				pivotIdx = i;
			}
		}
		
		
	}

}
