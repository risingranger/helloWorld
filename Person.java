
public class Person {
	private String name;
	private String phone;
	private String city;

	public Person() {
		super();
	}

	public Person(String name, String phone, String city) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	public String getName() { // methods/ behavior
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}