package org.struts1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.struts1.form.UserForm;

/*
 * author : Harsh Tomar
 * */

public class UserAction extends DispatchAction {
	
	private final static String SUCCESS = "success";
	
	public ActionForward add(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse reponse){
		UserForm userForm = (UserForm)form;
		userForm.setMessage("From add method");
		return mapping.findForward(SUCCESS);		
	}
	
	public ActionForward delete(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse reponse){
		UserForm userForm = (UserForm)form;
		userForm.setMessage("From delete method");
		return mapping.findForward(SUCCESS);		
	}
	
	public ActionForward update(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse reponse){
		UserForm userForm = (UserForm)form;
		userForm.setMessage("From update method");
		return mapping.findForward(SUCCESS);		
	}
	
}
