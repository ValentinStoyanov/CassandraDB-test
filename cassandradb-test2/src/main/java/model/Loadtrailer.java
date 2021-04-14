package model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Loadtrailer implements Serializable{



	public Loadtrailer(String id, int code, int idload, String iddestiny, String idorigin, String brand,
			String registrationtag, String model, String chassisnumber, int load, String loadtype, String trailertype) {
		super();
		this.id = id;
		this.code = code;
		this.idload = idload;
		this.iddestiny = iddestiny;
		this.idorigin = idorigin;
		this.brand = brand;
		this.registrationtag = registrationtag;
		this.model = model;
		this.chassisnumber = chassisnumber;
		this.load = load;
		this.loadtype = loadtype;
		this.trailertype = trailertype;
	}

	private static final long serialVersionUID = 1L;
	
	@PrimaryKey 
	private String id = UUID.randomUUID().toString();
	private int code;
	private int idload;
	private String iddestiny;
	private String idorigin;
	private String brand;
	private String registrationtag;
	private String model;
	private String chassisnumber;
	private int load;
	private String loadtype;
	private String trailertype;
	
	public Loadtrailer() {
		
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getIdload() {
		return idload;
	}

	public void setIdload(int idload) {
		this.idload = idload;
	}

	public String getIddestiny() {
		return iddestiny;
	}

	public void setIddestiny(String iddestiny) {
		this.iddestiny = iddestiny;
	}

	public String getIdorigin() {
		return idorigin;
	}

	public void setIdorigin(String idorigin) {
		this.idorigin = idorigin;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRegistrationtag() {
		return registrationtag;
	}

	public void setRegistrationtag(String registrationtag) {
		this.registrationtag = registrationtag;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getChassisnumber() {
		return chassisnumber;
	}

	public void setChassisnumber(String chassisnumber) {
		this.chassisnumber = chassisnumber;
	}

	public int getLoad() {
		return load;
	}

	public void setLoad(int load) {
		this.load = load;
	}

	public String getLoadtype() {
		return loadtype;
	}

	public void setLoadtype(String loadtype) {
		this.loadtype = loadtype;
	}

	public String getTrailertype() {
		return trailertype;
	}

	public void setTrailertype(String trailertype) {
		this.trailertype = trailertype;
	}
	
}
