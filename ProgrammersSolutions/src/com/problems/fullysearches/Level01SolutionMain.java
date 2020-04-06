package com.problems.fullysearches;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Level01SolutionMain {

    static int correctCnt 			= 0;
    static int correctMaxCnt		= 0;
    
	public static void main(String[] args) {
		int[] answers = new int[] {1,2,3,4,5};
//		int[] answers = new int[] {1,3,2,4,2};
//		int[] answers = new int[] {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
//		int[] answers = new int[] {2,1,2,3,2,4,2,5};
//		int[] answers = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int[] answer = solution(answers);
		for(int i = 0 ; i < answer.length ; i ++) {
			System.out.println(answer[i]);
		}
	}

	/**
	 * 작성일시: 2020.04.06 오후 11:00~12:30, 오후 7:00~7:50
	 * 소요시간:130분
	 * 정확성 테스트 결과: 14/14
	 * @param participant
	 * @param completion
	 * @return
	 */
    public static int[] solution(int[] answers) {
        int[] answer 			= new int[]{-1,-1,-1};
        int correctMaxCnt		= 0;
        Map<Integer, Integer> answerList = new LinkedHashMap<Integer, Integer>();
		int[] person1AnswerSet 	= new int[answers.length];
		int[] person2AnswerSet 	= new int[answers.length];
		int[] person3AnswerSet 	= new int[answers.length];
		
		for(int i = 0 ; i < answers.length ;  i ++) {
			switch (i % 5) {
			case 0:
				person1AnswerSet[i] = 1;
				break;
			case 1:
				person1AnswerSet[i] = 2;
				break;
			case 2:
				person1AnswerSet[i] = 3;
				break;
			case 3:
				person1AnswerSet[i] = 4;
				break;
			case 4:
				person1AnswerSet[i] = 5;
				break;
			default:
				break;
			}
		}
		
		for(int i = 0 ; i < answers.length ;  i ++) {
			switch (i % 8) {
			case 0:
			case 8:
				person2AnswerSet[i] = 2;
				break;
			case 1:
			case 9:
				person2AnswerSet[i] = 1;
				break;
			case 2:
				person2AnswerSet[i] = 2;
				break;
			case 3:
				person2AnswerSet[i] = 3;
				break;
			case 4:
				person2AnswerSet[i] = 2;
				break;
			case 5:
				person2AnswerSet[i] = 4;
				break;
			case 6:
				person2AnswerSet[i] = 2;
				break;
			case 7:
				person2AnswerSet[i] = 5;
				break;
			
			default:
				break;
			}
		}
		
		for(int i = 0 ; i < answers.length ;  i ++) {
			switch (i % 10) {
			case 0:
				person3AnswerSet[i] = 3;
				break;
			case 1:
				person3AnswerSet[i] = 3;				
				break;
			case 2:
				person3AnswerSet[i] = 1;
				break;
			case 3:
				person3AnswerSet[i] = 1;
				break;
			case 4:
				person3AnswerSet[i] = 2;
				break;
			case 5:
				person3AnswerSet[i] = 2;
				break;
			case 6:
				person3AnswerSet[i] = 4;
				break;
			case 7:
				person3AnswerSet[i] = 4;
				break;
			case 8:
				person3AnswerSet[i] = 5;
				break;
			case 9:
				person3AnswerSet[i] = 5;
				break;
			default:
				break;
			}
		}
		
		correctCnt = 0;
		getEval(answers.length-1, person1AnswerSet, answers);
		if(correctMaxCnt <= correctCnt) {
			correctMaxCnt = correctCnt;
		}
		answerList.put(1, correctCnt);
		
		correctCnt = 0;
		getEval(answers.length-1, person2AnswerSet, answers);
		if(correctMaxCnt <= correctCnt) {
			correctMaxCnt = correctCnt;
		}
		answerList.put(2, correctCnt);
		
		correctCnt = 0;
		getEval(answers.length-1, person3AnswerSet, answers);
		if(correctMaxCnt <= correctCnt) {
			correctMaxCnt = correctCnt;
		}
		answerList.put(3, correctCnt);				

		Integer max = Collections.max(answerList.values());
		List<Integer> tempList = new ArrayList<Integer>();
		for(Integer idx : answerList.keySet()) {
			if(answerList.get(idx) >= max) {
				tempList.add(idx);
			}
		}
		
		answer = new int[tempList.size()];
		for(int i = 0 ; i < tempList.size() ; i ++) {
			answer[i] = tempList.get(i);
		}
		return answer;
    }
    
        private static void getEval(int answerIdx, int[] person1Answer, int[] answers) {
		
    	if(answerIdx == 0) {
    		// Base Case
        	if(person1Answer[answerIdx] == answers[answerIdx]) {
        		correctCnt++;
    		}
    		return;
    	}
        	// General Case
        	if(person1Answer[answerIdx] == answers[answerIdx]) {
        		correctCnt++;
    		}    		
        	getEval(--answerIdx, person1Answer, answers);
    }
}
