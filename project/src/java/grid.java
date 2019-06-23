/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.*;
import java.io.*;
import java.security.SecureRandom;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class grid extends HttpServlet
{
    public void doGet (HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
     ResultSet rs;
     res.setContentType("text/html");
     String l1=req.getParameter("label1");
     String l2=req.getParameter("label2");
     String l3=req.getParameter("label3");
     String p1=req.getParameter("pass1");
     String p2=req.getParameter("pass2");
     String p3=req.getParameter("pass3");
     PrintWriter out1=res.getWriter();
     try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","");
    //Cookie c[]=req.getCookies();
    //String u=c[0].getValue();
    HttpSession s=req.getSession(false);
    String u=(String)s.getAttribute("name");
    
    String sql="select "+l1+","+l2+","+l3+" from registeruservalues where Username=?";
    PreparedStatement stmt=con.prepareStatement(sql);
    stmt.setString(1,u);
    rs=stmt.executeQuery();
    
    if(rs.next()){
        
         if((rs.getString(1).equals(p1))){
                 if((rs.getString(2).equals(p2))){
                     if((rs.getString(3).equals(p3)))
             out1.println("<center>");
             out1.println("<body background=\'discover-bg.jpg\'>");
             out1.println("<br><br><br>");
             out1.println("<h1>You are successfully authenticated</h1>");
             out1.println("<a href='index-4.jsp'><h2>Home</h2></a>");
             out1.println("</center>");
                 }
         }
         else{
             out1.println("<center>");
             out1.println("<body background=\'discover-bg.jpg\'>");
             out1.println("<h1>wrong password</h1>");
             out1.println("<a href='index.jsp'><h1>Login again</h1></a>");
             out1.println("<center>");
         }
    }
    else{
        //out1.println("wrong");
          res.sendRedirect("wronglogin.html");
    }
     }
      catch (Exception e2) {
PrintWriter out=res.getWriter();
out.println(e2);}
		
		}

}