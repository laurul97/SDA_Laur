package Lab4_Problema4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Shape> shapes = new ArrayList<>();
		
		
		Patrat square = new Patrat("#34abeb", 1, 4);
		Dreptunghi drept = new Dreptunghi("#010101",1, 4, 5);
		Cerc circle= new Cerc("#010101", 3,6);
		Patrat square1 = new Patrat("#34abeb", 1, 4);
		Patrat square2 = new Patrat("#34abeb", 1, 4);

		String [] colors = {square.getHexFillColor(),drept.getHexFillColor(),circle.getHexFillColor(),square1.getHexFillColor(),square2.getHexFillColor()};

		ArrayList uniqueColors = new ArrayList();

		for (int i = 0; i < colors.length; i++) {
			if (!uniqueColors.contains(colors[i])) {
				uniqueColors.add(colors[i]);
			}
		}

		int [] numberOfColors = new int[uniqueColors.size()];

		for (int i = 0; i < uniqueColors.size(); i++) {
			for (int j = 0; j < colors.length; j++) {
				if (uniqueColors.get(i) == colors[j]){
					numberOfColors[i]++;
				}
			}
		}

		for (int i = 0; i < uniqueColors.size(); i++) {
			System.out.println(uniqueColors.get(i) + " - " + numberOfColors[i]);
		}

//		System.out.println("\n");
//
//		square.draw();
//		System.out.println(square.getArea());
//		System.out.println(square.getName());
//		System.out.println(square.getHexFillColor());
//		if (square.getBorderWidth() > 0) {
//			System.out.println("Border width: " + square.getBorderWidth());
//		} else {
//			System.out.println("The border must be greater than 0");
//		}
//
//		System.out.println("\n\n");
//
//		drept.draw();
//		System.out.println(drept.getArea());
//		System.out.println(drept.getName());
//		System.out.println(drept.getHexFillColor());
//		if (drept.getBorderWidth() > 0) {
//			System.out.println("Border width: " + drept.getBorderWidth());
//		} else {
//			System.out.println("The border must be greater than 0");
//		}
//
//		System.out.println("\n\n");
//
//		circle.draw();
//		System.out.println(circle.getArea());
//		System.out.println(circle.getName());
//		System.out.println(circle.getHexFillColor());
//		if (circle.getBorderWidth() > 0) {
//			System.out.println("Border width: " + circle.getBorderWidth());
//		} else {
//			System.out.println("The border must be greater than 0");
//		}
	}

}