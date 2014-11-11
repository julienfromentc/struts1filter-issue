<%@ page language="java" 
         contentType="text/html; charset=utf-8"
         %>
<%@ taglib uri="/struts/tags-bean" prefix="bean"%>
<%@ taglib uri="/struts/tags-html" prefix="html"%>
<%@ taglib uri="/struts/tags-logic" prefix="logic"%>

<html>
<head>
	<title>Compose</title>
</head>
<body>
	<form name="myForm" action="<%=request.getContextPath()%>/submuit.do?dispatch=init" method="get">
		<div class="GeneralDivStyle FaxStatusPanel">
			<fieldset class="FieldsetStyle">
				<legend>
					Message
				</legend>
				<div id="statusMessage">
					<bean:write name="ResultForm" property="dispatch" />
				</div>
			</fieldset>
		</div>
		<div class="GeneralButtonStyle FaxStatusButtonPanel">
			<input type="submit" id="okBtn" class="buttons dojoLoad" value='Ok' tabindex="16">
		</div>
	</form>
</body>
</html>