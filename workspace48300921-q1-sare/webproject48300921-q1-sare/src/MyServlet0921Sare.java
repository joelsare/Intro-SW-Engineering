import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServletSare")
public class MyServlet0921Sare extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   
   static String url = "jdbc:mysql://ec2-3-15-162-31.us-east-2.compute.amazonaws.com:3306/MyDB0921Sare";
   static String user = "joelsare remote";
   static String password = "chance915";
   static Connection connection = null;
   PreparedStatement preparedStatement = null;

   
   public MyServlet0921Sare() {
      super();
   }
   

   protected void doGet(HttpServletRequest request, HttpServletResponse response) //
         throws ServletException, IOException {
	   try {
	         Class.forName("com.mysql.jdbc.Driver");
	      } catch (ClassNotFoundException e) {
	         System.out.println("Where is your MySQL JDBC Driver?");
	         e.printStackTrace();
	         return;
	      }
      response.setContentType("text/html");
      String filename = "/Users/joel/Downloads/4830/workspace4830/workspace48300921-q1-sare/webproject48300921-q1-sare/src/input.csv";
      List<String> contents = UtilFile.readFile(filename);
      for (int i = 0; i < contents.size(); i++)
      {
    	  String s = contents.get(i);
    	  String [] arr = s.split(",");
    	  String firstName = arr[0];
    	  String lastName = arr[1];
    	  String phone = arr[2];
    	  String email = arr[3];

          Connection connection = null;
          String insertSql = " INSERT INTO MyTable0921Sare (id, FIRST_NAME, LAST_NAME, PHONE, EMAIL) values (default, ?, ?, ?, ?)";

          try {
             DBConnection.getDBConnection();
             connection = DBConnection.connection;
             PreparedStatement preparedStmt = connection.prepareStatement(insertSql);
             preparedStmt.setString(1, firstName);
             preparedStmt.setString(2, lastName);
             preparedStmt.setString(3, phone);
             preparedStmt.setString(4, email);
             preparedStmt.execute();
             connection.close();
          } catch (Exception e) {
             e.printStackTrace();
          }
	      //response.getWriter().println(s);
	      String selectSQL2 = "SELECT * FROM MyTable0921Sare";
	      Connection connection2 = null;
	      try {
	          DBConnection.getDBConnection();
	          connection2 = DBConnection.connection;

	
             preparedStatement = connection2.prepareStatement(selectSQL2);
	          
	          ResultSet rs = preparedStatement.executeQuery();

	          while (rs.next()) {
	             int id = rs.getInt("id");
	             firstName = rs.getString("FIRST_NAME").trim();
	             lastName = rs.getString("LAST_NAME").trim();
	             email = rs.getString("email").trim();
	             phone = rs.getString("phone").trim();

	          }
	             response.getWriter().println(firstName + " " + lastName + " " + email + " " + phone);

	          
	          rs.close();
	          preparedStatement.close();
	          connection2.close();
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
	          try {
	             if (connection2 != null)
	                connection.close();
	          } catch (SQLException se) {
	             se.printStackTrace();
	          }
	       }
      }
    	  
	      
      }




   /*
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html;charset=UTF-8");
	      
	      String filename = "/Users/joel/Downloads/4830/workspace4830/workspace48300921-q1-sare/webproject48300921-q1-sare/src/input.csv";
	      List<String> contents = UtilFile.readFile(filename);
	      for (int i = 0; i < contents.size(); i++)
	      {
	    	  String s = contents.get(i);
		      response.getWriter().append(s);
	      }

	      response.getWriter().println("-------- MySQL JDBC Connection Testing ------------<br>");
	      try {
	         Class.forName("com.mysql.cj.jdbc.Driver"); //old:com.mysql.jdbc.Driver
	      } catch (ClassNotFoundException e) {
	         System.out.println("Where is your MySQL JDBC Driver?");
	         e.printStackTrace();
	         return;
	      }
	      response.getWriter().println("MySQL JDBC Driver Registered!<br>");
	      connection = null;
	      try {
	         connection = DriverManager.getConnection(url, user, password);
	      } catch (SQLException e) {
	         System.out.println("Connection Failed! Check output console");
	         e.printStackTrace();
	         return;
	      }
	      if (connection != null) {
	         response.getWriter().println("You made it, take control your database now!<br>");
	      } else {
	         System.out.println("Failed to make connection!");
	      }
	      try {
	         String selectSQL = "SELECT * FROM myTable WHERE MYUSER LIKE ?";
	         String theUserName = "user%";
	         response.getWriter().println(selectSQL + "<br>");
	         response.getWriter().println("------------------------------------------<br>");
	         PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
	         preparedStatement.setString(1, theUserName);
	         ResultSet rs = preparedStatement.executeQuery();
	         while (rs.next()) {
	            String id = rs.getString("ID");
	            String username = rs.getString("MYUSER");
	            String email = rs.getString("EMAIL");
	            String phone = rs.getString("PHONE");
	            response.getWriter().append("USER ID: " + id + ", ");
	            response.getWriter().append("USER NAME: " + username + ", ");
	            response.getWriter().append("USER EMAIL: " + email + ", ");
	            response.getWriter().append("USER PHONE: " + phone + "<br>");
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   }
	   */


   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}