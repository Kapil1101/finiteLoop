package dao;

import model.User;

public interface UserDAO {

	 
	 public void addNewUser(User user) throws Exception;
	 public Boolean checkUserExistence(String emailId,String password) throws Exception;
	public Object login(String emailId, String password);
	
	 
}