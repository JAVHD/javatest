/*
* @Author: bear
* @Date:   2019-09-09 15:02:58
* @Last Modified by:   bear
* @Last Modified time: 2019-09-09 15:07:35
*/


public class StringType {


	public static void main(String[] args) {

		try {

			String name = "bear";
			System.out.println(name);

			name = "cat"; //其值不可改变？
			System.out.println(name);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}




}