package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 789648
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userin1 = request.getParameter("input1");
        String userin2 = request.getParameter("input2");
        if (userin1.compareTo("") != 0 || userin2.compareTo("") != 0){
            try {
                float input1 =  Float.parseFloat(userin1);
                float input2 =  Float.parseFloat(userin2);
                float output = 0;
                switch(request.getParameter("op")) {
                    case "+":
                        output = input1+input2;
                        break;
                    case "-":
                        output = input1-input2;
                        break;
                    case "*":
                        output = input1*input2;
                        break;
                    case "/":
                        output = input1/input2;
                        break;
                }
                request.setAttribute("output",output);
            } catch (NumberFormatException e) {
                request.setAttribute("output", "Invalid");
            }
        } else {
            request.setAttribute("output", "---");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }
    
    @Override
    public String getServletInfo() {
        return "Arithmetic";
    }// </editor-fold>

}
