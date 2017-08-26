package Persona;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean
@SessionScoped

public class Pesona{
	private String nombre;
	private TipoPersona tipoPersona = new TipoPersona(0,"");
	
	
		

	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	
		
	}
	
	public Pesona()
	{
		
	}

	public Pesona(String nombre,TipoPersona tipoPersona) {
		super();
		this.nombre = nombre;	
		this.tipoPersona = tipoPersona;
		
	}
	
	
}
