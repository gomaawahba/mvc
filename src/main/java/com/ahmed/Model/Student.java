package com.ahmed.Model;



import java.util.HashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Student {

	@NotNull(message = "required")
	@Size(min = 1,message = "required")
	private String fName;
	
	private String lName;
	
	@NotNull(message = "required")
	@Min(value = 20 ,message = "must be grater than or equal 20")
	@Max(value = 50,message = "must be less than or equal 50")
	private String age;
	
	@NotNull(message = "required")

	private String indexCountry;
	
	@NotNull(message = "required")
	private Integer code;
	
	@NotNull(message = "required")
	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",
			 message = "Invalid Email")
	private String email;
	
	private String country;
	
	private String language;
	
	private String []players;
	
	private HashMap<String, String> countryOptions;
	
	
	public Student() {
		countryOptions = new HashMap<>();
		countryOptions.put("Egypt", "EG");
		countryOptions.put("Brazel", "BR");
		countryOptions.put("France", "FR");
		countryOptions.put("Germany", "GE");
		
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(HashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getIndexCountry() {
		return indexCountry;
	}

	public void setIndexCountry(String indexCountry) {
		this.indexCountry = indexCountry;
	}
	
	
}
