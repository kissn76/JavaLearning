package helloworld;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldHttpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * A configurable property 'name'.
     */
    @Property (name = "name")
    private String name;

    /**
     * @see HttpServlet#doGet(HttpServletRequest, HttpServletResponse)
     */
    @Override
    public final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String query = request.getQueryString();
        out.println("<html><body>Hello " + (query == null ? "World" : query) + " I'm " + this.name + "</body></html>");
        out.close();
    }

}
