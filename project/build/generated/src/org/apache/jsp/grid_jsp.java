package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;

public final class grid_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Grid</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\n");
      out.write("</head>\n");

    String x=(String)session.getAttribute("name");
    
    if(x!=null)
    {   
        HttpSession s=request.getSession(false);
        String s1=(String)s.getAttribute("name");
        out.println("welcome "+x);
        
            
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<form name=\"f\" method=\"get\" action=\"grid\">\n");
      out.write("\t<div class=\"limiter\" id=\"id01\">\n");
      out.write("\t\t<div class=\"container-login100\" style=\"background-image: url('images/pink-footer-bg.jpg');\">\n");
      out.write("\t\t\t<div class=\"wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54\">\n");
      out.write("\t\t\t\t<form class=\"login100-form validate-form\">\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title p-b-49\">\n");
      out.write("\t\t\t\t\t\tGrid Authentication\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("                                                   \t                  <div class=\"p-t-31 p-b-9\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1\">\n");
      out.write("\t\t\t\t\t\t        <b>Labels</b>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div  >\n");
      out.write("                                            <input  type=\"text\" class=\"wraps-input100\" name=\"label1\"  size=8 id=\"field10\" readonly=\"readonly\">\n");
      out.write("                                               <input  type=\"text\" class=\"wraps-input100\" name=\"label2\"  size=8 id=\"field11\"  readonly=\"readonly\">\n");
      out.write("                                              <input  type=\"text\" class=\"wraps-input100\" name=\"label3\"  size=8 id=\"field12\"  readonly=\"readonly\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                                           <div class=\"p-t-13 p-b-9\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1\">\n");
      out.write("\t\t\t\t\t\t\t<b>Password</b>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("                                                           </div>\n");
      out.write("\t\t\t\t\t<div class=\" validate-input\" data-validate = \"Password is required\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"pass1\" class=\"wraps-input100\" size=8 required/>\n");
      out.write("                                            <input  type=\"text\" name=\"pass2\" class=\"wraps-input100\"  size=8 required/>\n");
      out.write("                                         <input  type=\"text\" name=\"pass3\" class=\"wraps-input100\" size=8 required/>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t</div><br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            \t\t<div class=\"container-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login100-form-bgbtn\"></div>\n");
      out.write("\t\t\t\t\t\t\t<button class=\"login100-form-btn\" >\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.html\" style=\"font-size:15px; color:white\">SUBMIT</a>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><br><br/>\n");
      out.write("\n");
      out.write("                                                                         <div class=\"container-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login100-form-bgbtn\"></div>\n");
      out.write("\t\t\t\t\t\t\t<button class=\"login100-form-btn\" type=\"reset\" onclick=\"document.getElementById('id01').style.display='limiter'\">\n");
      out.write("\t\t\t\t\t\t\t\tCancel\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<div id=\"dropDownSelect1\"></div>\n");
      out.write("\t\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function randomNumber() {\n");
      out.write("    var min = 1;\n");
      out.write("    var max = 3;\n");
      out.write("    return Math.floor(Math.random() * (max - min + 1)) + min;\n");
      out.write("}\n");
      out.write("\n");
      out.write("document.getElementById('field10').value='A'+ randomNumber();\n");
      out.write("document.getElementById('field11').value='B'+ randomNumber();\n");
      out.write("document.getElementById('field12').value='C'+ randomNumber();\n");
      out.write("document.getElementById('field10').style.color=\"black\";\n");
      out.write("document.getElementById('field11').style.color=\"black\";\n");
      out.write("document.getElementById('field12').style.color=\"black\";\n");
      out.write("</script>\n");

    session.invalidate();
    }
else{
PrintWriter out1=response.getWriter();
out1.println("<h3 align='center'>Login please!!</h3>");
RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
rd.include(request, response);

}

      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
