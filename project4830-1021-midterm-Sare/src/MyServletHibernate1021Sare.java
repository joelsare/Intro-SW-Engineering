

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.MyEmployeeSare;
import util.UtilDB;
import util.UtilFile;

/**
 * Servlet implementation class MyServletHibernate1021Sare
 */
@WebServlet("/MyServletHibernate1021Sare")
public class MyServletHibernate1021Sare extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServletHibernate1021Sare() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List <String> arr = UtilFile.readFile(getServletContext(), "/WEB-INF/input.csv");
		PrintWriter out = response.getWriter();
		for (int i = 0; i < arr.size(); i++)
		{
			String[] s = arr.get(i).split(",");
			String fname = s[0];
			String lname = s[1];
			String phone = s[2];
			String email = s[3];
			UtilDB.createMyEmployeeSare(fname, lname, phone, email);
			//out.println(arr.get(i));
		}
		out.println("Answer to question 2");
		List<MyEmployeeSare> fromDB = UtilDB.listMyEmployeeSare();
		for (int i = 0; i < fromDB.size(); i++)
		{
			out.println(fromDB.get(i));
		}
		//out.println("Size of fromDB: " + fromDB.size());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
