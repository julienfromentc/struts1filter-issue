package com.jfroment.sample.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.jfroment.sample.form.SubmitForm;

/**
 * This class is the <code>WebFaxComposerForm</code> controller.
 * 
 * @author Andre Morin
 * @version $Revision: 1.22.2.10 $
 * @see com.jfroment.sample.form.SubmitForm
 */
public class SubmitAction extends DispatchAction {

	public static final String RECIPIENTS = "recipients";

	public SubmitAction() {
		super();
	}

	public ActionForward init(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		ActionForward fwd = mapping.findForward("displayForm");
		return fwd;
	}

	public ActionForward displayForm(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("displayForm START");
		SubmitForm frm = (SubmitForm) form;
		frm.init(mapping, request);
		System.out.println("displayForm END");
		return mapping.getInputForward();
	}

	public ActionForward addAttachment(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("addAttachment");
		SubmitForm frm = (SubmitForm) form;

		if (frm.getFrom().equals("sendFax")) {
			System.out.println("addAttachment -> sendfax");
			return mapping.findForward("sendFax");
		} else {
			return mapping.getInputForward();
		}

	}

	public ActionForward sendFax(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("sendFax");
		ActionForward foo = mapping.findForward("sentStatus");
		return foo;
	}

}