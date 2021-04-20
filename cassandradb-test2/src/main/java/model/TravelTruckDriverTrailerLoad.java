package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class TravelTruckDriverTrailerLoad implements Serializable{

	public TravelTruckDriverTrailerLoad(String idtruck, String iddriver, String idtrailer, String registrationtagtruck,
			String registrationtagtrailer, String dni, int code_id, int code_load) {
		super();
		this.idtruck = idtruck;
		this.iddriver = iddriver;
		this.idtrailer = idtrailer;
		this.registrationtagtruck = registrationtagtruck;
		this.registrationtagtrailer = registrationtagtrailer;
		this.dni = dni;
		this.code_id = code_id;
		this.code_load = code_load;
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
	private int code_id;
	private int code_load;
	
	
	
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



	public int getCode_id() {
		return code_id;
	}



	public void setCode_id(int code_id) {
		this.code_id = code_id;
	}



	public int getCode_load() {
		return code_load;
	}



	public void setCode_load(int code_load) {
		this.code_load = code_load;
	}



	

}
