/*
* @Author: bear
* @Date:   2019-05-19 22:26:01
* @Last Modified by:   bear
* @Last Modified time: 2019-10-14 17:40:03
*/


public class tryCatch {

	public static void main(String[] args) {

		int a, b, c;
		a = 5;
		b = 1;

		try {
			c = a / b;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("不管是否异常都执行");
		}

		//System.out.println(c);

	}

}