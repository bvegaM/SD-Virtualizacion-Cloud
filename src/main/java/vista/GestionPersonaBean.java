package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import gestion.GestionPersonaLocal;
import modelo.Persona;

@ManagedBean
@ViewScoped
public class GestionPersonaBean {
	
	@Inject
	private GestionPersonaLocal gpl;
	
	private List<Persona> personaList;
	
	private Persona persona = new Persona();
	
	@PostConstruct
	public void init() {
		this.persona = new Persona();
		this.personaList=this.gpl.getPersonas();
	}

	public void savePersona() {
		this.gpl.insertPersona(this.persona);
		this.init();
	}
	
	public GestionPersonaLocal getGpl() {
		return gpl;
	}

	public void setGpl(GestionPersonaLocal gpl) {
		this.gpl = gpl;
	}

	public List<Persona> getPersonaList() {
		return personaList;
	}

	public void setPersonaList(List<Persona> personaList) {
		this.personaList = personaList;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	

}
