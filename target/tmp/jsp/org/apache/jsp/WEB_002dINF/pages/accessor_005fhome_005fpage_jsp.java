/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2018-06-25 12:23:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accessor_005fhome_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/Users/elizaveta/.m2/repository/org/springframework/spring-webmvc/4.3.5.RELEASE/spring-webmvc-4.3.5.RELEASE.jar", Long.valueOf(1529790895000L));
    _jspx_dependants.put("jar:file:/Users/elizaveta/.m2/repository/org/springframework/spring-webmvc/4.3.5.RELEASE/spring-webmvc-4.3.5.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1482306802000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fbutton;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fbutton = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fspring_005fbutton.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>User page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_spring_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_spring_005fform_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_spring_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_spring_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fform_005f0.setParent(null);
    // /WEB-INF/pages/accessor_home_page.jsp(16,4) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fform_005f0.setModelAttribute("user");
    // /WEB-INF/pages/accessor_home_page.jsp(16,4) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fform_005f0.setMethod("post");
    // /WEB-INF/pages/accessor_home_page.jsp(16,4) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fform_005f0.setAction("/user-system/vacationRequest");
    int[] _jspx_push_body_count_spring_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fform_005f0 = _jspx_th_spring_005fform_005f0.doStartTag();
      if (_jspx_eval_spring_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_spring_005fbutton_005f0(_jspx_th_spring_005fform_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fform_005f0))
            return true;
          out.write("\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_spring_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_spring_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fbutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:button
    org.springframework.web.servlet.tags.form.ButtonTag _jspx_th_spring_005fbutton_005f0 = (org.springframework.web.servlet.tags.form.ButtonTag) _005fjspx_005ftagPool_005fspring_005fbutton.get(org.springframework.web.servlet.tags.form.ButtonTag.class);
    _jspx_th_spring_005fbutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fbutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
    int[] _jspx_push_body_count_spring_005fbutton_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fbutton_005f0 = _jspx_th_spring_005fbutton_005f0.doStartTag();
      if (_jspx_eval_spring_005fbutton_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Order vacation request");
          int evalDoAfterBody = _jspx_th_spring_005fbutton_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fbutton_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fbutton_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fbutton_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fbutton.reuse(_jspx_th_spring_005fbutton_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fform_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_005fform_005f1 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_spring_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fform_005f1.setParent(null);
    // /WEB-INF/pages/accessor_home_page.jsp(21,4) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fform_005f1.setModelAttribute("user");
    // /WEB-INF/pages/accessor_home_page.jsp(21,4) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fform_005f1.setMethod("get");
    // /WEB-INF/pages/accessor_home_page.jsp(21,4) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fform_005f1.setAction("/user-system/login");
    int[] _jspx_push_body_count_spring_005fform_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fform_005f1 = _jspx_th_spring_005fform_005f1.doStartTag();
      if (_jspx_eval_spring_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_spring_005fbutton_005f1(_jspx_th_spring_005fform_005f1, _jspx_page_context, _jspx_push_body_count_spring_005fform_005f1))
            return true;
          out.write("\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_spring_005fform_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fform_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fform_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fform_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_spring_005fform_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fbutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fform_005f1, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fform_005f1)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:button
    org.springframework.web.servlet.tags.form.ButtonTag _jspx_th_spring_005fbutton_005f1 = (org.springframework.web.servlet.tags.form.ButtonTag) _005fjspx_005ftagPool_005fspring_005fbutton.get(org.springframework.web.servlet.tags.form.ButtonTag.class);
    _jspx_th_spring_005fbutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fbutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f1);
    int[] _jspx_push_body_count_spring_005fbutton_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fbutton_005f1 = _jspx_th_spring_005fbutton_005f1.doStartTag();
      if (_jspx_eval_spring_005fbutton_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("logOut");
          int evalDoAfterBody = _jspx_th_spring_005fbutton_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_005fbutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fbutton_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fbutton_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fbutton_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fbutton.reuse(_jspx_th_spring_005fbutton_005f1);
    }
    return false;
  }
}
