package beans;

import java.util.ArrayList;

public class Database
{
	private ArrayList<Product> products;
	private ArrayList<User> users;
	
	public Database()
	{
		this.products = new ArrayList<Product>();
		this.users = new ArrayList<User>();
	}

	public ArrayList<Product> getProducts()
	{
		return products;
	}
	
	public boolean addProduct(Product product)
	{
		this.products.add(product);
		return true;
	}
	
	public void setProducts(ArrayList<Product> products)
	{
		this.products = products;
	}

	public ArrayList<User> getUsers()
	{
		return users;
	}

	public void setUsers(ArrayList<User> users)
	{
		this.users = users;
	}
	
	
}
