//1) Implement different types of dependency injections by using bean configuration.
//* Create Car Class and their properties with the help of the Setter dependency injection technique
//* Bus and their properties with the help of the Constructor dependency injection technique.

package SpringAssignment;

public class Car {
private String Car_Name;
private String colour;
private String model;

//Generating Setters and Getters

public String getCar_Name() {
	return Car_Name;
}

public void setCar_Name(String car_Name) {
	Car_Name = car_Name;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

@Override
public String toString() {
	return "Car [Car_Name=" + Car_Name + ", colour=" + colour + ", model=" + model + "]";
}

}
