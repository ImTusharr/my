/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-05-12 06:27:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class view_002dproducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

    // Establish a connection to your database
    String url = "jdbc:mysql://u95bkzftvx8tpees:XQG18W1E6DvpJgMSS77Y@bpgcz0m5wxumvwiokehb-mysql.services.clever-cloud.com:3306/bpgcz0m5wxumvwiokehb";
    //String user = "username";
   // String password = "password";
    Connection conn = DriverManager.getConnection(url);
    
    if(session.getAttribute("user") != null){
        String snm = session.getAttribute("snm").toString();
        String usnm = session.getAttribute("user").toString();
        System.out.println(usnm);

       
    
    // Retrieve the products from your database
    //Statement stmt = conn.createStatement();
    PreparedStatement pst;
   pst= conn.prepareStatement("Select * from products where user_name=?");
    pst.setString(1,usnm);
    ResultSet rs = pst.executeQuery();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>View Products</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Add some styles for your products table */\r\n");
      out.write("         {\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin: 20px 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        table {\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th, td {\r\n");
      out.write("            padding: 12px 15px;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            border-bottom: 1px solid #ddd;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:hover {\r\n");
      out.write("            background-color: #f5f5f5;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th {\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:nth-child(even) {\r\n");
      out.write("            background-color: #f2f2f2;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn {\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 8px 16px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            transition: background-color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn:hover {\r\n");
      out.write("            background-color: #45a049;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-secondary {\r\n");
      out.write("            background-color: #ccc;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-secondary:hover {\r\n");
      out.write("            background-color: #bbb;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-group {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-group .btn {\r\n");
      out.write("            float: none;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            border-radius: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-group .btn:first-child {\r\n");
      out.write("            border-top-left-radius: 4px;\r\n");
      out.write("            border-bottom-left-radius: 4px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-group .btn:last-child {\r\n");
      out.write("            border-top-right-radius: 4px;\r\n");
      out.write("            border-bottom-right-radius: 4px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .confirm-delete {\r\n");
      out.write("            display: none;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .confirm-delete p {\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .confirm-delete .btn {\r\n");
      out.write("            margin: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .animation-fade {\r\n");
      out.write("            animation: fade 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes fade {\r\n");
      out.write("            from { opacity: 0; }\r\n");
      out.write("            to { opacity: 1; }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <h1>View Products</h1>\r\n");
      out.write("    <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>ID</th>\r\n");
      out.write("            <th>Name</th>\r\n");
      out.write("            <th>Quantity</th>\r\n");
      out.write("            <th>Selling Price</th>\r\n");
      out.write("            <th>MRP</th>\r\n");
      out.write("            <th>Action</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
 while(rs.next()) { 
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print( rs.getString("proid") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getString("proname") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getInt("quantity") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getDouble("selling_Price") );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( rs.getDouble("mrp") );
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <a href=\"edit-product.jsp?proid=");
      out.print( rs.getString("proid") );
      out.write("\">\r\n");
      out.write("                        <button class=\"btn\">Edit</button>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <button class=\"btn\" onclick=\"confirmDelete('");
      out.print( rs.getString("proid") );
      out.write("')\">Remove</button>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        // Add a JavaScript function to confirm the product removal\r\n");
      out.write("        function confirmDelete(proid) {\r\n");
      out.write("            if (confirm(\"Are you sure you want to remove this product?\")) {\r\n");
      out.write("                window.location.href = \"remove-product.jsp?proid=\" + proid;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("       ");

    } else {
        
      out.write("\r\n");
      out.write("        <h2>Invalid session...</h2>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <p>You are not authorized to see this information.</p>\r\n");
      out.write("        <a href=\"login.html\">Login</a>\r\n");
      out.write("        ");

    }

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
