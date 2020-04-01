package com.problems.hashes;

import java.util.Arrays;

/**
 * ���� ����
��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.

������ : 119
���ؿ� : 97 674 223
������ : 11 9552 4421
��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
����� ����
phone_book	return
[119, 97674223, 1195524421]	false
[123,456,789]	true
[12,123,1235,567,88]	false
����� �� ����
����� �� #1
�տ��� ������ ���� �����ϴ�.

����� �� #2
�� ��ȣ�� �ٸ� ��ȣ�� ���λ��� ��찡 �����Ƿ�, ���� true�Դϴ�.

����� �� #3
ù ��° ��ȭ��ȣ, ��12���� �� ��° ��ȭ��ȣ ��123���� ���λ��Դϴ�. ���� ���� false�Դϴ�.
 * @author 82109
 *
 */
public class Level02SolutionMain {


	public static void main(String[] args) {
		
//		String[] phone_book = {"119", "97674223", "1195524421"};
//		String[] phone_book = {"123", "456", "789"};
//		String[] phone_book = {"12", "123", "1235", "567", "88"};
//		String[] phone_book = {"119", "1192456"};
//		String[] phone_book = {"1192456", "119"};
		String[] phone_book = {"97674223", "1195524421", "119"};
		
		System.out.println(solution(phone_book));
	}

	/**
	 * �ۼ��Ͻ�: 2020.04.01 ���� 10:36
	 * �ҿ�ð�:10��
	 * ��Ȯ�� �׽�Ʈ ���: 9/11
	 * ȿ���� �׽�Ʈ ���: 0/2
	 * @param phone_book
	 * @return
	 */
//    public static boolean solution(String[] phone_book) {
//        boolean answer = true;
//        Arrays.sort(phone_book);
//        for(int i = 1 ; i < phone_book.length ; i ++) {
//        	if(phone_book[0].length() <= phone_book[i].length()) {
//            	if(phone_book[i].substring(0, phone_book[0].length()).equals(phone_book[0])) {
//            		answer = false;
//            		break;
//            	}        		
//        	}
//        }
//        return answer;
//    }
	
	/**
	 * �ۼ��Ͻ�: 2020.04.01 ���� 10:36
	 * �ҿ�ð�:10��
	 * ��Ȯ�� �׽�Ʈ ���: 11/11
	 * ȿ���� �׽�Ʈ ���: 2/2
	 * @param phone_book
	 * @return
	 */
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 1 ; i < phone_book.length ; i ++) {
        	if(phone_book[0].length() <= phone_book[i].length()) {
            	if(phone_book[i].substring(0, phone_book[0].length()).equals(phone_book[0])) {
            		answer = false;
            		break;
            	}        		
        	}
        }
        return answer;
    }
	
}
