package filters;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class LogFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LogFilter() {
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
	
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	HttpServletRequest req=(HttpServletRequest)request;
	String un=req.getParameter("username");
	String pw=req.getParameter("password");
	String host=req.getRemoteHost();
	String uri=req.getRequestURI( );
long time=System.currentTimeMillis();
Date d1=new Date(time);
System.out.println("values are"+host+" "+uri+d1);

if(un.equals("admin")&& pw.equals("admin123"))
	
 	
		chain.doFilter(request, response);
else
	response.getWriter().println("<h2>Invalid  Credentials</h2> ");
	req.getRequestDispatcher("index.jsp").include(request,response);
	
	}
		

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
