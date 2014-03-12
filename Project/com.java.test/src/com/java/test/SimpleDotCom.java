package com.java.test;

public class SimpleDotCom {
	// ����һ�����飬�������
	int[] locationCells;
	// ����һ���������ڴ�Ż��еĴ���
	int numOfHits = 0;

	/**
	 * ��λ����Ϣ���ݴ��ݸ�SimpleDotCom����
	 * 
	 * @param locs����λ����Ϣ
	 */
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	/**
	 * @author Shawn.xiao
	 * @param stringGuess
	 *            ���ݲ������ֵ
	 * @return ���ز����Ľ��
	 * @since 10�汾
	 */
	public String checkYourself(String stringGuess) {
		// ���ַ���ת��Ϊ��������
		int guess = Integer.parseInt(stringGuess);
		// Ĭ�Ͻ��Ϊmiss
		// int[] GuessNum = args;
		String result = "miss";

		// ʹ��forѭ�����м��
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}// end if
		}// end for

		// �жϲ��еĴ����Ƿ��Ѿ��ﵽ������ﵽ�򷵻ؽ��kill
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}

class SimpleDotComTestDrive {
	public static void main(String[] args) {
		/**
		 * ����һ��dot���󣬲���������
		 */
		SimpleDotCom dot = new SimpleDotCom();

		int[] locations = { 2, 3, 4 };
		dot.setLocationCells(locations);

		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		if (result.equals("hit")) {
			testResult = "passed";
		}
		System.out.println("" + testResult);

	}
}
