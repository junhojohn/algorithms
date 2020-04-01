package com.problems.hashes;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * ���� ����
������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.
����� ��
participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
����� �� ����
���� #1
leo�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #2
vinko�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #3
mislav�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.
 * 
 * @author 82109
 *
 */
public class Level01SolutionMain {

	public static void main(String[] args) {
		
	}

	/**
	 * �ۼ��Ͻ�: 2020.04.01 ���� 9:20
	 * �ҿ�ð�:40��
	 * ��Ȯ�� �׽�Ʈ ���: 5/5
	 * ȿ���� �׽�Ʈ ���: 0/5
	 * @param participant
	 * @param completion
	 * @return
	 */
    public String solution(String[] participant, String[] completion) {
        String answer				= null;
    	int totalPaticipantsNum 	= participant.length;
        boolean[] isCompletedMember = new boolean[totalPaticipantsNum];
        
        for(int i = 0 ; i < totalPaticipantsNum-1 ; i ++) {
        	for(int k = 0 ; i < totalPaticipantsNum; k ++) {
        		if(isCompletedMember[k] == false) {
        			if(completion[i].equals(participant[k])) {
        				isCompletedMember[k] = true;
        				break;
        			}
        		}
        	}
        }
        
        for(int j = 0 ; j < totalPaticipantsNum ; j++) {
        	if(isCompletedMember[j] == false) {
        		answer = participant[j];
        		break;
        	}
        }
        
        return answer;
    }
    
}
