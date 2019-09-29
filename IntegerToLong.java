/*
* @Author: bear
* @Date:   2019-09-11 14:13:58
* @Last Modified by:   bear
* @Last Modified time: 2019-09-11 14:25:58
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class IntegerToLong {
	public static void main(String[] args) {
		Integer createTime = 1568182668;

		long time;

		time = createTime;

		System.out.println(time);

		//time = SimpleDateFormat("yyyy-MM-dd").format(new Date(createTime.longValue() * 1000))

	}
}
