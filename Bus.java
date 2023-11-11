package SpringAssignment;

public class Bus {
private String busName;
private String busColour;
private int busNum;

public Bus(String busName, String busColour, int busNum) {
	super();
	this.busName = busName;
	this.busColour = busColour;
	this.busNum = busNum;

}
@Override
public String toString() {
	return busName+" " + busColour+" "+busNum;
}
}
