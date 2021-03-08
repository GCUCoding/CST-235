package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import beans.User;

public class UserService
{
	public boolean addUser(User user)
	{
		try {
            FileWriter writer = new FileWriter("RegisteredUsers.txt", true);
            BufferedWriter bw = new BufferedWriter(writer);
            PrintWriter pw = new PrintWriter(bw);
            pw.append("{\n");
            pw.append(user.getName() + "\n");
            pw.append(user.getId() + "\n");
            pw.append(user.getEmail() + "\n");
            pw.append(user.getBirthday() + "\n");
            pw.append(user.getUsername() + "\n");
            pw.append(user.getPassword() + "\n");
            pw.append("}\n");
            pw.close();
            return true;
            
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
	}
	
	public boolean validateUser(User user)
	{
		try {
		User checkUser = new User();
		Scanner fileIn = new Scanner(new File("RegisteredUsers.txt"));
		String currLine = "";
		while(fileIn.hasNextLine())
		{
			currLine = fileIn.nextLine();
			if(currLine.equals("{"))
			{
				checkUser.setName(fileIn.nextLine());
				checkUser.setId(Integer.valueOf(fileIn.nextLine()));
				checkUser.setEmail(fileIn.nextLine());
				checkUser.setBirthday(fileIn.nextLine());
				checkUser.setUsername(fileIn.nextLine());
				checkUser.setPassword(fileIn.nextLine());
			}
			if(checkUser.getUsername().equals(user.getUsername()) && user.getPassword().equals(checkUser.getPassword()))
			{
				return true;
			}
		}
		return false;
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
