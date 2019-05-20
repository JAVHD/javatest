/*
* @Author: bear
* @Date:   2019-05-20 14:22:20
* @Last Modified by:   bear
* @Last Modified time: 2019-05-20 14:31:15
*/

import java.io.File;


public class FileClass {

	public static void main(String[] args) {

		try {

			File file = new File("FileClass.log");


			if (file.exists()) {
				file.delete();
				System.out.println("文件已删除");
			} else {
				file.createNewFile();
				System.out.println("文件创建成功");
			}


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}




	}


}