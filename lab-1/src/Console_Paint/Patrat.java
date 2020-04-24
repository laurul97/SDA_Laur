package Console_Paint;

public class Patrat implements Shape{
	String fillColor;
	int borderWidth;
	int size;	
	
	public Patrat(String fillColor, int borderWidth, int size) {
		this.fillColor = fillColor;
		this.borderWidth = borderWidth;
		this.size = size;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i ++) {
			for (int j = 0; j < size; j ++) {
				System.out.print("#  ");
			}
			System.out.print("\n");
		}
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		if (size > 0 ){
			return size*size;
		} else {
			return 0;
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Patrat";
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

