package aurora_food_pantry;

import java.time.LocalDate;
import java.util.Date;

import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Volunteer {
	//Instance variables
	String firstName, lastName;
	LocalDate dob;
	String affiliation;
	boolean retired;
	String phone, email, street, city, state,
	emergencyName, emergencyPhone;
	String zip;
	LocalDate startDate;
	Date endDate;
	
	//Constructor
	public Volunteer(String firstName, String lastName, LocalDate dob, String affiliation, boolean retired, String phone,
			String email, String street, String city, String state, String emergencyName, String emergencyPhone,
			String zip, LocalDate startDate, Date endDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.affiliation = affiliation;
		this.retired = retired;
		this.phone = phone;
		this.email = email;
		this.street = street;
		this.city = city;
		this.state = state;
		this.emergencyName = emergencyName;
		this.emergencyPhone = emergencyPhone;
		this.zip = zip;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/*public Volunteer(String text, String text2, LocalDate value, String text3, String text4, String text5, String text6,
			String text7, String text8, String text9, String text10, String text11, String text12, String string,
			String string2) {
		// TODO Auto-generated constructor stub
	}*/

	public Volunteer() {
		// TODO Auto-generated constructor stub
	}

	//Getters and setters
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate localDate) {
		this.dob = localDate;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public boolean isRetired() {
		return retired;
	}

	public void setRetired(boolean retired) {
		this.retired = retired;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmergencyName() {
		return emergencyName;
	}

	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}

	public String getEmergencyPhone() {
		return emergencyPhone;
	}

	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String string) {
		this.zip = string;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate localDate) {
		this.startDate = localDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	//ToString
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", affiliation="
				+ affiliation + ", retired=" + retired + ", phone=" + phone + ", email=" + email + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", emergencyName=" + emergencyName + ", emergencyPhone="
				+ emergencyPhone + ", zip=" + zip + ", startDate=" + startDate + ", endDate=" + endDate;
	}
}
