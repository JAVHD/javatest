/*
* @Author: bear
* @Date:   2019-05-27 10:38:45
* @Last Modified by:   bear
* @Last Modified time: 2019-05-27 11:51:31
* https://www.cnblogs.com/centor/p/6142775.html
*/

import java.sql.*;

public class javaMysql {


	public static void main(String[] args) {

		Connection conn;

		String driver = "com.mysql.jdbc.Driver";

		String url = "jdbc:mysql://10.10.13.61:3306/yancao";

		String username = "root";

		String password = "20a5c3e2ad56f5f4";

		try {

			//加载驱动程序
			Class.forName(driver);
			//连接数据库
			conn = DriverManager.getConnection(url, username, password);

			if (!conn.isClosed()) {
				System.out.println("conn success");
			}

			Statement statement = conn.createStatement();

			String sql = "select title,source from yc_article";

			ResultSet result = statement.executeQuery(sql);

			String title, article;
			//遍历结果集
			while (result.next()) {

				title = result.getString("title");
				article = result.getString("article");

				System.out.println("title:" + title + "article:" + article);

			}

			//关闭连接
			result.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}


	}


}