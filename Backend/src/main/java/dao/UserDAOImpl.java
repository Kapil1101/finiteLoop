package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.UserEntity;
import model.User;

@Repository(value = "UserDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addNewUser(User user) throws Exception {

		UserEntity userEntity = new UserEntity();

		userEntity.setEmail(user.getEmail());
		userEntity.setName(user.getName());
		userEntity.setPassword(user.getPassword());

		entityManager.persist(userEntity);
		
		return ;
	}

	@Override
	public Boolean checkUserExistence(String emailId, String password) throws Exception {

		UserEntity userEntity = entityManager.find(UserEntity.class, emailId);
		if (userEntity == null)
			return false;
		else
			return true;
	}

}