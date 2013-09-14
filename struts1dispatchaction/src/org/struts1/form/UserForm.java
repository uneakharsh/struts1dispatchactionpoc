package org.struts1.form;

import org.apache.struts.action.ActionForm;

/*
 * author : Harsh Tomar
 * */

public class UserForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public UserForm(){
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
