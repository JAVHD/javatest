/*
* @Author: bear
* @Date:   2019-09-02 16:27:07
* @Last Modified by:   bear
* @Last Modified time: 2019-09-02 16:40:45
*/

import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class forEachFunc {
	public static void main(String[] args) {

		Map<String, String> list = new HashMap<String, String>();

		list.put("name", "bear");
		list.put("age", "18");
		list.put("sex", "1");
		list.put("height", "180");
		list.put("salary", "18000");

		list.forEach((k, v)-> {
			System.out.println("key:" + k + " value: " + v);
		});

	}
}