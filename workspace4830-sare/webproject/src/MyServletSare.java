import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.UtilFile;

@WebServlet("/MyServletSmith")
public class MyServletSmith extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public MyServletSmith() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) //
         throws ServletException, IOException {
      response.setContentType("text/html");
      String filename = "/WEB-INF/numbers.csv";
      List<String> contents = UtilFile.readFile(getServletContext(), filename);
      for (String iLine : contents) {
         System.out.println(iLine);
      }
      response.getWriter().append(contents.size());
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}