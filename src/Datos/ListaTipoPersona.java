package Datos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Persona.TipoPersona;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="tipos")
@SessionScoped
public class ListaTipoPersona implements Serializable{

	private static final ArrayList<TipoPersona> tipoper = new ArrayList<TipoPersona>(Arrays.asList(new TipoPersona(1,"Hombre"),
			new TipoPersona(2,"Mujer")));	
	
	private List<TipoPersona> ti;
	
	public ListaTipoPersona() {
		this.ti = new ArrayList<>(2);
		this.ti.add(new TipoPersona(1,"Hombre"));
		this.ti.add(new TipoPersona(2,"Mujer"));
	}
	
	
	
	public List<TipoPersona> getTi() {
		return ti;
	}



	public void setTi(List<TipoPersona> ti) {
		this.ti = ti;
	}



	public static ArrayList<TipoPersona> getTipoper() {
		return tipoper;
	}



	private static final long serialVersionUID = 1L;
	
}
