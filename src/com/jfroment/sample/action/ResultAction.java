package com.jfroment.sample.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.jfroment.sample.form.ResultForm;

public class ResultAction extends DispatchAction {

	public ResultAction() {
		super();
	}

	public ActionForward displayForm(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		ResultForm frm = (ResultForm) form;
		frm.init(mapping, request);

		return mapping.getInputForward();
	}

}