import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name="BankServlet",urlPatterns = "/BankInterest")
public class BankServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
     double loanamount = Double.parseDouble(request.getParameter("loan amount"));
     double interestrate = Double.parseDouble(request.getParameter("interest rate"));
    int term = Integer.parseInt(request.getParameter("term"));
    double Profitamount = loanamount *interestrate*(term /360);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2> Profit amount ="+ Profitamount+"</h2>");
        writer.print("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double loanamount = Double.parseDouble(request.getParameter("loan amount"));
        double interestrate = Double.parseDouble(request.getParameter("interest rate"));
       double term = Double.parseDouble(request.getParameter("term"));
        double Profitamount = loanamount *interestrate*(term /360);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Profit amount ="+ Profitamount+"</h2>");
        writer.print("</html>");
    }
}
