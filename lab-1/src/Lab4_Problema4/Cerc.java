package Lab4_Problema4;

public class Cerc implements Shape{
	String fillColor;
	int borderWidth;
	int radius;	
	
	
	public Cerc(String fillColor, int borderWidth, int radius) {
		super();
		this.fillColor = fillColor;
		this.borderWidth = borderWidth;
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (int i = -radius; i <= radius; i++) {
			for (int j = -radius; j <= radius; j++) {
				if (i*i + j*j <= radius*radius) {
					System.out.print(" # ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		if (radius > 0) {
			return radius * radius * Math.PI;
		} else {
			return 0;
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Cerc";
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
