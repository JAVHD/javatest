/*
* @Author: bear
* @Date:   2019-04-29 11:05:56
* @Last Modified by:   bear
* @Last Modified time: 2019-04-29 11:09:53
*/

import java.util.Arrays;

public class binarySearchFunc02 {

	public static void main(String[] args) {

		int ageArray[] = {4, 25, 10};

		Arrays.sort(ageArray);

		int result = Arrays.binarySearch(ageArray, 4);

		System.out.println(result);


	}

}