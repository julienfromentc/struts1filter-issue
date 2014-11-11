<%-- --------------------------------------------------------------------------
Filename:         index.jsp

Description:      Login page.

Parameters:       none

TODO:             Client Update locale

-------------------------------------------------------------------------- --%>

<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%@ page contentType="text/html;charset=utf-8"
         import="java.util.*,
                 org.apache.struts.Globals" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <title>
        Sample App
        </title>
        
    </head>
<%
// Initializes the variables

response.sendRedirect(request.getContextPath() + "/submit.do?dispatch=init");
%>