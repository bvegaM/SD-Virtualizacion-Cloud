package gestion;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.PersonaDAO;
import modelo.Persona;

@Stateless
public class GestionPersona implements GestionPersonaLocal {

	@Inject
	private PersonaDAO dao;
	
	@Override
	public void insertPersona(Persona persona) {
		dao.insert(persona);
	}

	@Override
	public List<Persona> getPersonas() {
		return dao.getPersonas();
	}

	public PersonaDAO getDao() {
		return dao;
	}

	public void setDao(PersonaDAO dao) {
		this.dao = dao;
	}
	
	
}
