import javax.servlet.*;
import java.io.*;
import java.security.SecureRandom;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class register1 extends HttpServlet
{
    public void doGet (HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
     ResultSet rs;
     res.setContentType("text/html");
     String u=req.getParameter("Username");
     String e=req.getParameter("Email");
     String q=req.getParameter("security");
     String x=req.getParameter("answer");
     try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","");
    String sql="select Username from registeruservalues where Username=?";
    PreparedStatement stmt=con.prepareStatement(sql);
     stmt.setString(1,u);
     //stmt.setString(2,e);
  // Statement s=con.createStatement();
     rs=stmt.executeQuery();
    
    if(rs.next()){
  	 res.sendRedirect("wrong.html");
    }
   if(rs.next()==false){
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
String sql1="insert into registeruservalues values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
   PreparedStatement stmt1=con.prepareStatement(sql1);
   stmt1.setString(1,u);
   stmt1.setString(2,e);
  for(int m=0,l=3;m<9;l++,m++)
  {
      stmt1.setString(l,a[m]);
  }
   stmt1.setString(12,q);
   stmt1.setString(13,x);
     
   int i=stmt1.executeUpdate();
		if(i>0){
		PrintWriter out=res.getWriter();
                out.println("<center><h1>Welcome</h1></center>");
		out.println("<center><h1>You are successfully registered...</h1></center>");                
                                
                                String sql2="select * from registeruservalues where Username=?";
    PreparedStatement stmt4=con.prepareStatement(sql2);
    stmt4.setString(1,u);
    rs=stmt4.executeQuery();
    while(rs.next()){
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
            out.println("<h1>Grid Authentication </h1>");
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
            
    
		}
          }
   }
		con.close();
   	
		}catch (Exception e2) {
PrintWriter out=res.getWriter();
out.println(e2);}
		
		}

}
