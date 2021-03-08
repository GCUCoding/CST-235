package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;
import services.UserService;

@ManagedBean
@ViewScoped
public class FormController
{
	
	UserService userService;
	
	public String onLoginSubmit(User user)
	{
		userService = new UserService();
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		boolean loginSuccess = userService.validateUser(user);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("success", loginSuccess);
		if (loginSuccess)
		{
			return "LoginResponse.xhtml";
		}
		else
		{
			return "Login.xhtml";
		}
	}
	
	public String onRegistrationSubmit(User user)
	{
		
		userService = new UserService();
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		boolean successAdded = userService.addUser(user);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("success", successAdded);
		return "RegistrationResponse.xhtml";
	}
}
