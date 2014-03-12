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
		String[] alphacoords = new String[comSize]; // �����ַ���
		String temp = null; // ��ʱ�ַ���
		int[] coords = new int[comSize]; // �����ַ���
		int attempts = 0; // Ŀǰ���Ե��ַ���
		boolean success = false; // �ҵ����ʵ�λ������
		int location = 0; // Ŀǰ���

		comCount++;// ���ڴ�����n��
		int incr = 1;// ˮƽ����
		// ����ǵ����ŵģ���ֱ����
		if ((comCount % 2) == 1) {
			incr = gridLength;
		}

		// ��Ҫ����ѭ��
		while (!success & attempts++ < 200) {
			location = (int) Math.random() * gridSize;// ������
			System.out.print("try " + location); // ��ӡ���λ��
			int x = 0;// ��n��λ��
			success = true;// �ٶ��ɹ�

			// ����δʹ�õĵ�
			while (success && x < comSize) {
				// ���û��ʹ��
				if (grid[location] == 0) {
					// �洢λ��
					coords[x++] = location;
					// ������һ����
					location += incr;
					// �����±�Ե
					if (location >= gridSize) {
						success = false;// ʧ��
					}
					// �����ұ�Ե
					if (x > 0 && (location % gridLength == 0)) {
						success = false;// ʧ��
					}
				} else {
					System.out.print(" used " + location);
				}
			}
		} // while����

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
