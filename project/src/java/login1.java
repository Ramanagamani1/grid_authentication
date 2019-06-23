/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class login1 extends HttpServlet
{
   public void doPost (HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
    res.setContentType("text/html");
    String u=req.getParameter("Username");
    
    try
  {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","");
      String sql="select Username from registeruservalues where Username=?";
      
     PreparedStatement stmt=con.prepareStatement(sql);
     stmt.setString(1,u);

      PrintWriter out=res.getWriter();
      ResultSet rs=stmt.executeQuery();
    
      if(rs.next()){
         if((rs.getString(1).equals(u))){
             HttpSession s=req.getSession();
             s.setAttribute("name",u);
           //  Cookie ck=new Cookie("name",u);
            //  res.addCookie(ck);
            out.println("<center>");
            out.println("<h1>Welcome  "+u+" </h1>");
            out.println("<br><br>");
            out.println("<body background=\'discover-bg.jpg\'>");
            out.println("<form action='grid.java'>");
            out.println("<a href='grid.jsp'style='font-size:20px; color:black'>SET OTP</a>");
            
            out.println("</form>");
            out.println("</body>");
            out.println("</center>");
            
         }
         else{
             out.println("<h1>login credentials are wrong</h1>");}
      }
      else{
          res.sendRedirect("wronglogin.jsp");}
   
}
  catch(Exception e2) {
PrintWriter out1=res.getWriter();
out1.println(e2);
}
    }
  }

