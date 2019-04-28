/*
* @Author: bear
* @Date:   2019-04-27 21:28:38
* @Last Modified by:   bear
* @Last Modified time: 2019-04-27 21:39:39
*/

import java.util.Arrays;

public class ArrayscopyOf {

	public static void main(String[] args) {

		String name[] = {"xiong", "yong", "zhao"};

		String newName[] = Arrays.copyOf(name, 2);

		System.out.println(Arrays.toString(newName));

	}

}
