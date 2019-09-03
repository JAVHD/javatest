/*
* @Author: bear
* @Date:   2019-09-03 09:59:17
* @Last Modified by:   bear
* @Last Modified time: 2019-09-03 11:23:26
*/

import java.util.Date;
import java.text.SimpleDateFormat;

public class timeToDate {

	public static void main(String[] args) {
		//time = "1555882875";
		//long time = 1555841737;
		Integer time = 1555841737;

		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time.longValue() * 1000));

		System.out.println("new Date: " + new Date(time * 1000));
		System.out.println("time " + time);
		System.out.println("date " + date);

	}

}