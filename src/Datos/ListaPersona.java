package Datos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;


import Persona.Pesona;
import Persona.TipoPersona;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="personas")
@SessionScoped
public class ListaPersona implements Serializable  {

	private static TipoPersona t = new TipoPersona(1,"Hombre");
private static final ArrayList<Pesona> persona = new ArrayList<Pesona>(Arrays.asList(new Pesona("Ariel",t)));
private static final long serialVersionUID = 1L;

private String nombre;
private int id;

public static TipoPersona getT() {
	return t;
}
public static void setT(TipoPersona t) {
	ListaPersona.t = t;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}

private String tipo;


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String insertar()
{	
	TipoPersona tip = new TipoPersona();	
	tip.setId(this.id);
	if(this.id==1)
	{
		tip.setTipo("Hombre");	
	}
	else
	{
		tip.setTipo("Mujer");
	}
	
	Pesona p = new Pesona(this.nombre,tip);	
	persona.add(p);
	return null;
}
public ArrayList<Pesona> getPersona() {
	return persona;
}

public static ArrayList<Pesona> Buscar(int id) {
    
    ArrayList<Pesona> arrayPersona= new ArrayList<Pesona>();
    for (Pesona pers : persona) {
        if (id==pers.getTipoPersona().getId()) {
        	arrayPersona.add(pers);                    
        }
    }
    return arrayPersona;
}

}
