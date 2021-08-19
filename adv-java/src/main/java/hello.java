import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class hello extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		out.println("Hello from servlet");
	}
}
