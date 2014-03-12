package com.java.test;

public class SimpleDotCom {
	// 申明一个数组，存放数据
	int[] locationCells;
	// 申明一个变量用于存放击中的次数
	int numOfHits = 0;

	/**
	 * 将位置信息数据传递给SimpleDotCom对象
	 * 
	 * @param locs传递位置信息
	 */
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	/**
	 * @author Shawn.xiao
	 * @param stringGuess
	 *            传递猜想的数值
	 * @return 返回猜想后的结果
	 * @since 10版本
	 */
	public String checkYourself(String stringGuess) {
		// 将字符串转化为整型数据
		int guess = Integer.parseInt(stringGuess);
		// 默认结果为miss
		// int[] GuessNum = args;
		String result = "miss";

		// 使用for循环进行检查
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}// end if
		}// end for

		// 判断猜中的次数是否已经达到，如果达到则返回结果kill
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
		 * 申明一个dot对象，并建立引用
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
