/*
* @Author: bear
* @Date:   2020-01-07 14:52:36
* @Last Modified by:   bear
* @Last Modified time: 2020-01-07 14:54:38
*/

import java.time.LocalDateTime;

public class LocalDateTimeTest {
	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); //2020-01-07T15:17:20.917

		LocalDateTime ldt1 = LocalDateTime.of(2019, 1, 7, 20, 45, 5);
		System.out.println(ldt1); //2019-01-07T20:45:05


	}
}