package video4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AnnotatedServlet", urlPatterns = {"/v4", "v4/test", "/video4", "/video4/*"})
public class AnnotatedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet in video4.AnnotatedServlet get called");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost in video4.AnnotatedServlet get called");
    }
}
