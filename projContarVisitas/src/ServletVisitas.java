

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "visitas", urlPatterns = { "/visitas.do" })
public class ServletVisitas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int contador = 1;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println( "<html><body>"
				+ "<br>"
				+ this.contador++
				+ "</body></html>" );
	}

}
