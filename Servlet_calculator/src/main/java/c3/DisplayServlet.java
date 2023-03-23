package c3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int res_add =(int)req.getAttribute("res_add");
		int res_sub =(int)req.getAttribute("res_sub");
		int res_mul =(int)req.getAttribute("res_mul");
		int res_div = (int) req.getAttribute("res_div");
		
		PrintWriter pw= resp.getWriter();
		pw.println("Addition: "+res_add);
		pw.println("Subtraction: "+res_sub);
		pw.println("Multiplication: "+res_mul);
		pw.println("Division: "+res_div);
	}
}
