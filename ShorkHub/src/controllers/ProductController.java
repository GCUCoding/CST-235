package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.Product;
import services.ProductService;

@ManagedBean
@ViewScoped
public class ProductController 
{
	ProductService productService;
	
	public String showAllProducts(Product[] products)
	{
		
	}
}
