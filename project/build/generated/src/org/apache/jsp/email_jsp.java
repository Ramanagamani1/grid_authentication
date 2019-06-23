package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class email_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Register</title>\n");
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
      out.write("<meta charset=\"utf-8\">\n");
      out.write("        \n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("       \n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<link rel=\"icon\" href=\"img/fav-icon.png\" type=\"image/x-icon\" />\n");
      out.write("        \n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        \n");
      out.write("<title>Bank - App Landing Page Template</title>\n");
      out.write("\n");
      out.write("       \n");
      out.write(" <!-- Icon css link -->\n");
      out.write("        \n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("       \n");
      out.write(" <link href=\"css/icofont.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!-- Bootstrap -->\n");
      out.write("        \n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!-- Rev slider css -->\n");
      out.write("        \n");
      out.write("<link href=\"vendors/revolution/css/settings.css\" rel=\"stylesheet\">\n");
      out.write("       \n");
      out.write(" <link href=\"vendors/revolution/css/layers.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("<link href=\"vendors/revolution/css/navigation.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("<link href=\"vendors/animate-css/animate.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!-- Extra plugin css -->\n");
      out.write("<link href=\"vendors/magnific-popup/magnific-popup.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("<link href=\"vendors/owl-carousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("<link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        \n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        \n");
      out.write("<script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        \n");
      out.write("<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        \n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<form name=\"f\" method=\"get\" action=\"email\">\n");
      out.write("<header class=\"dash_tp_menu_area\">\n");
      out.write("            \n");
      out.write("<nav class=\"navbar navbar-default\">\n");
      out.write("                \n");
      out.write("<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                \n");
      out.write("<div class=\"navbar-header\">\n");
      out.write("                    \n");
      out.write("<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                        \n");
      out.write("<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        \n");
      out.write("<span class=\"icon-bar\"></span>\n");
      out.write("                        \n");
      out.write("<span class=\"icon-bar\"></span>\n");
      out.write("                        \n");
      out.write("<span class=\"icon-bar\"></span>\n");
      out.write("                    \n");
      out.write("</button>\n");
      out.write("                    \n");
      out.write("              \n");
      out.write("</div>\n");
      out.write("<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    \n");
      out.write("<ul class=\"nav navbar-nav\">\n");
      out.write("                        \n");
      out.write("<li class=\"active\"><a href=\"index-4.jsp\">Home</a></li>\n");
      out.write(" \n");
      out.write("                      \n");
      out.write("<li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("                        \n");
      out.write("<li><a href=\"index.jsp\">Login</a></li>\n");
      out.write("                        \n");
      out.write("            \n");
      out.write("</ul>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("</header>\n");
      out.write("        \n");
      out.write("<div class=\"limiter\" id=\"id01\">\n");
      out.write("\t\t<div class=\"container-login100\" style=\"background-image: url('images/pink-footer-bg.jpg');\">\n");
      out.write("\t\t\t<div class=\"wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54\">\n");
      out.write("\t\t\t\t<form class=\"login100-form validate-form\">\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title p-b-49\">\n");
      out.write("\t\t\t\t\t       Enter your email\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t     <div class=\"wrap-input100 validate-input m-b-23\" data-validate = \"Email is required\">\n");
      out.write("\t\t\t\t\t\t<span class=\"label-input100\"><b>Email</b></span>\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"Email\"  placeholder=\"Email\" required />\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\" data-symbol=\"&#xf206;\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("\t\t\t\t\t<div class=\"container-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login100-form-bgbtn\"></div>\n");
      out.write("\t\t\t\t\t\t\t<button class=\"login100-form-btn\" >\n");
      out.write("                                                            SUBMIT</button>\n");
      out.write("\t\t\t\t\n");
      out.write("              </div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </form>\n");
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
