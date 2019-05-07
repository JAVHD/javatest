/*
* @Author: bear
* @Date:   2019-04-29 10:56:17
* @Last Modified by:   bear
* @Last Modified time: 2019-04-29 11:11:13
*/

import java.util.Arrays;

public class binarySearchFunc {

	public static void main(String[] args) {

		int ageArray[] = {4, 25, 10};

		Arrays.sort(ageArray);

		int result;

		result = Arrays.binarySearch(ageArray, 0, 1, 8);

		System.out.println(result);

	}

}