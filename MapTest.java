/*
* @Author: bear
* @Date:   2019-11-02 17:31:58
* @Last Modified by:   bear
* @Last Modified time: 2019-11-02 17:32:32
*/

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("name", "bear");
		map.put("sex", "man");
		map.put("age", "18");
		map.put("salary", "15000");

		for (Map.Entry<String, String> entry :
				map.entrySet()) {
			System.out.println(entry.getValue());
		}

	}
}