package SpringAssignment;

public class Address {

private String area;
private String city;
private String State;
//getters and setters
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
@Override
public String toString() {
	return "Address [area=" + area + ", city=" + city + ", State=" + State
			+ "]";
}


	}

