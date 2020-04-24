package Console_Paint;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Shape> shapes = new ArrayList<>();
		
		
		Patrat square = new Patrat("#34abeb", 1, 4);
		square.draw();
		System.out.println(square.getArea());
		System.out.println(square.getName());
		System.out.println(square.getHexFillColor());
		if (square.getBorderWidth() > 0) {
			System.out.println("Border width: " + square.getBorderWidth());
		} else {
			System.out.println("The border must be greater than 0");
		}

		System.out.println("\n\n");

		Dreptunghi drept = new Dreptunghi("#34abeb",1, 4, 5);
		drept.draw();
		System.out.println(drept.getArea());
		System.out.println(drept.getName());
		System.out.println(drept.getHexFillColor());
		if (drept.getBorderWidth() > 0) {
			System.out.println("Border width: " + drept.getBorderWidth());
		} else {
			System.out.println("The border must be greater than 0");
		}
//
		System.out.println("\n\n");

		Cerc circle= new Cerc("#34abeb", 3,6);
		circle.draw();
		System.out.println(circle.getArea());
		System.out.println(circle.getName());
		System.out.println(circle.getHexFillColor());
		if (circle.getBorderWidth() > 0) {
			System.out.println("Border width: " + circle.getBorderWidth());
		} else {
			System.out.println("The border must be greater than 0");
		}
	}

}
