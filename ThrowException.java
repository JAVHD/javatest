/*
* @Author: bear
* @Date:   2019-10-11 11:35:22
* @Last Modified by:   bear
* @Last Modified time: 2019-10-11 15:52:55
*/
import java.io.IOException;
import java.sql.SQLException;

public class ThrowException {

	//必须对其进行捕获或声明以便抛出
	//如果父类是RuntimeException或它的某个子类，则自定义异常也是未受检异常；
	//如果是Exception或Exception的其他子类，则自定义异常是受检异常。
	public static void exption1() throws IOException, SQLException {
		//throw new Exception("Exception test");

		//short a = 1

		if (1 + 1 == 2) {
			throw new IOException("IOException test");
		} else {
			throw new SQLException("SQLException test");
		}

	}

	public static void main(String[] args) {

		// try {
		// 	exption1();
		// } catch (IOException e) {
		// 	System.out.println(e);
		// } catch (Exception e) {
		// 	System.out.println(e);
		// }

		try {
			exption1();
		} catch (IOException | SQLException e) {
			System.out.println(e);
		}




	}
}
