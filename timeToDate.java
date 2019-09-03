/*
* @Author: bear
* @Date:   2019-09-03 09:59:17
* @Last Modified by:   bear
* @Last Modified time: 2019-09-03 10:13:09
*/

import java.util.Date;
import java.text.SimpleDateFormat;

public class timeToDate {

	public static void main(String[] args) {
		//time = "1555882875";
		long time = 1555882875;

		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time * 1000));

		System.out.println("time " + time);
		System.out.println("date " + date);

	}

}