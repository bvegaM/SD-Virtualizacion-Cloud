package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Persona;

@Stateless
public class PersonaDAO {

	@Inject
	private EntityManager em;
	
	public void insert(Persona persona) {
		this.em.persist(persona);
	}
	
	public List<Persona> getPersonas(){
		String jpql="SELECT p FROM Persona p";
		Query query = this.em.createQuery(jpql,Persona.class);
		List<Persona> personaList = query.getResultList();
		return personaList;
	}
}
