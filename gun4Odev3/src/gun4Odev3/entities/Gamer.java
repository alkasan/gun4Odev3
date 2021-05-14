package gun4Odev3.entities;

import java.time.LocalDate;

public class Gamer extends User{
	
	String firstName;
	String lastName;
	LocalDate dateofBirth;
	String nationalityId;
	
	
	public Gamer(int id, String eMail, String password, String firstName, String lastName, LocalDate dateofBirth,
			String nationalityId) {
		super(id, eMail, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.nationalityId = nationalityId;
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


	public LocalDate getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
