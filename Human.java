import java.util.Date;

public class Human {
	String fullName;
	private Date birthday;
	private String phone;
	private String city;
	private String country;
	private String address;
	int age;


	public Human(String fullName, Date birthday, String phone, String city, String country, String address) {
		super();
		this.fullName = fullName;
		this.birthday = birthday;
		this.phone = phone;
		this.city = city;
		this.country = country;
		this.address = address;
	}

	public Human(String fullName) {
		super();
		this.fullName = fullName;

	}

//	public boolean isAlive()
	
	
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("Full name ").append(this.fullName).append("\nBirthdate ").append(this.birthday);
		return buf.toString();
	}
}