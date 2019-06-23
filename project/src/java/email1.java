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
public class email1 extends HttpServlet
{
    public void doGet (HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
     ResultSet rs1;
     PrintWriter out=res.getWriter();
     HttpSession s1=req.getSession(false);
     String e=(String)s1.getAttribute("email");
     res.setContentType("text/html");
     String ans=req.getParameter("answer");
     try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","");
    String sql="select answer from registeruservalues where Email=?";
    PreparedStatement stmt=con.prepareStatement(sql);
     stmt.setString(1,e);
     
     rs1=stmt.executeQuery();
    rs1.next();
    
   if(rs1.getString(1).equals(ans)){
   
   String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
                SecureRandom rnd = new SecureRandom();
                
                // String randomString()

   
   String a[]=new String[9];
  for(int k=0;k<9;k++){ 
      StringBuilder sb = new StringBuilder(3);
   for( int j= 0; j < 3; j++ ){

      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
   a[k]= sb.toString();
}
  }
String sql5="UPDATE registeruservalues SET A1=?,B1=?,C1=?,A2=?,B2=?,C2=?,A3=?,B3=?,C3=? WHERE Email=?";
    PreparedStatement stmt3=con.prepareStatement(sql5);
    stmt3.setString(1,a[0]);
    stmt3.setString(2,a[1]);
    stmt3.setString(3,a[2]);
    stmt3.setString(4,a[3]);
    stmt3.setString(5,a[4]);
    stmt3.setString(6,a[5]);
    stmt3.setString(7,a[6]);
    stmt3.setString(8,a[7]);
    stmt3.setString(9,a[8]);
    stmt3.setString(10,e);
   
    stmt3.executeUpdate();

   String sql2="select * from registeruservalues where Email=?";
    PreparedStatement stmt4=con.prepareStatement(sql2);
    stmt4.setString(1,e);
    ResultSet rs;
    rs=stmt4.executeQuery();
    rs.next();
        
                out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Grid</title>\n" +
"<style>\n" +
"#div1 {margin:10px;font-size:1.25em;align:center;}\n" +
"table {border-collapse:collapse;border:1px solid #7f7f7f;align:center;}\n" +
"td {border:3px solid #000000;width:50px;height:50px;text-align:center;}\n" +
"\n" +"th {border:3px solid #000000;width:50px;height:50px;text-align:center;}\n" +
"</style>");
            out.println("<title>Servlet grid</title>");            
            out.println("</head>");
            out.println("<body background=\'discover-bg.jpg\'>");
            
             out.println("<center>");
            out.println("<h1>Your new Grid</h1>");
            out.println("<table>");
            out.println("<tr><th>*</th><th>A</th><th>B</th><th>C</th></tr>");
            out.println("<tr><th>1</th><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr>");
            
            out.println("<tr><th>2</th><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td></tr>");
            
            out.println("<tr><th>3</th><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td><td>"+rs.getString(11)+"</td></tr>");
            out.println("</table>");
             out.println("</center>");
            out.println("</body>");
            out.println("</html>");
            out.println("<a href=index.html><font size=6 color='black'>Login</font></a>");
            out.println("<h1 align='right'>Take a snapshot!</h1 >");
            out.println("<a href=index-4.html><font size=6 color='black'>Home</font></a>");
		//}
          }
else
   {
       out.println("<h1>wrong authentication</h1>");
   }
con.close();

   	
}
     catch (Exception e2) {

out.println(e2);}
		
		}

}
