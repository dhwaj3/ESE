<%-- 
    Document   : index.jsp
    Created on : 7 Jan, 2014, 12:44:56 PM
    Author     : Dhwaj
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-\
    
    //W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<jsp:include page="webPagesPARTS/heading.jsp"/>
<body>
<div class="page-out">
<div class="page-in">
<div class="page">
<div class="main">
<div class="header">
<div class="header-top">
    <jsp:include page="webPagesPARTS/Head_and_IMAGE.jsp"/>
<div class="topmenu">
    <jsp:include page="webPagesPARTS/HeadMenu.jsp"/>
</div>
</div>
<div class="content">
<div class="content-left">
<div class="row1">
    <h1 class="title">SEARCH<span>PAGE</span></h1>
    <s:form action="searchtest">
        <s:textfield name="query"  label="SEARCH :-" size="50" tooltip="enter key word"/>
       <s:submit  label="search " />
    </s:form>
     
</div>
<div class="row2">
    <img src="images/alig.jpg" width="471" height="213" alt="alig"/>

</div>
</div>
<div class="content-right">
<div class="mainmenu">
<h2 class="sidebar1">Main Menu</h2>
<jsp:include page="webPagesPARTS/RightSideMENU.jsp"/>
</div>
<div class="contact">
<h2 class="sidebar2">Contact</h2>
<div class="contact-detail">
    <jsp:include page="webPagesPARTS/ContactDETAIL.jsp"/>
</div>
</div>
</div>
</div>
<div class="footer">
<!--DO NOT Remove The Footer Links-->
<!--Designed by--><a href="http://www.htmltemplates.net">
<img src="images/footnote.gif" class="copyright" alt="html templates"></a>
<!--In partnership with--><a href="http://websitetemplates.net">
<img src="images/footnote.gif" class="copyright" alt="website templates"></a>
<jsp:include page="webPagesPARTS/Footer.jsp"/>
</div>
</div>
</div>
</div>
</div>


</body></html>
