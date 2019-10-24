/*
* @Author: bear
* @Date:   2019-10-24 15:22:31
* @Last Modified by:   bear
* @Last Modified time: 2019-10-24 15:51:27
*/

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("bear");
		arrayList.add("dog");
		arrayList.add("panda");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}



	}
}
