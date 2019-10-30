/**
 * @Author: bear
 * @Date:   2019-10-29 10:27:34
 * @Last Modified by:   bear
 * @Last Modified time: 2019-10-29 10:29:35
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("cat", "dog", "bear", "panda"));

		for (String item:
			 arrayList) {
			System.out.println(item);
		}

	}
}
