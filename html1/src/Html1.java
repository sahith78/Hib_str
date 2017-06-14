

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Html1
 */
@WebServlet("/html1")
public class Html1 extends GenericServlet {
public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
PrintWriter pw=response.getWriter();
//Request parameters
String str1=request.getParameter("first");
String str2=request.getParameter("second");
int a=Integer.parseInt(str1);
int b=Integer.parseInt(str2);
int c=a+b;
pw.println(c);
pw.close();


}

}
