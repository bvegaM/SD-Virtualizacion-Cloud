package gestion;

import java.util.List;

import javax.ejb.Local;

import modelo.Persona;

@Local
public interface GestionPersonaLocal {

	public void insertPersona(Persona p);
	public List<Persona> getPersonas();
}
