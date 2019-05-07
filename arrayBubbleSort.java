/*
* @Author: bear
* @Date:   2019-04-29 15:00:32
* @Last Modified by:   bear
* @Last Modified time: 2019-04-29 15:40:52
* 数组冒泡排序算法
*/

import java.util.Arrays;

public class arrayBubbleSort {

	public static void main(String[] args) {

		int arrayNum[] = {8, 5, 23, 78, 1, 2};

		for (int i = 0; i < arrayNum.length - 1; i++) {
			for (int j = 0; j < arrayNum.length - i - 1; j++) {
				if (arrayNum[j] > arrayNum[j + 1]) { //交换位置
					int temp = arrayNum[j + 1];
					arrayNum[j + 1] = arrayNum[j];
					arrayNum[j] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(arrayNum));

	}

}
