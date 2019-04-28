/*
* @Author: bear
* @Date:   2019-04-27 20:45:26
* @Last Modified by:   bear
* @Last Modified time: 2019-04-27 21:03:13
*/

import java.util.Arrays;

public class Arraysfill {

	public static void main(String[] args) {

		String name[] = {"xiong", "yong", "zhao", "love", "china"};

		Arrays.fill(name, 0, 3, "fake");

		for (int i = 0; i < name.length; i ++) {
			System.out.println(name[i]);
		}

		System.out.println(Arrays.toString(name));


	}


}
