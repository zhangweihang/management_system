/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2017-09-30 00:47:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.ihtc.manage_child.Child;

public final class all_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\tinput{\r\n");
      out.write("\t\tborder:none;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\twidth:100%;\r\n");
      out.write("\t\theight:100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.red{\r\n");
      out.write("\t\tbackground-color: red;\r\n");
      out.write("\t}\r\n");
      out.write("\ttr{\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tfunction searc() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar trs = document.getElementsByTagName(\"tr\");\r\n");
      out.write("\t\tconsole.log(trs);\r\n");
      out.write("\t\tvar str = document.getElementsByClassName(\"haha1\");\r\n");
      out.write("\t\tvar first = document.getElementsByClassName(\"first\");\r\n");
      out.write("\t\tvar second = document.getElementsByClassName(\"second\");\r\n");
      out.write("\t\tvar third = document.getElementsByClassName(\"third\");\r\n");
      out.write("\t\tvar fourth = document.getElementsByClassName(\"fourth\");\r\n");
      out.write("\t\tvar fifth = document.getElementsByClassName(\"fifth\");\r\n");
      out.write("\t\tvar sixth = document.getElementsByClassName(\"sixth\");\r\n");
      out.write("\t\tvar fs = new Array(first,second,third,fourth,fifth,sixth);\r\n");
      out.write("\t\tvar arr = new Array();\r\n");
      out.write("\t\tfor(var i = 0;i<str.length;i++){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(str[i].value == \"\"){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tarr[arr.length] = i;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i = 0;i<trs.length-3;i++){\r\n");
      out.write("\t\t\tvar bool = true;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfor(var j = 0;j<arr.length;j++){\r\n");
      out.write("\t\t\t\tconsole.log(fs[arr[j]]);\r\n");
      out.write("\t\t\t\tif(str[arr[j]].value != (fs[arr[j]][i]).value){\r\n");
      out.write("\t\t\t\t\tbool = false;\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(arr.length == 0){\r\n");
      out.write("\t\t\t\tbool = false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(bool){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\ttrs[i+2].setAttribute(\"class\",\"red\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\ttrs[i+2].setAttribute(\"class\",\"\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<table border=\"1px\" cellspacing=\"0\" style=\"width:1200px;text-align:center;\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<!-- <form action=\"search\" method=\"get\"> -->\r\n");
      out.write("\t\t\t<td><input type=\"text\" placeholder=\"请输入ID\" class=\"haha1\" /></td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" placeholder=\"请输入名字\" class=\"haha1\" /></td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" placeholder=\"请输入性别\" class=\"haha1\" /></td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" placeholder=\"请输入年龄\" class=\"haha1\" /></td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" placeholder=\"请输入监护人\" class=\"haha1\" /></td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" placeholder=\"请输入电话\" class=\"haha1\" /></td>\r\n");
      out.write("\t\t\t<td><button onclick=searc()>你随便输几个,点我查找</button>\r\n");
      out.write("\t\t<!-- </form> -->\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>编号</td>\r\n");
      out.write("\t\t\t<td>姓名</td>\r\n");
      out.write("\t\t\t<td>性别</td>\r\n");
      out.write("\t\t\t<td>年龄</td>\r\n");
      out.write("\t\t\t<td>监护人</td>\r\n");
      out.write("\t\t\t<td>电话</td>\r\n");
      out.write("\t\t\t<td>删除</td>\r\n");
      out.write("\t\t\t<td>操作</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form action=\"fadd\" method=\"get\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"请填入名字\" name=\"faddname\" /></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"请填入性别\" name=\"faddsex\" /></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"请填入年龄\" name=\"faddage\" /></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"请填入监护人\" name=\"fadd_name\" /></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" placeholder=\"请填入电话\" name=\"faddtel\" /></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" value=\"添加\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /all.jsp(112,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/all.jsp(112,2) '${myList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${myList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /all.jsp(112,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("l");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<form action=\"fup\" method=\"get\">\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td><input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"fid\" class=\"first\" /></td>\r\n");
          out.write("\t\t\t\t\t<td><input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"fname\" class=\"second\" /></td>\r\n");
          out.write("\t\t\t\t\t<td><input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.sex}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"fsex\" class=\"third\" /></td>\r\n");
          out.write("\t\t\t\t\t<td><input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.age}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"fage\" class=\"fourth\" /></td>\r\n");
          out.write("\t\t\t\t\t<td><input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.parent.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"f_name\" class=\"fifth\" /></td>\r\n");
          out.write("\t\t\t\t\t<td><input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.parent.tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"ftel\" class=\"sixth\" /></td>\r\n");
          out.write("\t\t\t\t\t<td><a href=\"dell?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" onclick=\"return confirm()\">删除</a></td>\r\n");
          out.write("\t\t\t\t\t<td><input type=\"submit\" value=\"修改\" /></td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t</form>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}