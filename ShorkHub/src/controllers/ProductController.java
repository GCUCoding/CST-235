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
	static ProductService productService = new ProductService();
	@Inject
	ArrayList<Product> products;
	public ArrayList<Product> getProducts()
	{
		System.out.println(productService.showAllProducts());
		return productService.showAllProducts();
	}
	
	public String addProduct(Product product)
	{
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("product", product);
		System.out.println(productService.addProduct(product));
		return "Products.xhtml";
	}
}
