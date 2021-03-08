package beans;

import java.util.ArrayList;

public class Database
{
	private ArrayList<Product> products;
	private ArrayList<User> users;
	
	public Database()
	{
		this.products = new ArrayList<Product>();
		products.add(new Product(1, "test", 1.0, "test"));
		this.users = new ArrayList<User>();
	}

	public ArrayList<Product> getProducts()
	{
		return products;
	}
	
	public int addProduct(Product product)
	{
		this.products.add(product);
		return products.size();
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
