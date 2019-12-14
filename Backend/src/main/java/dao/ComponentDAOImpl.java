package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import entity.ComponentEntity;
import entity.UserEntity;
import model.Component;

@Repository(value = "ComponentDao")
public class ComponentDAOImpl implements ComponentDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void addComponets(List<Component> ComponentList, String emailId) throws Exception {

		UserEntity userEntity = entityManager.find(UserEntity.class, emailId);
		List<ComponentEntity> componetEntityList = new ArrayList<>();

		for (Component component : ComponentList) {
			ComponentEntity componentEntity = new ComponentEntity();
			componentEntity.setCcolor(component.getCcolor());
			componentEntity.setCname(component.getCname());
			componentEntity.setCx(component.getCx());
			componentEntity.setCy(component.getCy());
			componentEntity.setData(component.getData());
			componetEntityList.add(componentEntity);
		}
		userEntity.setComponetEntityList(componetEntityList);
	}

	public List<Component> getComponents(String emailId) throws Exception {

		UserEntity userEntity = entityManager.find(UserEntity.class, emailId);
		List<ComponentEntity> componentEntityList = userEntity.getComponetEntityList();

		List<Component> componetList = new ArrayList<>();
		for (ComponentEntity Componententity : componentEntityList) {
			Component component = new Component();

			component.setCid(Componententity.getCid());
			component.setCcolor(Componententity.getCcolor());
			component.setCname(Componententity.getCname());
			component.setCx(Componententity.getCx());
			component.setCy(Componententity.getCy());
			component.setData(Componententity.getData());
			componetList.add(component);
		}

		return componetList;

	}


	public void updateComponents(List<Component> cnameList, String emailId) throws Exception {
		// TODO Auto-generated method stub
		
	}

}