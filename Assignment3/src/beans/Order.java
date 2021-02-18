package beans;

public class Order
{
	private String orderNumber = "";
	private String productName = "";
	private double price = 0;
	private int quantity = 0;
	
	
	
	public String getOrderNumber()
	{
		return orderNumber;
	}
	
	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quanitity)
	{
		this.quantity = quanitity;
	}
	
}
