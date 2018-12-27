package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import utils.ConnectionManager;
@WebServlet({ "/RegServlet", "/register" })
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection con;
	private static PreparedStatement stmt;
	private static ResultSet rs;
	private static RequestDispatcher rd;
	private User user;
	private PrintWriter out;
	private String sql = "insert into users values(?,?)";
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		con=ConnectionManager.getConnection();
		try {
			stmt=con.prepareStatement(sql);
			String uname=request.getParameter("username");
			String pwd=request.getParameter("password");
			String pwd2=request.getParameter("password2");
			if(pwd.equals(pwd2))
			{
				user=new User(uname,pwd);
				stmt.setString(1,uname);
				stmt.setString(2,pwd);
				int retval=stmt.executeUpdate();
				if (retval==1)
				{
					response.setContentType("text/html");
					out=response.getWriter();
					out.println("Succesful in registration");
					//request.setAttribute("UserObj", "user");
					rd=request.getRequestDispatcher("index.jsp");
					rd.include(request, response);
				}
				else
				{
					out.println("Oops..some error has occured!!");
					rd=request.getRequestDispatcher("Regform.jsp");
					rd.include(request, response);
				}
			}
			else
			{
				{
					out.println("Password MissMatch!! Try Again..");
					rd=request.getRequestDispatcher("Regform.jsp");
					rd.include(request, response);
				}
			}
			
			
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
