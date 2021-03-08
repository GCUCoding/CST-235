package controllers;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Product;
import services.ProductService;

@ManagedBean
@ViewScoped
public class ProductController 
{
	ProductService productService;
	@Inject
	ArrayList<Product> products;
	public ArrayList<Product> getProducts()
	{
		return this.productService.showAllProducts();
	}
	
	public String addProduct(Product product)
	{
		productService.addProduct(product);
		return "Products.xhtml";
	}
}
