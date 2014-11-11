<%@ page language="java" 
         contentType="text/html;charset=utf-8"
         import="org.apache.struts.util.*,
                 java.util.*,
                 org.apache.commons.beanutils.BeanUtils,
                 org.apache.struts.action.ActionForm"%>
         
<%@ taglib uri="/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="/struts/tags-html" prefix="html" %>
<%@ taglib uri="/struts/tags-logic" prefix="logic" %>
<html>
	<head>	
		<title>
			Compose
		</title>
	</head>
	<body>
	<form name="WebFaxComposeForm" id="compCreate" method="POST" action="/sample/submit.do" enctype="multipart/form-data">
			<input type="hidden" name="dispatch" value="addAttachment">
			<input type="hidden" name="from" value="sendFax">
			<div>
				<label for="faxNumber">Fax Number:&nbsp;</label>
				<input type="text" name="faxNumber" size="28" value="">
			</div>
			<div>
				<label for="document_to_attach">Attatchment</label>
				<input type="file" id="document_to_attach" name="attachment" class="file" size="102">
			</div>
			<button id="submit-fax-button" type="submit">
				Submit 
			</button>
		</form>
	</body>
</html>