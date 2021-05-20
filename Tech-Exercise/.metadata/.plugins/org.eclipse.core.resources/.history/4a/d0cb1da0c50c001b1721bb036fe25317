import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
   static Connection connection = null;

   static void getDBConnection() {

      connection = null;
      try {
         UtilProp.loadProperty();
         connection = DriverManager.getConnection(getURL(), getUserName(), getPassword());
      } catch (Exception e) {
         System.out.println("Connection Failed! Check output console");
         e.printStackTrace();
         return;
      }

      if (connection != null) {
         System.out.println("You made it, take control your database now!");
      } else {
         System.out.println("Failed to make connection!");
      }
   }

   static String getURL() {
      String url = UtilProp.getProp("url");
      System.out.println("[DBG] URL: " + url);
      return "jdbc:mysql://ec2-3-15-162-31.us-east-2.compute.amazonaws.com:3306/MyDB0921Sare";
   }

   static String getUserName() {
      String usr = UtilProp.getProp("user");
      System.out.println("[DBG] URL: " + usr);
      return "joelsare remote";
   }

   static String getPassword() {
      String pwd = UtilProp.getProp("password");
      System.out.println("[DBG] URL: " + pwd);
      return "chance915";
   }
}
