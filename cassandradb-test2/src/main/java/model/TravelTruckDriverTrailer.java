package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class TravelTruckDriverTrailer implements Serializable{

	public TravelTruckDriverTrailer(String idtruck, String iddriver, String idtrailer, String registrationtagtruck,
			String registrationtagtrailer, String dni) {
		super();
		this.idtruck = idtruck;
		this.iddriver = iddriver;
		this.idtrailer = idtrailer;
		this.registrationtagtruck = registrationtagtruck;
		this.registrationtagtrailer = registrationtagtrailer;
		this.dni = dni;
	}


	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private String idtruck;
	private String iddriver;
	private String idtrailer;
	private String registrationtagtruck;
	private String registrationtagtrailer;
	private String dni;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getIdtruck() {
		return idtruck;
	}


	public void setIdtruck(String idtruck) {
		this.idtruck = idtruck;
	}


	public String getIddriver() {
		return iddriver;
	}


	public void setIddriver(String iddriver) {
		this.iddriver = iddriver;
	}


	public String getIdtrailer() {
		return idtrailer;
	}


	public void setIdtrailer(String idtrailer) {
		this.idtrailer = idtrailer;
	}


	public String getRegistrationtagtruck() {
		return registrationtagtruck;
	}


	public void setRegistrationtagtruck(String registrationtagtruck) {
		this.registrationtagtruck = registrationtagtruck;
	}


	public String getRegistrationtagtrailer() {
		return registrationtagtrailer;
	}


	public void setRegistrationtagtrailer(String registrationtagtrailer) {
		this.registrationtagtrailer = registrationtagtrailer;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
