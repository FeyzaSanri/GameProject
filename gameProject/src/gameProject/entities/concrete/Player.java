package gameProject.entities.concrete;

import java.time.LocalDate;

import gameProject.entities.abstracts.Entity;

public class Player implements Entity{
	    private int id;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String password;
	    private String nationalityId;
	    private LocalDate dateofBirth;
	    
	  public Player() {
		  
	  }

	public Player(int id, String firstName, String lastName, String email,String password, String nationalityId, LocalDate dateofBirth) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password=password;
		this.nationalityId = nationalityId;
		this.dateofBirth = dateofBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getemail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	
}
