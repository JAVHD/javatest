/*
* @Author: bear
* @Date:   2019-05-20 20:41:55
* @Last Modified by:   bear
* @Last Modified time: 2019-05-20 20:56:45
*/

import java.io.FileOutputStream;
import java.io.File;

public class FileOutputStreamClass {

	public static void main(String[] args) {

		try {

			File file = new File("FileClass.log");

			FileOutputStream out = new FileOutputStream(file);

			byte msg[] = "I am bear; I am writing;".getBytes();

			out.write(msg);

			out.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

}