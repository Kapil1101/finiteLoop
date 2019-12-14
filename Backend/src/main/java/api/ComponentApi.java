package api;

import java.util.List;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import model.Component;
import service.ComponentService;

@CrossOrigin
@RestController
@RequestMapping("ComponentAPI")
public class ComponentApi {

	@Autowired
	private ComponentService componentService;

	@Autowired
	private Environment environment;

	@PostMapping(value = "addComponents")
	public void addComponents(@RequestBody List<Component> componentList, String emailId) throws Exception {
		try {
			componentService.addComponets(componentList, emailId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "");
		}
	}

	@GetMapping(value = "addComponents")
	public ResponseEntity<List<Component>> getComponents(@RequestBody String emailId) throws Exception {
		try {
			return (ResponseEntity<List<Component>>) componentService.getComponents(emailId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "");
		}
	}

	@PutMapping(value = "updateComponents")
	public void updateComponents(@RequestBody List<Component> componentList, String emailId) throws Exception {
		try {
			componentService.updateComponents(componentList, emailId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "");
		}
	}

}