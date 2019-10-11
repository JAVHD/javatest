/*
* @Author: bear
* @Date:   2019-10-08 15:51:24
* @Last Modified by:   bear
* @Last Modified time: 2019-10-10 21:06:22
*/

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String username = req.getParameter("username");

		resp.setContentType("text/html;charset=utf-8");

		PrintWriter printWriter = resp.getWriter();

		String str = "<html><title></title><body>你好" + username + "</body></html>";

		printWriter.println(str);
		printWriter.flush();
		printWriter.close();



	}

}