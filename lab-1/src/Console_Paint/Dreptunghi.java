package Console_Paint;

public class Dreptunghi implements Shape {
	String fillColor;
	int borderWidth;
	int height;
	int width;
	
	
	public Dreptunghi(String fillColor, int borderWidth, int height, int width) {
		this.fillColor = fillColor;
		this.borderWidth = borderWidth;
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (int i = 0; i < height; i ++) {
			for (int j = 0; j < width; j ++) {
				System.out.print("#  ");
			}
			System.out.print("\n");
		}	
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		if (width > 0 && height > 0) {
			return width*height;
		} else {
			return 0;
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Dreptunghi";
	}

	@Override
	public String getHexFillColor() {
		// TODO Auto-generated method stub
		if (fillColor.charAt(0) != '#') {
			return "The color is not HEX";
		} else {
			return fillColor;
		}
	}

	@Override
	public int getBorderWidth() {
		// TODO Auto-generated method stub
		if (borderWidth > 0) {
			return borderWidth;
		} else {
			return 0;
		}
	}
}
