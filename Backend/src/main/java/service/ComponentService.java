package service;

import java.util.List;

import model.Component;

public interface ComponentService {
	public void addComponets(List<Component> componentList, String emailId) throws Exception;

	public List<Component> getComponents(String emailId) throws Exception;

	public void updateComponents(List<Component> cnameList, String emailId);
}