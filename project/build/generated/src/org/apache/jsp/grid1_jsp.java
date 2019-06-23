package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class grid1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Grid</title>\n");
      out.write("<style>\n");
      out.write("#div1 {margin:10px;font-size:1.25em;align:center;}\n");
      out.write("table {border-collapse:collapse;border:1px solid #7f7f7f;align:center;}\n");
      out.write("td {border:3px solid #000000;width:50px;height:50px;text-align:center;}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"discover-bg.jpg\">\n");
      out.write("<center>\n");
      out.write("<h1><b>WELCOME</b></h1><br/><br/>\n");
      out.write("<h1><font size=6>You have registered successfully</font></h1></center>\n");
      out.write("<br><br><br><br>\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"div1\">\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("var totalRows = 4;\n");
      out.write("var cellsInRow = 4;\n");
      out.write("var possible = \"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789\";\n");
      out.write("\n");
      out.write("\n");
      out.write("    function drawTable() {\n");
      out.write("        \n");
      out.write("        // get the reference for the body\n");
      out.write("        var div1 = document.getElementById('div1');\n");
      out.write(" \n");
      out.write("        // creates a <table> element\n");
      out.write("        var tbl = document.createElement(\"table\");\n");
      out.write(" \n");
      out.write("        // creating rows\n");
      out.write("        \n");
      out.write("         var i=0;\n");
      out.write("       for (var r = 0; r < 1; r++) {\n");
      out.write("            var row = document.createElement(\"tr\");\n");
      out.write("            var m=0;\n");
      out.write("            for (var c = 0; c <=cellsInRow; c++) {\n");
      out.write("                var cell = document.createElement(\"td\");\n");
      out.write("                cell.setAttribute('style', 'background-color:blue');\n");
      out.write("                var  cellText= document.createTextNode(String.fromCharCode(64+m));\n");
      out.write("                m=m+1;\n");
      out.write("                cell.appendChild(cellText);\n");
      out.write("                row.appendChild(cell);\n");
      out.write("            }           \n");
      out.write("        }\n");
      out.write("       tbl.appendChild(row);\n");
      out.write("\t     \n");
      out.write("        for (var r = 0; r < totalRows; r++) {\n");
      out.write("            var row = document.createElement(\"tr\");\n");
      out.write("\t     \n");
      out.write("\t     // create cells in row\n");
      out.write("           \n");
      out.write("           i=i+1;\n");
      out.write("           for(var c=0;c<1;c++){\n");
      out.write("               var cell=document.createElement(\"td\");\n");
      out.write("               cell.setAttribute('style', 'background-color:blue');\n");
      out.write("               var cellText=document.createTextNode(i);\n");
      out.write("               cell.appendChild(cellText);\n");
      out.write("               row.appendChild(cell);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           \n");
      out.write("             for (var c = 0; c < cellsInRow; c++) {\n");
      out.write("                var cell = document.createElement(\"td\");\n");
      out.write("\t\tgetRandom = Math.floor(Math.random() *possible.length);\n");
      out.write("                var text=\"\";\n");
      out.write("                for (var k = 0; k < 3; k++)\n");
      out.write("                text += possible.charAt(Math.floor(Math.random() * possible.length));\n");
      out.write("\n");
      out.write("                var  cellText= document.createTextNode(text);\n");
      out.write("                \n");
      out.write("                cell.appendChild(cellText);\n");
      out.write("                row.appendChild(cell);\n");
      out.write("            }           \n");
      out.write("            \n");
      out.write("\ttbl.appendChild(row); // add the row to the end of the table body\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("     div1.appendChild(tbl); // appends <table> into <div1>\n");
      out.write("}\n");
      out.write("window.onload=drawTable; \n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<h1>Grid Generation</h1>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
