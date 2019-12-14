package service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDAO;
import model.User;

@Service(value = "UserService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	public void addNewUser(User user) throws Exception {

		userDAO.addNewUser(user);
	}

	public Boolean checkUserExistence(String emailId, String password) throws Exception {
		return userDAO.checkUserExistence(emailId, password);
	}
//	public void login(String emailId, String password){
//		
//		return userDAO.login(emailId, password);
//	
//	}

}