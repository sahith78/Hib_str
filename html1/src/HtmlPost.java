

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HtmlPost
 */
@WebServlet("/html2")
public class HtmlPost extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		//Request parametrs
		String str1=request.getParameter("first");
		String str2=request.getParameter("second");
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c=a+b;
		pw.println(c);
		pw.close();
	}

}
