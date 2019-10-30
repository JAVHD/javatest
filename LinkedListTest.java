/*
* @Author: bear
* @Date:   2019-10-29 11:21:13
* @Last Modified by:   bear
* @Last Modified time: 2019-10-29 14:12:54
*/

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("cat", "dog", "bear", "panda"));

		for (String item :
				linkedList) {
			System.out.println(item);
		}
	}

}