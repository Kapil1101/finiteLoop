package dao;

import java.util.List;

import model.Component;

public interface ComponentDao {

	public void addComponets(List<Component> componentList, String emailId) throws Exception;

	public List<Component> getComponents(String emailId) throws Exception;

	public void updateComponents(List<Component> cnameList, String emailId) throws Exception;

}