import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.UtilFile;

@WebServlet("/MyServletSare")
public class MyServletSare extends HttpServlet {
   private static final long serialVersionUID = 1L;
   private int [] nums = new int[5];
   private int index;
   private String largest = "0";
   private String current;
   
   public MyServletSare() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) //
         throws ServletException, IOException {
      response.setContentType("text/html");
      String filename = "/WEB-INF/numbers.csv";
      List<String> contents = UtilFile.readFile(getServletContext(), filename);
      for (int i = 0; i < nums.length; i++)
      {
    	  largest = "0";
	      for (int j = 0; j < contents.size(); j++)
	      {
	    	 current = contents.get(j);
	    	 if (Integer.parseInt(current) > Integer.parseInt(largest))
	    	 {
	    		 largest = current;
	    		 index = j;
	    	 }
	      }
	      nums[i] = Integer.parseInt(largest);
	      contents.set(index, "0");
      }
      String result = String.format("Top five numbers: %d, %d, %d, %d, %d", nums[0],nums[1],nums[2],nums[3],nums[4]);
      response.getWriter().append(result);
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}