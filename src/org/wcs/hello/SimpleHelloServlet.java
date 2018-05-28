package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Get and validate name.
        String firstname = request.getParameter("firstname").trim();
        String lastname = request.getParameter("lastname").trim();
        String datehour = request.getParameter("datehour").trim();

        String message = "";
        if (firstname.isEmpty() || lastname.isEmpty() || datehour.isEmpty()) {
            message = "Please fill all fields";
        } else if (!datehour.matches("\\d+")) {
            message = "Hours must be in digits only";
        } else {
            int datehourValue = Integer.parseInt(datehour);

            String hello = "Good night";
            if (datehourValue >= 12 && datehourValue <= 19) {
                hello = "Good afternoon";
            } else if (datehourValue < 12 && datehourValue > 5) {
                hello = "Good morning";
            }

            message = String.format("%s %s %s", hello, firstname, lastname);
        }
        request.setAttribute("helloParam", message);
        this.getServletContext().getRequestDispatcher("/custom-hello.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
