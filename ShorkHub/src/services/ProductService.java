package services;

import java.util.ArrayList;

import beans.Database;
import beans.Product;

public class ProductService 
{
	static Database db = new Database();
	public int addProduct(Product product)
	{
		return db.addProduct(product);
	}
	
	public ArrayList<Product> showAllProducts()
	{
		return db.getProducts();
	}
}
