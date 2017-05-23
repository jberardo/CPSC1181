/**
* Class that simulates a door.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-20
*/

package question09;

import java.awt.Rectangle;

public class Door extends Rectangle {
	private String name;
	private String state;
	
	Door (String newName, String newState) {
		name = newName;
		state = newState;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void open() {
		state = "open";
	}
	
	public void close() {
		state = "close";
	}
	
	public String getState() {
		return state;
	}
	
	public boolean isOpen() {
		return (this.state == "open");
	}
}
