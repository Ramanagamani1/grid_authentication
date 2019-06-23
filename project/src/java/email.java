import javax.servlet.*;
import java.io.*;
import java.security.SecureRandom;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class email extends HttpServlet
{
    public void doGet (HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
     
     PrintWriter out=res.getWriter();
     res.setContentType("text/html");
     String e=req.getParameter("Email");
     try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","");
    String sql="select Email from registeruservalues where Email=?";
    PreparedStatement stmt=con.prepareStatement(sql);
     stmt.setString(1,e);
     ResultSet rs1;
     rs1=stmt.executeQuery();
    
    
   if(rs1.next()){
     String sql1="select squestion from registeruservalues where Email=?";
     PreparedStatement stmt1=con.prepareStatement(sql1);
     stmt1.setString(1,e);
     ResultSet rs2;
     rs2=stmt1.executeQuery();
     rs2.next();
     String z=rs2.getString(1);
     HttpSession s=req.getSession();
     s.setAttribute("question",z);
      HttpSession s1=req.getSession();
     s1.setAttribute("email",e);
     res.sendRedirect("email1.jsp");
          }
else
   {  
       
       out.println("<h1>wrong email</h1>");
   }
con.close();

   	
}
     catch (Exception e2) {

out.println(e2);}
		
		}

}
