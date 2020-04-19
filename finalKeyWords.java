/*
* @Author: bear
* @Date:   2019-05-19 19:10:07
* @Last Modified by:   bear
* @Last Modified time: 2019-05-19 19:12:46
*/


public class finalKeywords {

	public static void main(String[] args) {

		final String name = "bear";

		name = "wang"; //错误: 无法为最终变量name分配值


		System.out.println(name);


	}

}