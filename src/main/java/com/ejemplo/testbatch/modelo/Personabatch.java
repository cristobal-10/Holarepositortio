package com.ejemplo.testbatch.modelo;

public class Personabatch {
	private int id;
	private String nombre;
	private String apepat;
	private String tel;
	
	//GENERAR LA SUPER CLASS
	public Personabatch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//FIELDS
	public Personabatch(int id, String nombre, String apepat, String tel) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apepat = apepat;
		this.tel = tel;
	}
	
	
	//GENERAR LOS SETTER AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApepat() {
		return apepat;
	}
	public void setApepat(String apepat) {
		this.apepat = apepat;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
