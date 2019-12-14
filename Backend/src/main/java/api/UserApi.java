package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import model.User;
import service.UserService;

@RestController
@RequestMapping(path = "/UserApi")
public class UserApi {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/userSignUp")
	public void addNewUser(@RequestBody User user) throws Exception {
		try {
			userService.addNewUser(user);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "");
		}
	}
	
	@PostMapping(path = "/login")
	public void addNewUser(@RequestBody String name ,String password) throws Exception {
		try {
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "");
		}
	}	
}





