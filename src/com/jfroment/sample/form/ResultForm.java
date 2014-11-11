package com.jfroment.sample.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

public class ResultForm extends ValidatorForm {

	private static final long serialVersionUID = 2611202942240027209L;
	private String dispatch = "";

	public ResultForm() {
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
}