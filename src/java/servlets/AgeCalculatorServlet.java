package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * It do a thing
 * @author 789648
 */
public class AgeCalculatorServlet extends HttpServlet {
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userin = request.getParameter("input");
        if (userin.compareTo("") != 0) {
            try {
                int input =  Integer.parseInt(userin);
                request.setAttribute("output", "Your age next birthday will be "+ (++input));
            } catch (NumberFormatException e) {
                request.setAttribute("output", "You must enter a number.");
            }
        } else {
            request.setAttribute("output", "You must give your current age.");
        }
    getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
    }
    @Override
    public String getServletInfo() {
        return "Calculate Age Garbage";
    }// </editor-fold>

}
