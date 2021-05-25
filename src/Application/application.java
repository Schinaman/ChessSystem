package Application;

import boardLayer.Position;

public class application {

	public static void main(String[] args) {
		Position position = new Position();
		position.setValues(1,2);
		System.out.println(position.toString());

	}

}
