package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.Orders;
import beans.User;


@ManagedBean
@ViewScoped
public class FormController 
{
	public String onSubmit(User user)
	{
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("orders", new Orders());
		return "TestResponse.xhtml";
	}
	public String onFlash(User user)
	{
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return "TestResponse2.xhtml";
	}
}
