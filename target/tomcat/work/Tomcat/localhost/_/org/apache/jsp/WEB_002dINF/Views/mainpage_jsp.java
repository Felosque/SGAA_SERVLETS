/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-29 21:59:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sgaa.server.dto.PetDTO;
import services.PetsServices;
import sgaa.server.dataStructure.Stack.IStackArray;

public final class mainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"../resources/img/SGAA.ico\">\n");
      out.write("\t<title>Menu Principal</title>\n");
      out.write("\t<link  href=\"/resources/css/mainpage.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\t<body style=\"background-color: #11CF0B;\"class=\"body\"  >\n");
      out.write("\t\n");
      out.write("\t<div id=\"titleDiv\">\n");
      out.write("\t<center><h1 class=\"form-signin-heading\" id=\"tittle\">SGAA</h1></center>\n");
      out.write("   \t<center><h6 class=\"form-signin-heading\" id=\"ptittle\">Sistema de Gestión de Animales en Adopción</h6></center>\n");
      out.write("   \t<br>\n");
      out.write("   \t</div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\n");
      out.write("\t<br>\n");
      out.write("\t<center><h3>TUS MASCOTAS</h3></center>\n");
      out.write("\t<br>\n");
      out.write("    <div class=\"btn-group\" role=\"group\" aria-label=\"Basic example\" id=\"btnGroup\">\n");
      out.write("\t\t<center>\n");
      out.write("\t\t<table id=\"tableBotons\" >\n");
      out.write("\t  \t\t<tr>\n");
      out.write("\t\t\t    <td>\n");
      out.write("\t\t\t\t    <form action=\"AddPetServlet.do\" method=\"get\">\n");
      out.write("\t\t\t\t    \t<input class=\"btn btn-primary\" type=\"submit\" value=\"Añadir mascota\">    \n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t    <td>\n");
      out.write("\t\t\t\t\t<form action=\"SearchPetServlet.do\" method=\"get\">\n");
      out.write("\t\t\t    \t\t<input class=\"btn btn-secondary\" type=\"submit\" value=\"Buscar mascota\">    \n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</td>\t\t\t\n");
      out.write("\t\t\t    <td>\n");
      out.write("\t\t\t\t\t<form action=\"login.do\" method=\"get\">\n");
      out.write("\t\t\t    \t\t<input class=\"btn btn-primary\" type=\"submit\" value=\"Cerrar sesión\">    \n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t  \t\t</tr>\n");
      out.write("\t\t</table></center>\n");
      out.write("\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div id=\"outer\">\n");
      out.write("      <div id=\"inner\"></div>\n");
      out.write("   \t</div>\n");
      out.write("      \n");
      out.write("    <table class=\"table\">\n");
      out.write("\t\t<thead class=\"table table-striped table-dark\">\n");
      out.write("\t\t  <tr>\n");
      out.write("\t\t    <th scope=\"col\">ID</th>\n");
      out.write("\t\t    <th scope=\"col\">Nombre</th>\n");
      out.write("\t\t    <th scope=\"col\">Color</th>\n");
      out.write("\t\t    <th scope=\"col\">Raza</th>\n");
      out.write("\t\t    <th scope=\"col\">Estado</th>\n");
      out.write("\t\t    <th><center>Acciones</center> </th>\n");
      out.write("\t\t    <th><center></center> </th>\n");
      out.write("\t\t  </tr>\n");
      out.write("\t\t</thead>\n");
      out.write("\t  \t<tbody>\n");
      out.write("\t  \t\n");
      out.write("\t\t");
 
		String mails = (String)request.getAttribute("mail");
		PetsServices petServices = new PetsServices();
		IStackArray<PetDTO> pets = petServices.getAllPets(mails);
		for(int i = 0; i < pets.size(); i++){ 
		
      out.write("\n");
      out.write("\t  \t\t<tr>\n");
      out.write("\t\t     \t<th scope=\"row\">");
      out.print( pets.get(i).getId() );
      out.write("</th>\n");
      out.write("\t      \t\t<td>");
      out.print( pets.get(i).getName());
      out.write("</td>\n");
      out.write("\t     \t\t<td>");
      out.print( pets.get(i).getColor() );
      out.write("</td>\n");
      out.write("\t     \t\t<td>");
      out.print( petServices.getBreed(pets.get(i).getBreed()) );
      out.write("</td>\n");
      out.write("\t     \t\t<td>");
      out.print( pets.get(i).isState());
      out.write("</td>\n");
      out.write("\t\t\t    <td>\n");
      out.write("\t\t\t\t\t<center>\n");
      out.write("\t\t\t\t\t<form action=\"ConstructionServlet.do\" method=\"get\">\n");
      out.write("\t\t\t\t\t  <input type=\"submit\" name=\"id\" id= ");
      out.print( pets.get(i).getId() );
      out.write(" class=\"btn btn-success\" value=");
      out.print( pets.get(i).getId() + "-"+ "Editar");
      out.write(">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</center>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td><center>\n");
      out.write("\t\t\t\t\t<form action=\"DeletePetServlet.do\" method=\"post\">\n");
      out.write("\t\t\t\t\t  <input type=\"submit\" name=\"id\" id= ");
      out.print( pets.get(i).getId() );
      out.write(" class=\"btn btn-danger\" value= ");
      out.print( pets.get(i).getId() + "-"+ "Eliminar");
      out.write(">\n");
      out.write("\t\t\t\t\t</form></center>\n");
      out.write("\t\t\t    </td>\n");
      out.write("\t\t    </tr>\n");
      out.write("\t\t");
} 
      out.write("\n");
      out.write("\n");
      out.write("\t  \t\t\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("\t<br><br><br><br><br><br>\n");
      out.write("\t\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
