package com.jfroment.sample.form;

import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.apache.struts.validator.ValidatorForm;

public class SubmitForm extends ValidatorForm {
	private static final long serialVersionUID = -4364930120766277741L;

	private String dispatch = "";
	private String from = "";
	private String faxNumber = "";
	private Map<String, String[]> fileName = new TreeMap<String, String[]>();
	private transient FormFile attachment = null;

	public SubmitForm() {
		super();
	}

	public void init(ActionMapping actionMapping, HttpServletRequest request) {

	}

	public void setDispatch(String action) {
		this.dispatch = action;
	}

	public String getDispatch() {
		return dispatch;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public Map<String, String[]> getFileName() {
		return fileName;
	}

	public void setFileName(Map<String, String[]> fileName) {
		this.fileName = fileName;
	}

	public FormFile getAttachment() {
		return attachment;
	}

	public void setAttachment(FormFile attachment) {
		this.attachment = attachment;
	}

	public ActionErrors doValidate(ActionMapping actionMapping, HttpServletRequest request) {
		return new ActionErrors();
	}

}