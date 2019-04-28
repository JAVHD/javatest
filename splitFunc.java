/*
* @Author: bear
* @Date:   2019-04-27 13:49:49
* @Last Modified by:   bear
* @Last Modified time: 2019-04-27 13:57:29
*/

import java.util.Arrays;

public class splitFunc {

	public static void main(String[] args) {

		String name = "xiong yong zhao";

		//一维数组
		String[] nameArray;

		nameArray = name.split(" ");

		System.out.println(Arrays.toString(nameArray));

	}

}
