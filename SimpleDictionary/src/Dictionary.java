import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


@WebServlet(name ="Dictionary",urlPatterns = "/Dictionary")
public class Dictionary extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    Map <String,String> dictionary = new HashMap<String,String>();
    dictionary.put("rice","com");
    dictionary.put("milk","sua");
    dictionary.put("cat","con meo");
    dictionary.put("summer","mua he");
       String serch = request.getParameter("WordSerch");
        PrintWriter writer = response.getWriter();
       writer.println("<html>");
       String result = dictionary.get(serch);
       if(result != null){
           writer.println("word :"+serch);
           writer.println("result:"+result);
       }else{
           writer.println("not found");
       }
       writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
