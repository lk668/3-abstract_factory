package Test;

public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapetype){
		return null; 
	}

	@Override
	public Color getColor(String colortype){
		switch (colortype){
			case "GREEN": return new Green();
			case "RED": return new Red();
		}
		return null;
	}
} 
