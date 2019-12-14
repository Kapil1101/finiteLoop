package service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ComponentDao;
import model.Component;

@Service(value = "ComponetService")
@Transactional
public class ComponentServiceImpl implements ComponentService {

	@Autowired
	private ComponentDao componentDAO;

	public void addComponets(List<Component> componentList, String emailId) throws Exception {
		componentDAO.addComponets(componentList, emailId);
	}

	public List<Component> getComponents(String emailId) throws Exception {
		return componentDAO.getComponents(emailId);
	}

	public void updateComponents(List<Component> cnameList, String emailId) {
		try {
			componentDAO.updateComponents(cnameList, emailId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}