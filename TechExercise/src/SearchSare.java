import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SimpleFormSearch")
public class SearchSare extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public SearchSare() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String keyword = request.getParameter("keyword");
      search(keyword, response);
   }

   void search(String keyword, HttpServletResponse response) throws IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "To Do's:";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + 
            "transitional//en\">\n"; 
      out.println(docType + 
            "<html>\n" + 
            "<head><title>" + title + "</title></head>\n" + 
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h1 align=\"center\">" + title + "</h1>\n");

      Connection connection = null;
      PreparedStatement preparedStatement = null;
      try {
         DBConnection.getDBConnection();
         connection = DBConnection.connection;

        String selectSQL = "SELECT * FROM myTable";
        preparedStatement = connection.prepareStatement(selectSQL);
         
         ResultSet rs = preparedStatement.executeQuery();

         while (rs.next()) {
            String userName = rs.getString("TODO").trim();
            String email = rs.getString("TAG").trim();


           out.println("Todo: " + userName + ", ");
           out.println("Tag: " + email + "<br>");
            
         }
         out.println("<a href=/TechExercise/simpleFormInsert.html>Insert more to do's</a> <br>");
         out.println("</body></html>");
         rs.close();
         preparedStatement.close();
         connection.close();
      } catch (SQLException se) {
         se.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (preparedStatement != null)
               preparedStatement.close();
         } catch (SQLException se2) {
         }
        
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}
