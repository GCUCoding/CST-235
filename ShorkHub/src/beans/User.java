package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class User 
{
	private int id;
	private String name;
	private String birthday;
	private String email;
	private String username;
	private String password;
	
	public User()
	{
		id = -1;
		name = "";
		birthday = "";
		email = "";
		username = "";
		password = "";
	}
	
	public User(int id, String name, String birthday, String email, String username, String password)
	{
		this.id = -1;
		this.name = name;
		this.birthday = birthday;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getBirthday() 
	{
		return birthday;
	}

	public void setBirthday(String birthday) 
	{
		this.birthday = birthday;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	
}
