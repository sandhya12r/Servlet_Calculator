package c3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletMul extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1 = req.getParameter("number1");
		int num1 = Integer.parseInt(s1);
		String s2 = req.getParameter("number2");
		int num2 = Integer.parseInt(s2);

		int res_mul = num1 * num2;

		req.setAttribute("res_mul", res_mul);
		RequestDispatcher reqd = req.getRequestDispatcher("/ServletDiv");
		reqd.forward(req, resp);
	}
}
