package com.problems.heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Level01SolutionMain {

	public static void main(String[] args) {
//		int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
		int[] scoville = new int[]{1, 2, 3};
		int k = 0;
		System.out.println(solution(scoville, k));
	}

	/**
	 * �ۼ��Ͻ�: 2020.04.03 ���� 10:46
	 * �ҿ�ð�:13��
	 * ��Ȯ�� �׽�Ʈ ���: 9/11
	 * ȿ���� �׽�Ʈ ���: 0/2
	 * @param phone_book
	 * @return
	 */
    public static int solution(int[] scoville, int K) {
        int answer 	= 0;
        int result 	= 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int i = 0 ; i < scoville.length ; i ++) {
        	queue.offer(scoville[i]);
        }
        System.out.println(scoville);
        do {
        	if(answer == scoville.length-1) {
        		answer = -1;
        		break;
        	}
        	
        	answer++;
        	result = queue.poll() + (queue.poll() * 2);
        	queue.offer(result);
        }while(queue.peek() < K);
        
        return answer;
    }
}
