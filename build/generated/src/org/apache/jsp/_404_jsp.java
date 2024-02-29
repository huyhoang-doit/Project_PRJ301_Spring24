package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/common/taglib.jsp");
    _jspx_dependants.add("/common/web/add_css.jsp");
    _jspx_dependants.add("/common/web/header.jsp");
    _jspx_dependants.add("/common/web/footer.jsp");
    _jspx_dependants.add("/common/web/add_js.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Clothes-Shop-404</title>\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets\\img\\favicon.png\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- all css here -->\r\n");
      out.write("       ");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets\\css\\plugin.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets\\css\\bundle.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets\\css\\style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets\\css\\responsive.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\">\r\n");
      out.write("<script src=\"assets\\js\\vendor\\modernizr-2.8.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("            <!-- Add your site or application content here -->\r\n");
      out.write("            \r\n");
      out.write("            <!--pos page start-->\r\n");
      out.write("            <div class=\"pos_page\">\r\n");
      out.write("                <div class=\"container\">  \r\n");
      out.write("                    <!--pos page inner-->\r\n");
      out.write("                    <div class=\"pos_page_inner\">  \r\n");
      out.write("                       <!--header area -->\r\n");
      out.write("                       ");
      out.write("\r\n");
      out.write("<div class=\"header_area\">\r\n");
      out.write("    <!--header top--> \r\n");
      out.write("    <div class=\"header_top\">\r\n");
      out.write("        <div class=\"row align-items-center\">\r\n");
      out.write("            <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                <!--                <div class=\"switcher\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li class=\"languages\"><a href=\"#\"><img src=\"assets\\img\\logo\\fontlogo.jpg\" alt=\"\"> English <i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("                                            <ul class=\"dropdown_languages\">\r\n");
      out.write("                                                <li><a href=\"#\"><img src=\"assets\\img\\logo\\fontlogo.jpg\" alt=\"\"> English</a></li>         \r\n");
      out.write("                                            </ul>   \r\n");
      out.write("                                        </li> \r\n");
      out.write("                \r\n");
      out.write("                                        <li class=\"currency\"><a href=\"#\"> Currency : $ <i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("                                            <ul class=\"dropdown_currency\">\r\n");
      out.write("                                                <li><a href=\"#\"> Dollar (USD)</a></li>\r\n");
      out.write("                                                <li><a href=\"#\"> Euro (EUR)  </a></li>\r\n");
      out.write("                                            </ul> \r\n");
      out.write("                                        </li> \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>-->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                <div class=\"header_links\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"contact.jsp\" title=\"Contact\">Contact</a></li>\r\n");
      out.write("                        <li><a href=\"wishlist.jsp\" title=\"wishlist\">My wishlist</a></li>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        <li><a href=\"cart.jsp\" title=\"My cart\">My cart</a></li>  \r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>   \r\n");
      out.write("            </div>\r\n");
      out.write("        </div> \r\n");
      out.write("    </div> \r\n");
      out.write("    <!--header top end-->\r\n");
      out.write("\r\n");
      out.write("    <!--header middel--> \r\n");
      out.write("    <div class=\"header_middel\">\r\n");
      out.write("        <div class=\"row align-items-center\">\r\n");
      out.write("            <!--logo start-->\r\n");
      out.write("            <div class=\"col-lg-3 col-md-3\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <a href=\"DispatchServlet\"><img src=\"assets\\img\\logo\\logo.jpg.png\" alt=\"\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--logo end-->\r\n");
      out.write("            <div class=\"col-lg-9 col-md-9\">\r\n");
      out.write("                <div class=\"header_right_info\">\r\n");
      out.write("                    <div class=\"search_bar\">\r\n");
      out.write("                        <form action=\"DispatchServlet\" method=\"get\" >\r\n");
      out.write("                            <input name=\"txtSearch\" value=\"\" placeholder=\"Search...\" type=\"text\">\r\n");
      out.write("                            <button name=\"btnAction\" value=\"Search\" type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"shopping_cart\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                           ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <!--mini cart-->\r\n");
      out.write("                        <div class=\"mini_cart\">\r\n");
      out.write("                            <div class=\"cart_item\">\r\n");
      out.write("                                <div class=\"cart_img\">\r\n");
      out.write("                                    <a href=\"#\"><img src=\"assets\\img\\cart\\cart.jpg\" alt=\"\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"cart_info\">\r\n");
      out.write("                                    <a href=\"#\">lorem ipsum dolor</a>\r\n");
      out.write("                                    <span class=\"cart_price\">$115.00</span>\r\n");
      out.write("                                    <span class=\"quantity\">Qty: 1</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"cart_remove\">\r\n");
      out.write("                                    <a title=\"Remove this item\" href=\"#\"><i class=\"fa fa-times-circle\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"cart_item\">\r\n");
      out.write("                                <div class=\"cart_img\">\r\n");
      out.write("                                    <a href=\"#\"><img src=\"assets\\img\\cart\\cart2.jpg\" alt=\"\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"cart_info\">\r\n");
      out.write("                                    <a href=\"#\">Quisque ornare dui</a>\r\n");
      out.write("                                    <span class=\"cart_price\">$105.00</span>\r\n");
      out.write("                                    <span class=\"quantity\">Qty: 1</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"cart_remove\">\r\n");
      out.write("                                    <a title=\"Remove this item\" href=\"#\"><i class=\"fa fa-times-circle\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"shipping_price\">\r\n");
      out.write("                                <span> Shipping </span>\r\n");
      out.write("                                <span>  $7.00  </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"total_price\">\r\n");
      out.write("                                <span> total </span>\r\n");
      out.write("                                <span class=\"prices\">  $227.00  </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"cart_button\">\r\n");
      out.write("                                <a href=\"checkout.jsp\"> Check out</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--mini cart end-->\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>     \r\n");
      out.write("    <!--header middel end-->      \r\n");
      out.write("    <div class=\"header_bottom\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <div class=\"main_menu_inner\">\r\n");
      out.write("                    <div class=\"main_menu d-none d-lg-block\">\r\n");
      out.write("                        <nav>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li class=\"active\"><a href=\"DispatchServlet\">Home</a></li>\r\n");
      out.write("                                <li><a href=\"ShopServlet\">SHOP</a></li>\r\n");
      out.write("                                <li><a href=\"contact.jsp\">contact us</a></li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--                    <div class=\"mobile-menu d-lg-none\">\r\n");
      out.write("                                            <nav>\r\n");
      out.write("                                                <ul>\r\n");
      out.write("                                                    <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("                                                    <li><a href=\"shop-list.jsp\">shop</a>\r\n");
      out.write("                                                        <div>\r\n");
      out.write("                                                            <div>\r\n");
      out.write("                                                                <ul>\r\n");
      out.write("                                                                    <li><a href=\"shop-list.html\">shop list</a></li>\r\n");
      out.write("                                                                    <li><a href=\"shop-fullwidth.html\">shop Full Width Grid</a></li>\r\n");
      out.write("                                                                    <li><a href=\"shop-fullwidth-list.html\">shop Full Width list</a></li>\r\n");
      out.write("                                                                    <li><a href=\"shop-sidebar.html\">shop Right Sidebar</a></li>\r\n");
      out.write("                                                                    <li><a href=\"shop-sidebar-list.html\">shop list Right Sidebar</a></li>\r\n");
      out.write("                                                                    <li><a href=\"single-product.html\">Product Details</a></li>\r\n");
      out.write("                                                                    <li><a href=\"single-product-sidebar.html\">Product sidebar</a></li>\r\n");
      out.write("                                                                    <li><a href=\"single-product-video.html\">Product Details video</a></li>\r\n");
      out.write("                                                                    <li><a href=\"single-product-gallery.html\">Product Details Gallery</a></li>\r\n");
      out.write("                                                                </ul>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>  \r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    <li><a href=\"contact.jsp\">contact us</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </nav>\r\n");
      out.write("                                        </div>-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("                        <!--header end -->\r\n");
      out.write("\r\n");
      out.write("                        <!--error section area start-->\r\n");
      out.write("                        <div class=\"error_section\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-12\">\r\n");
      out.write("                                    <div class=\"error_form\">\r\n");
      out.write("                                        <h1>404</h1>\r\n");
      out.write("                                        <h2>Opps! PAGE NOT BE FOUND</h2>\r\n");
      out.write("                                        <p>Sorry but the page you are looking for does not exist, have been<br> removed, name changed or is temporarity unavailable.</p>\r\n");
      out.write("                                        <form action=\"#\">\r\n");
      out.write("                                            <input placeholder=\"Search...\" type=\"text\">\r\n");
      out.write("                                            <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        <a href=\"index.html\">Back to home page</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--error section area end-->   \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--pos page inner end-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--pos page end-->\r\n");
      out.write("            \r\n");
      out.write("            <!--footer area start-->\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("<div class=\"footer_area\">\r\n");
      out.write("    <div class=\"footer_top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12\">\r\n");
      out.write("                    <div class=\"footer_widget\">\r\n");
      out.write("                        <h3>Clothes Shop</h3>\r\n");
      out.write("                        <p>Điểm đến hàng đầu cho những bộ trang phục nam đa dạng và phong cách. Khám phá ngay để tìm kiếm sự hoàn hảo cho phong cách của bạn!</p>\r\n");
      out.write("                        <div class=\"footer_widget_contect\">\r\n");
      out.write("                            <p><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>  Lô E2a-7, Đường D1, Khu Công nghệ cao, P.Long Thạnh Mỹ, Tp. Thủ Đức, TP.HCM.</p>\r\n");
      out.write("\r\n");
      out.write("                            <p><i class=\"fa fa-mobile\" aria-hidden=\"true\"></i> 0(1234) 567 890</p>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i> clotheshop@gmail.com </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer_bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row align-items-center\">\r\n");
      out.write("                <div class=\"col-lg-12 col-md-12\">\r\n");
      out.write("                    <div class=\"copyright_area align-items-center\">\r\n");
      out.write("                        <p>Copyright &copy; 2018 <a href=\"#\">Pos Coron</a>. All rights reserved. </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("            <!--footer area end-->\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("      \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- all js here -->\r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"assets\\js\\vendor\\jquery-1.12.0.min.js\"></script>\r\n");
      out.write("<script src=\"assets\\js\\popper.js\"></script>\r\n");
      out.write("<script src=\"assets\\js\\bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"assets\\js\\plugins.js\"></script>\r\n");
      out.write("<script src=\"assets\\js\\main.js\"></script>\r\n");
      out.write("<script src=\"assets\\js\\events.js\"></script>\r\n");
      out.write("<script src=\"https://www.google.com/recaptcha/api.js\" async defer></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li><a href=\"ProfileServlet\" title=\"My account\">My account</a></li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li><a href=\"DispatchServlet?btnAction=Login\" title=\"Login\">Login</a></li>  \r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.roleID == 1 ? 'AdminServlet' : 'ProfileServlet'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" \">Hello, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("!</a></li>\r\n");
        out.write("                            <li><a href=\"DispatchServlet?btnAction=Logout\">Logout</a></li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <a href=\"#\"><i class=\"fa fa-shopping-cart\"></i> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" Items <i class=\"fa fa-angle-down\"></i></a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <a href=\"#\"><i class=\"fa fa-shopping-cart\"></i> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CART.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<i class=\"fa fa-angle-down\"></i></a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }
}