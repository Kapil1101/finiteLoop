package service;

import model.User;

public interface UserService {

	public void addNewUser(User user) throws Exception;

	public Boolean checkUserExistence(String emailId, String password) throws Exception;

	//WSpublic void login(String emailId, String password);
}