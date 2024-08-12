import java.util.Objects;

public class Customer {
	private static int count;
	private int customerId;
	private String name;
	private String location;
	private String email;
	
	public static int getCount() {
		return count;
	}

	public void setCustomerId(int customerId){
		this.customerId = customerId;
	}
	
	public int getCustomerId() {
		return this.customerId;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	Customer(){
		this.customerId = 101;
		this.name = "Ram";
		this.location = "Bengaluru";
		this.email = "ram@gmail.com";
		count++;
	}
	Customer(int customerId,String name,String location,String email){
		this.customerId = customerId;
		this.name = name;
		this.location = location;
		this.email = email;
		count++;

	}

	public Customer(String name, String location, String email) {
		super();
		this.name = name;
		this.location = location;
		this.email = email;
		count++;

	}

	@Override
	public String toString() {
		return name + "\tLocation is " + location + "\t" + email ;
		 
	}
	
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(this.getClass() != obj.getClass()) return false;
		Customer customer = (Customer)obj;
		if(this.customerId == customer.customerId && this.name.equals(customer.name))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(this);
	}
