/*
* @Author: bear
* @Date:   2019-04-27 21:11:53
* @Last Modified by:   bear
* @Last Modified time: 2019-04-27 21:20:13
*/

import java.util.Arrays;

public class Arrayssort {

	public static void main(String[] args) {

		int num[] = {8, 7, 18, 17, 1, 2};

		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		System.out.println(Arrays.toString(num));


	}
}