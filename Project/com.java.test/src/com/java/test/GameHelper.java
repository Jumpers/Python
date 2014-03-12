package com.java.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {

	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int[] grid = new int[gridSize];
	private int comCount = 0;

	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(
					System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0)
				return null;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("IOException: " + e);
		}

		return inputLine.toLowerCase();
	}

	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();
		String[] alphacoords = new String[comSize]; // 保存字符串
		String temp = null; // 临时字符串
		int[] coords = new int[comSize]; // 现有字符串
		int attempts = 0; // 目前测试的字符串
		boolean success = false; // 找到合适的位置了吗？
		int location = 0; // 目前起点

		comCount++;// 现在处理到第n个
		int incr = 1;// 水平增量
		// 如果是单数号的，垂直增量
		if ((comCount % 2) == 1) {
			incr = gridLength;
		}

		// 主要搜索循环
		while (!success & attempts++ < 200) {
			location = (int) Math.random() * gridSize;// 随机起点
			System.out.print("try " + location); // 打印起点位置
			int x = 0;// 第n个位置
			success = true;// 假定成功

			// 查找未使用的点
			while (success && x < comSize) {
				// 如果没有使用
				if (grid[location] == 0) {
					// 存储位置
					coords[x++] = location;
					// 尝试下一个点
					location += incr;
					// 超出下边缘
					if (location >= gridSize) {
						success = false;// 失败
					}
					// 超出右边缘
					if (x > 0 && (location % gridLength == 0)) {
						success = false;// 失败
					}
				} else {
					System.out.print(" used " + location);
				}
			}
		} // while结束

		int x = 0;
		int row = 0;
		int column = 0;
		System.out.println("\n");

		while (x < comSize) {
			grid[coords[x]] = 1;
			row = (int) (coords[x] / gridLength);
			column = coords[x] % gridLength;
			temp = String.valueOf(alphabet.charAt(column));

			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
		}
		System.out.println("\n");

		return alphaCells;
	}
}
