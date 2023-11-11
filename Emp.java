package SpringAssignment;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	@Autowired
	private Address address;

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	System.out.print("setting value");
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}
public Emp() {
	super();
}

}
