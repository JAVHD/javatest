/*
* @Author: bear
* @Date:   2019-10-24 23:40:37
* @Last Modified by:   bear
* @Last Modified time: 2020-05-25 15:45:47
*/

import java.util.ArrayList;
import java.util.Arrays;

public class For {
	public static void main(String[] args) {
		// for ( : ) {

		// }
		//fo
		//ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("cat", "dog", "bear", "panda"));

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("bear");
		arrayList.add("dog");
		arrayList.add("panda");

		//String array[] = {"cat", "dog", "bear", "panda"};
		//int array[] = {99, 100, 101, 102};

		for (String a : arrayList
		    ) {
			System.out.println(a);
		}

	}
}
